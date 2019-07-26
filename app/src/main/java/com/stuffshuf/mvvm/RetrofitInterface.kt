package com.stuffshuf.mvvm

import com.stuffshuf.mvvm.Models.User
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

@GET("")
fun dataInput(): Call<User>

}