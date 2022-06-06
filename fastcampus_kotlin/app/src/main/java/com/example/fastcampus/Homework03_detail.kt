package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Homework03_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework03_detail)

        val intent = intent
        val name :String = intent.extras?.getString("userName") ?: ""
        val ph : String = intent.extras?.getString("userPhoneNum") ?:""

        val userName = findViewById<TextView>(R.id.userName)
        val userPhoneNum = findViewById<TextView>(R.id.userPhoneNum)

        userName.text = name
        userPhoneNum.text = ph

    }
}