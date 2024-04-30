package org.example.fastcampus_redis

import org.example.fastcampus_redis.service.ChatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FastcampusRedisApplication: CommandLineRunner {

    @Autowired
    private lateinit var chatService: ChatService

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<FastcampusRedisApplication>(*args)
        }
    }

    override fun run(vararg args: String?) {
        println("Application started")

        chatService.enterCharRoom("chat1")
    }
}