package com.study.jpapractice.service;

import com.study.jpapractice.common.SHA256;
import com.study.jpapractice.entity.User;
import com.study.jpapractice.repository.UserRepository;
import com.study.jpapractice.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    UserRepository repository;

    @Value("${spring.jwt.secretKey}")
    private String secretKey;

    private Long expiredMs = 1000 * 60 * 60l;

    @Transactional
    public String join(User user){

        if(repository.find(user.getUserId()) != null) {
            throw new RuntimeException(user.getUserId() + "은/는 이미 있습니다.");
        }

        repository.save(user);

        return "SUCCESS";

    }

    @Transactional
    public String login(User user){

        try {
            SHA256 sha256 = new SHA256();
            User tokenUser = repository.find(user.getUserId());
            if (tokenUser.getPassword().equals(sha256.encrypt(user.getPassword()))) {
                tokenUser.setPassword("");
                return JwtUtil.createJwt(user.getUserId(), secretKey, expiredMs);
            } else {
                return "ID 또는 비밀번호를 확인해 주세요.";
            }
        }catch(Exception e){
            return e.getMessage();
        }

    }

}
