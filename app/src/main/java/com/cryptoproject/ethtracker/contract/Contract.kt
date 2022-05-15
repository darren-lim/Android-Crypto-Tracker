package com.cryptoproject.ethtracker.contract

interface Contract {
    interface MainView {
        fun initView()
        fun setMainGasFee(fee: String)
        fun setGasToUsdFee(usdFee: String)
        fun setEstimatedConfirmationTime(time: String)
    }
    
    interface MainPresenter {
        fun getNewGasFee()
        fun getEstimatedConfirmTime()
    }

    interface MainModel {
        fun getGasFee(): String
        fun getEstimatedConfirmTime(): String
    }
}