package com.springtestapp

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService = retrofit.create(Service::class.java)

        findViewById<Button>(R.id.btnLogin).setOnClickListener{
            val id = findViewById<EditText>(R.id.inputId).text.toString()
            val pw = findViewById<EditText>(R.id.inputPw).text.toString()

            val inputMember:Member = Member(id,pw,"","")
            retrofitService.login(inputMember).enqueue(object :Callback<Member>{
                override fun onResponse(call: Call<Member>, response: Response<Member>) {
                    if(response.isSuccessful){
                        val member = response.body()!!

                        if(member.id==""){
                            AlertDialog.Builder(this@LoginActivity).setTitle("hi")
                                .setMessage("비밀번호가 틀렸습니다.")
                                .setNegativeButton("확인", DialogInterface.OnClickListener { dialog, which ->
                                    dialog.cancel()
                                })
                                .show()
                            Log.d("testt", "null")
                        }else {
                            Log.d("testt", member.id + ", " + member.name)
                        }
                    }
                }

                override fun onFailure(call: Call<Member>, t: Throwable) {
                    Log.d("testt", t.message.toString())
                }

            })
        }

        findViewById<Button>(R.id.btnSign).setOnClickListener {
            val intent = Intent(this@LoginActivity, SignActivity::class.java).apply {

            }
            startActivity(intent)
        }
    }
}