package com.example.my.kotlin_messengerpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onClick(p0: View?) {
        when(p0){
            button -> startActivity(Intent(this, Messenger_Main_View::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setText("Login")
        button.setOnClickListener(this)
    }
}
