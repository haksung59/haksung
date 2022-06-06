package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Homework04_recyclerview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework04_recyclerview)

        val chatList = mutableListOf<Chat>()
        chatList.add(Chat("user1", "안녕하세요"))
        chatList.add(Chat("self", "네 안녕하세요"))
        chatList.add(Chat("user1", "반갑습니다."))
        chatList.add(Chat("self", "뭐해요"))
        chatList.add(Chat("user1", "너생각"))
        chatList.add(Chat("self", "헤헷"))
        chatList.add(Chat("user1", "뭐 이자식아"))
        chatList.add(Chat("self", "미안 ㅎ"))

        val chatRecyclerView = findViewById<RecyclerView>(R.id.chatRecyclerView)
        chatRecyclerView.adapter = ChatRecyclerViewAdapter(chatList, LayoutInflater.from(this))

    }
}

class ChatRecyclerViewAdapter(
    var chatList : MutableList<Chat>,
    var inflater: LayoutInflater
): RecyclerView.Adapter<ChatRecyclerViewAdapter.ChatViewHolder>(){

    inner class ChatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        // inner class
        // 아이템 뷰의 상세 뷰 컴포넌트를 홀드한다.
        val userImage: ImageView
        val chatDetail : TextView
        init{
            userImage = itemView.findViewById(R.id.userImage)
            chatDetail = itemView.findViewById(R.id.chatDetail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        var view = inflater.inflate(R.layout.chat_item, parent, false)

        chatList.forEach{
            if(it.user=="self"){
                view = inflater.inflate(R.layout.chatself_item, parent, false)
            }else {
                view = inflater.inflate(R.layout.chat_item, parent, false)
            }
        }
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatRecyclerViewAdapter.ChatViewHolder, position: Int) {
        holder.chatDetail.text = chatList.get(position).chatDetail
    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}

class Chat(val user:String, val chatDetail:String)