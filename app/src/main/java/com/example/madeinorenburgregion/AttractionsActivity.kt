package com.example.madeinorenburgregion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class AttractionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attractions)
        val museimClick : ConstraintLayout = findViewById(R.id.museimClick)
        museimClick.setOnClickListener {
            startActivity(Intent(this, OrenMuseimActivity::class.java))
        }
    }
}