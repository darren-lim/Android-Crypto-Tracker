package com.cryptoproject.ethtracker.view

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cryptoproject.ethtracker.R
import com.cryptoproject.ethtracker.contract.Contract
import com.cryptoproject.ethtracker.presenters.MainActivityPresenter

class MainActivity : AppCompatActivity(), Contract.MainView {
    private var presenter: MainActivityPresenter? = null
    private lateinit var mainGasFeeText: TextView
    private lateinit var usdFeeText: TextView
    private lateinit var estConfirmTimeText: TextView
    private lateinit var nextUpdateText: TextView

    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainGasFeeText = findViewById(R.id.mainGasFee)
        usdFeeText = findViewById(R.id.usdFee)
        estConfirmTimeText = findViewById(R.id.confirmationTime)
        nextUpdateText = findViewById(R.id.nextUpdate)

        presenter = MainActivityPresenter(this)
        initView()
    }

    override fun initView() {
        timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var seconds: Long = 0
                seconds = millisUntilFinished / 1000
                setNextUpdate(seconds.toInt())
            }

            override fun onFinish() {
                presenter!!.getNewGasFee()
                presenter!!.getEstimatedConfirmTime()
                timer.start()
            }
        }
        timer.start()
    }

    override fun onPause() {
        super.onPause()
        timer.cancel()
    }

    override fun onResume() {
        super.onResume()
        timer.start()
    }

    override fun setMainGasFee(fee: String) {
        mainGasFeeText.text = "$fee Gwei"
    }

    override fun setGasToUsdFee(usdFee: String) {
        usdFeeText.text = "~$$usdFee"
    }

    override fun setEstimatedConfirmationTime(string: String) {
        estConfirmTimeText.text = string
    }

    fun setNextUpdate(seconds: Int) {
        nextUpdateText.text = "Next Update In ${seconds}s"
    }
}