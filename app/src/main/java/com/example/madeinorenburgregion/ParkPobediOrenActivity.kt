package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ParkPobediOrenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_pobedi_oren)

    }
    fun maps(view: View) {
        val geoUriString = "geo:51.776910, 55.165685?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }
}