package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHomework : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_homework)

        val chatList = mutableListOf<Chat2>()
        chatList.add(Chat2("안녕하세요", false))
        chatList.add(Chat2("안녕하세요2222", true))
        chatList.add(Chat2("안녕하세요", false))
        chatList.add(Chat2("안녕하세요", false))
        chatList.add(Chat2("안녕하세요222", true))
        chatList.add(Chat2("안녕하세요", false))
        chatList.add(Chat2("안녕하세요", false))

        val adapter = Chat2RecyclerAdapter(
            chatList = chatList,
            inflater = LayoutInflater.from(this@RecyclerViewHomework)
        )

        with(findViewById<RecyclerView>(R.id.recyclerViewChat)){
            this.layoutManager = LinearLayoutManager(this@RecyclerViewHomework)
            this.adapter = adapter
        }

        findViewById<Button>(R.id.button).setOnClickListener{
            adapter.chatList.add(2,Chat2("두번째입니다", false))
            adapter.notifyItemInserted(2)
        }

    }
}

class Chat2RecyclerAdapter(
    val chatList : MutableList<Chat2>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class RightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val rightTextView : TextView

        init {
            rightTextView = itemView.findViewById(R.id.chatTextRight)
        }
    }

    class LeftViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val leftTextView : TextView

        init {
            leftTextView = itemView.findViewById(R.id.chatTextLeft)
        }
    }

    override fun getItemViewType(position: Int): Int {
        when(chatList.get(position).is_right){
            true -> return 1
            false -> return 0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            1 -> return RightViewHolder(inflater.inflate(R.layout.chatitem_right, parent, false))
            else -> return RightViewHolder(inflater.inflate(R.layout.chatitem_right, parent, false))
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = chatList.get(position)
        when(chat.is_right){
            true -> (holder as RightViewHolder).rightTextView.text = chat.message
            false -> (holder as LeftViewHolder).leftTextView.text = chat.message
        }
    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}

class Chat2(val message:String, val is_right:Boolean)