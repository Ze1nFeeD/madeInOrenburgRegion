package com.example.madeinorenburgregion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class CultureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture)
        //Открытие Казахской культуры
        val kazakClick: ConstraintLayout = findViewById(R.id.kazakClick)
        kazakClick.setOnClickListener{
            startActivity(Intent(this, KazakActivity::class.java))
            //Открытие Татарской культуры
            val tatarClick: ConstraintLayout = findViewById(R.id.tatarClick)
            tatarClick.setOnClickListener{
                startActivity(Intent(this, TatarActivity::class.java))
            }
        }
    }

}