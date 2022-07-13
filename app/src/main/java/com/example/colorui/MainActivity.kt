package com.example.colorui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.colorui.util.toast

class MainActivity : AppCompatActivity() {


    lateinit var yellow: View
    lateinit var blue: View
    lateinit var red: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yellow = findViewById(R.id.yellow1)
        blue = findViewById(R.id.blue1)
        red = findViewById(R.id.red)

        blue.setOnClickListener {
            toast("Blue")
        }
        red.setOnClickListener {
            toast("Red")
        }
        yellow.setOnClickListener {
            toast("Yellow")
        }
    }
}