package com.hamza.testqr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val model = Model("hamza",15)
        btn_parceler.setOnClickListener {
        val intent = Intent(this, Main3Activity::class.java)
        intent.putExtra("extra", model)
          startActivity(intent)
        }
    }
}
