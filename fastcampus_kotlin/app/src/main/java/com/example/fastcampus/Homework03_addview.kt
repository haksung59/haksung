package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat

class Homework03_addview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework03_addview)

        var userList = mutableListOf<User>()

        for(i in 1..30){
            userList.add(User(""+i+"번째 사람", "010-0000-1111"))
        }

        val container = findViewById<LinearLayoutCompat>(R.id.container)
        val inflater = LayoutInflater.from(this@Homework03_addview)

        userList.forEach{
            val userItemView = inflater.inflate(R.layout.homework03_item, null)
            val userImage = userItemView.findViewById<ImageView>(R.id.userImage)
            val userName = userItemView.findViewById<TextView>(R.id.userName)
            val userPhoneNum = userItemView.findViewById<TextView>(R.id.userPhoneNum)

            userImage.setImageDrawable(resources.getDrawable(R.drawable.arrows, this.theme))
            userName.text = it.userName
            userPhoneNum.text = it.userPhoneNum

            userItemView.setOnClickListener {

            }

            container.addView(userItemView)

        }

    }
}

class User(val userName:String, val userPhoneNum:String)