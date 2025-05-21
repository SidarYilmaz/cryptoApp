package com.sidaryilmaz.btc.api

import retrofit2.http.GET


interface CryptoApi {
    @GET("api/v2/ticker")
    suspend fun getData(): CryptoModel

}