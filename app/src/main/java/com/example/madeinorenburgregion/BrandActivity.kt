package com.example.madeinorenburgregion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class BrandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand)
        val puhClick: ConstraintLayout = findViewById(R.id.puhClick)
        puhClick.setOnClickListener{
            startActivity(Intent(this, PuhActivity::class.java))
        }
    }
}