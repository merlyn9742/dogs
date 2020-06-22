package com.example.dogs.model

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DogsApi {

    @GET("DevTides/DogsApi/master/dogs.json")
    fun getDogs(): Single<List<DogBreed>>

    @POST("DevTides/DogsApi/master/dogs.json/{usuario}")
     fun postUser(@Path("usuario") usuario: String, @Body dato: String): Call<String>
}