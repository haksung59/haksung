package org.example.fastcampus_redis.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.connection.Message
import org.springframework.data.redis.connection.MessageListener
import org.springframework.data.redis.listener.ChannelTopic
import org.springframework.data.redis.listener.RedisMessageListenerContainer
import org.springframework.stereotype.Service
import java.util.*

@Service
class ChatService: MessageListener{

    @Autowired
    private lateinit var container: RedisMessageListenerContainer

    fun enterCharRoom(chatRoomName: String) {
        container.addMessageListener(this, ChannelTopic(chatRoomName))

        val scanner = Scanner(System.`in`)
        while (scanner.hasNextLine()) {
            val line = scanner.nextLine()
            if(line === "q"){
                println("Quit")
                break
            }
        }
    }

    override fun onMessage(message: Message, pattern: ByteArray?) {
        println("Message: $message")
    }
}