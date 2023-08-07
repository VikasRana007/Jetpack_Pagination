package com.vikas.paginationjetpack.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface MyAPI {

    @GET("passenger")
    suspend fun getPassengersData(@Query("page") page: Int,
                                  @Query("size") size: Int = 10){}


}