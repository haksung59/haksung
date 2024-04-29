package org.example.fastcampus_redis.service

import com.google.gson.Gson
import org.example.fastcampus_redis.entity.UserProfile
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.ValueOperations
import org.springframework.stereotype.Service
import java.util.concurrent.TimeUnit

@Service
class UserService(
    private val redisTemplate: RedisTemplate<String, String>,
    private val externalApiService: ExternalApiService,
) {

    fun getUserProfile(userId: String): String? {
        val userName: String?

        val ops: ValueOperations<String, String> = redisTemplate.opsForValue()
        val cacheName = ops.get("nameKey:$userId")
        if(cacheName != null) {
            userName = cacheName
        }else {
            userName = externalApiService.getUserName(userId)
            ops.set("nameKey:$userId", userName, 5, TimeUnit.SECONDS)
        }

        val userAge = externalApiService.getUserAge(userId)

        val userProfile = UserProfile(userName, userAge)

        return Gson().toJson(userProfile)

    }

}