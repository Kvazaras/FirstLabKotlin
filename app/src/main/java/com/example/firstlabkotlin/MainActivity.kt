package com.example.firstlabkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvMain : TextView = findViewById(R.id.tvMain)

        val btnChangeText: Button = findViewById(R.id.btnChangeText)
        btnChangeText.setOnClickListener {
            tvMain.text = "Some Other Text"
        }
    }

    //Some redundant comment to demonstrate revert
}