package org.example.fastcampus_redis.service

import org.springframework.stereotype.Service

@Service
class ExternalApiService {

    fun getUserName(userId: String): String {

        val name = when(userId) {
            "haksung59" -> "Haksung Kim"
            "tester1" -> "Tester 1"
            else -> "Unknown"
        }

        return name
    }

    fun getUserAge(userId: String): Int {

        val age = when(userId) {
            "haksung59" -> 32
            "tester1" -> 29
            else -> 0
        }

        return age
    }

}