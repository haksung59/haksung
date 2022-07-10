package com.springtestapp

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Service {

    @POST("/login")
    fun login(
        @Body member:Member
    ): Call<Member>

    @GET("/")
    fun hihi(
    ):Call<Member>

    @POST("/sign")
    fun sign(
        @Body member:Member
    ): Call<Member>

}