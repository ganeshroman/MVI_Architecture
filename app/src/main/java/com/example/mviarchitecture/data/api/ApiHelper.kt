package com.example.mviarchitecture.data.api


import com.example.mviarchitecture.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}