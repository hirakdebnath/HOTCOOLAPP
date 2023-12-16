package com.example.hotcoolapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var coolbtn=findViewById<Button>(R.id.btnCool)
        var hotbtn=findViewById<Button>(R.id.btnHot)
        var linerlayout= findViewById<LinearLayout>(R.id.linerlayout)

        coolbtn.setOnClickListener{
            val bluecolor=ContextCompat.getColor(this,R.color.blue)
        linerlayout.setBackgroundColor(bluecolor)
        }

        hotbtn.setOnClickListener{
            val redcolor=ContextCompat.getColor(this,R.color.red)
            linerlayout.setBackgroundColor(redcolor)

        }
    }
}