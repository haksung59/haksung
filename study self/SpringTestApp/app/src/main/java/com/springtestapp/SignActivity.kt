package com.springtestapp

import android.app.AlertDialog
import android.content.DialogInterface
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

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService = retrofit.create(Service::class.java)

        findViewById<Button>(R.id.btnSignUp).setOnClickListener {
                val id = findViewById<EditText>(R.id.signId).text.toString()
                val pw = findViewById<EditText>(R.id.signPw).text.toString()
                val name = findViewById<EditText>(R.id.signName).text.toString()
                val sex = findViewById<EditText>(R.id.signSex).text.toString()

                val inputMember:Member = Member(id,pw,name,sex)
                Log.d("testt", inputMember.id)

                try{
                    retrofitService.sign(inputMember).enqueue(object : Callback<Member>{
                        override fun onResponse(call: Call<Member>, response: Response<Member>) {
                            if(response.isSuccessful){
                                val member:Member = response.body()!!

                                if(member.id==""){
                                    AlertDialog.Builder(this@SignActivity).setTitle("hi")
                                        .setMessage("다시 입력하렴")
                                        .setNegativeButton("확인", DialogInterface.OnClickListener { dialog, which ->
                                            dialog.cancel()
                                        })
                                        .show()
                                    Log.d("testt", "null")
                                }else {
                                    AlertDialog.Builder(this@SignActivity).setTitle("성공")
                                        .setMessage("회원가입 성공")
                                        .setNegativeButton("확인", DialogInterface.OnClickListener { dialog, which ->
                                            dialog.cancel()
                                        })
                                        .show()
                                    Log.d("testt", member.id + ", " + member.name)
                                }
                            }
                        }

                        override fun onFailure(call: Call<Member>, t: Throwable) {
                            Log.d("testt", "실패")
                        }

                    } )
                }catch(e:Exception){

                }
            }
        }

}