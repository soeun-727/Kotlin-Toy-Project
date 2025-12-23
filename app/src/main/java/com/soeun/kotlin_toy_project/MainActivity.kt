package com.soeun.kotlin_toy_project

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKorean = findViewById<LinearLayout>(R.id.btn_korean)
        btnKorean.setOnClickListener {
            val intent = Intent(this, Korean::class.java)
            startActivity(intent)
        }
//        val btnJapanese = findViewById<LinearLayout>(R.id.btn_japanese)
//        btnJapanese.setOnClickListener {
//            val intent = Intent(this, Japanese::class.java)
//            startActivity(intent)
//        }
    }
}