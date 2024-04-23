package org.example.fastcampus_redis

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    lateinit var redisTemplate: RedisTemplate<String, String>

    @GetMapping("/setFruit")
    fun setFruit(@RequestParam name: String): String {
        var ops = redisTemplate.opsForValue()
        ops.set("fruit", name)

        return "saved."
    }

    @GetMapping("/getFruit")
    fun getFruit(@RequestParam name: String): String {
        var ops = redisTemplate.opsForValue()
        var fruitName: String = ops.get("fruit") ?: ""

        return fruitName
    }

}