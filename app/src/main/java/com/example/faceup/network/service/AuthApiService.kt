package com.example.faceup.network.service

import com.example.faceup.network.models.login.LoginBody
import com.example.faceup.network.models.login.LoginResponse
import com.example.faceup.network.models.register.RegisterBody
import com.example.faceup.network.models.register.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApiService {

    @POST(LOGIN)
    suspend fun postLogin(@Body loginbody : LoginBody) : LoginResponse

    @POST(REGISTER)
    suspend fun postRegister(@Body registerbody :RegisterBody) : RegisterResponse

    companion object{
        const val LOGIN = "login"
        const val REGISTER = "register"
    }
}