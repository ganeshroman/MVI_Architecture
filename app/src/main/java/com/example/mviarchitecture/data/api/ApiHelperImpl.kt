package com.example.mviarchitecture.data.api

import com.example.mviarchitecture.data.model.User


class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}