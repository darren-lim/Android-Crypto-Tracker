package com.example.cryptotracker.ui.ethgas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EthGasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is eth gas Fragment"
    }
    val text: LiveData<String> = _text
}