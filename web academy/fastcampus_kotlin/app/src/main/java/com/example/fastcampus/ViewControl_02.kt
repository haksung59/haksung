package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class ViewControl_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_control02)

        // 뷰를 코틀린 파일(Activity)로 가져오는 방법
        val textViewOne : TextView = findViewById(R.id.textViewOne)
        val buttonOne : Button = findViewById(R.id.buttonOne)
        Log.d("testt", textViewOne.text.toString())

        //Listener 사용방법
        buttonOne.setOnClickListener{
            // 버튼이 클릭되었을 때 동작할 코드
            Log.d("testt", "버튼 클릭 ㅎ.ㅎ")
        }

        //풀버전
        val clickListener = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d("testt", "메롱이다용")
            }
        }
        buttonOne.setOnClickListener(clickListener)

        //축약버전 1(익명함수)
        buttonOne.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d("testt", "메롱이다용22")
            }
        })
    }
}