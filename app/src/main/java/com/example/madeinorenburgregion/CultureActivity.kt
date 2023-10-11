package com.example.madeinorenburgregion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class CultureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture)
        val kazakClick: ConstraintLayout = findViewById(R.id.kazakClick)
        kazakClick.setOnClickListener{
            startActivity(Intent(this, KazakActivity::class.java))
        }
    }

}