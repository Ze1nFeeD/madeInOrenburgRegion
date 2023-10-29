package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OrskMasoKombinatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orsk_maso_kombinat)

        fun mapOrskMasoKombinat(view: View)
        {
            val geoUriString = "geo:51.24518,58.4603047?z=15"
            val geoUri: Uri = Uri.parse(geoUriString)
            val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
            startActivity(mapIntent)

        }

    }
    fun maps(view: View) {
        val geoUriString = "geo:51.199688, 58.620408?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }
}