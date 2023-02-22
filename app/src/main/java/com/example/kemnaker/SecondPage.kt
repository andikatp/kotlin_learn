package com.example.kemnaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val nama =intent.getStringExtra("Name")
        val tvNama = findViewById<TextView>(R.id.tvNama)
        tvNama.text = "Selamat Datang $nama"

    }
}