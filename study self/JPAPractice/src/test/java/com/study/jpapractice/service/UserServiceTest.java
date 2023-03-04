package com.study.jpapractice.service;

import com.study.jpapractice.entity.User;
import com.study.jpapractice.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void testUser() throws Exception {
        //given
        User user = new User();
        user.setUserId("haksung59");
        user.setBirth("19930522");

        //when
        userRepository.save(user);
        User findUser = userRepository.find("haksung59");

        //then
        Assertions.assertThat(findUser.getUserId()).isEqualTo(user.getUserId());
        Assertions.assertThat(findUser.getBirth()).isEqualTo(user.getBirth());

    }

}