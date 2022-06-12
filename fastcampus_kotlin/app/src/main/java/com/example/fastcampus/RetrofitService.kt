package com.example.fastcampus

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

class StudentFromServer(
    val id:Int, val name:String, val age:Int, val intro:String
)

interface RetrofitService {

    @GET("json/students")
    fun getStudentsList(): Call<ArrayList<StudentFromServer>>

}