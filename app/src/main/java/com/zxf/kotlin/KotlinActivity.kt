package com.zxf.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        helloWorld.text = "hello world"
        open_next.text = "Open Next Activity"
        open_next.setOnClickListener { startActivity(Intent(KotlinActivity@this,SecondActivity::class.java)) }
    }
}
