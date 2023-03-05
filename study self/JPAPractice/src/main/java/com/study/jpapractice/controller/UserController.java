package com.study.jpapractice.controller;

import com.study.jpapractice.entity.User;
import com.study.jpapractice.response.ResponseDto;
import com.study.jpapractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping ("/all/join")
    public String join(@RequestBody User user) throws Exception {
        return service.join(user);
    }

    @GetMapping ("/all/doubleCheck")
    public ResponseDto doubleCheck(@RequestParam String userId ) throws Exception {
        return service.doubleCheck(userId);
    }
    @PostMapping("/all/login")
    public String login(@RequestBody User user){
        return service.login(user);
    }

}
