package com.hamza.testqr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val model: Model = intent.getParcelableExtra("extra")
        tv_parceler.text="title =  ${model.title} , amount = ${model.amount}"

    }
}
