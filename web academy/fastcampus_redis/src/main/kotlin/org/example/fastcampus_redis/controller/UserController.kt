package org.example.fastcampus_redis.controller

import org.example.fastcampus_redis.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController(
    private val userService: UserService,
    ) {

    @GetMapping("{userId}")
    fun getUserProfile(@PathVariable userId: String): String? {
        return userService.getUserProfile(userId)
    }

}