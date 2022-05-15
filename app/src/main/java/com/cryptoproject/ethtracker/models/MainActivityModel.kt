package com.cryptoproject.ethtracker.models

import com.cryptoproject.ethtracker.contract.Contract
import okhttp3.*
import okio.IOException

class MainActivityModel: Contract.MainModel {

    private val client = OkHttpClient()
    private val apiKey = "DAGDIGA8AEU31HSMEF89MUQDWQJD1TRXZ1"

    override fun getGasFee(): String {
        println("call get gas fee model")
        return "50"
//        val request = Request.Builder()
//            .url("https://api.etherscan.io/api?module=gastracker&action=gasoracle&apikey=$apiKey")
//            .build();
//
//        client.newCall(request).execute().use { response ->
//            if (!response.isSuccessful) throw IOException("Unexpected code $response")
//
//            println(response.body!!.string())
//            return response.body.toString()
//        }
    }

    override fun getEstimatedConfirmTime(): String {
        println("call get estimated confirm time model")
        return "200"
    }
}