package com.plcoding.retrofitcrashcourse

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET(":3001/get_produkte")
    suspend fun getTodos(): Response<List<Todo>>

}