package com.example.cryptotracker.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CryptoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Crypto Item"
    }
    val text: LiveData<String> = _text
}