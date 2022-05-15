package com.cryptoproject.ethtracker.presenters

import com.cryptoproject.ethtracker.contract.Contract
import com.cryptoproject.ethtracker.models.MainActivityModel

class MainActivityPresenter(private var view: Contract.MainView): Contract.MainPresenter {

    private var model: Contract.MainModel = MainActivityModel()

    init {
        view.initView()
    }

    override fun getNewGasFee() {
        println("call get new gas fee")
        val gas = model.getGasFee()

        // do some math, get the usd fee
        println("do some math")

        view.setMainGasFee(gas)
        view.setGasToUsdFee("1.5")
    }

    override fun getEstimatedConfirmTime() {
        println("call get estimated confirm time")
        val time = model.getEstimatedConfirmTime()

        // do some math, change time or whatever
        println("do some math confirm time")

        view.setEstimatedConfirmationTime("1 minute 3 seconds")
    }

}