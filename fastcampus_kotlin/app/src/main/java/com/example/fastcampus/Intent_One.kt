package com.example.fastcampus

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class Intent_One : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_one)

        //암시적 인텐트
        // - 전화, SMS, Google Play Store, Website, Googlemap, 사진첩 등등
        // - 상수
        //     - 변하지 않는 수(문자)
        //     - 상수는 all 대문자로 해주는게 국룰
        //  - URI (Uniform Resource Identifier)
        //      - id와 비슷한 느낌 -> 고유하다
        //      - 자원을 나타내는 주소
        //      - URL
        //          - 인터넷 페이지의 고유한 주소
        val implicit_intent : TextView = findViewById(R.id.implicit_intent)
        implicit_intent.setOnClickListener {
            val intent : Intent = Intent(Intent.ACTION_DIAL,
                                    Uri.parse("tel:" + "010-8207-2505"))
            startActivity(intent)
        }
        //명시적 인텐트 + ComponentName -> 액티비티 전환
        val intent_one : TextView = findViewById(R.id.intent_one)
        intent_one.setOnClickListener {
            val intent : Intent = Intent()
            val componentName:ComponentName = ComponentName(
                "com.example.fastcampus",
                "com.example.fastcampus.Intent_Two"
            )
            intent.component = componentName
            startActivity(intent)
        }

        //명시적 인텐트 -> 액티비티 전환
        //Context
        //  -문맥
        // A액티비티 -> B액티비티
        (findViewById<TextView>(R.id.intent_two)).apply{
            this.setOnClickListener{
                startActivity(
                    Intent(this@Intent_One, Intent_Two::class.java)
                )
            }
        }
        // 명시적 인텐트 + data 전달
        (findViewById<TextView>(R.id.intent_three)).apply{
            this.setOnClickListener{
                val intent = Intent(this@Intent_One, Intent_Two::class.java)
                intent.putExtra("extra-data", "data-one")
                startActivity(intent)
            }
        }
        // 명시적 인텐트 + 결과 받기
        // requestCode
        // - 구분을 하기 위해서
        // - Intent_One -> Intent_Two(request 1)
        // - Intent_One -> Intent_Three(request 2)
        // - Intent_One -> Intent_Four(request 3)
        (findViewById<TextView>(R.id.intent_four)).apply{
            this.setOnClickListener{
                val intent = Intent(this@Intent_One, Intent_Two::class.java)
                startActivityForResult(intent, 1) //deprecated 되었다. 보통 상수로 관리
            }
        }
        // 명시적 인텐트 + 결과받기 (ActivityResult API)
        // -> requestCode가 존재하지 않는다.
        // -> requestCode 없이도 요청자를 구분할 수 있다.
        val startActivityLauncher : ActivityResultLauncher<Intent> =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                // onActivityResult에 해당하는 부분
                when(it.resultCode){
                    RESULT_OK->{
                        Log.d("dataa", it.data?.extras?.getString("result")!!)
                    }
                }
                //onActivityResult
                // - 모든 intent가 한 곳에서 처리된다 -> 구분이 필요하다(request code)
                //ActivityResult API
                // - 각각의 intent가 처리되는 곳이 별도로 있다 -> 구분이 필요없다.
            }

        (findViewById<TextView>(R.id.intent_five)).apply{
            this.setOnClickListener{
                val intent = Intent(this@Intent_One, Intent_Two::class.java)
                startActivityLauncher.launch(intent) //deprecated 되었다. 보통 상수로 관리
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //resultCode (status code)
        // - 최종결과
        // - 성공, 실패
        when(requestCode){
            1 -> {
                when(resultCode){
                    RESULT_OK -> {
                        val data:String? = data?.extras?.getString("result")
                        Log.d("dataa", data!!)
                    }
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}