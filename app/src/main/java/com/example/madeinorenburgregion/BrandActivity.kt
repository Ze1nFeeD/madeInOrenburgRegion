package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class BrandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand)
        val puhClick: ConstraintLayout = findViewById(R.id.puhClick)
        puhClick.setOnClickListener{
            startActivity(Intent(this, PuhActivity::class.java))
        }
        val orskMasoKombinatClick: ConstraintLayout = findViewById(R.id.orskmasokombinatClick)
        orskMasoKombinatClick.setOnClickListener {
            startActivity(Intent(this, OrskMasoKombinatActivity::class.java))
            }
        val orenMilkKombinat: ConstraintLayout = findViewById(R.id.orenmilkClick)
        orenMilkKombinat.setOnClickListener {
            startActivity(Intent(this, OrenburgMolokoZavodActivity::class.java))
        }

    }
}