package com.sidaryilmaz.btc.repository

import com.sidaryilmaz.btc.api.CryptoApi
import com.sidaryilmaz.btc.api.CryptoModel
import com.sidaryilmaz.btc.api.RetrofitInstance

class CryptoRepository {
    private val api= RetrofitInstance.api

    suspend fun getData(): CryptoModel {
        return api.getData()
    }
}
