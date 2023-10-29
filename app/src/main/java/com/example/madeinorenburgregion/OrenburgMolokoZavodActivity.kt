package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OrenburgMolokoZavodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orenburg_moloko_zavod)
    }
    fun maps(view: View) {
        val geoUriString = "geo:51.802191, 55.084883?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }
}