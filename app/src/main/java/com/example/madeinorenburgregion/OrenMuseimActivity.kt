package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageSwitcher
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OrenMuseimActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oren_museim)
        viewPager = findViewById(R.id.idViewPager)
        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.orenmuseim1
        imageList = imageList + R.drawable.orenmuseim2
        imageList = imageList + R.drawable.orenmuseim3
        imageList = imageList + R.drawable.orenmuseim4
        imageList = imageList + R.drawable.orenmuseim5


        viewPagerAdapter = ViewPagerAdapter(this@OrenMuseimActivity, imageList)


        viewPager.adapter = viewPagerAdapter
        dotsIndicator.attachTo(viewPager)
    }

    fun maps(view: View) {
        val geoUriString = "geo:51.755481, 55.108387?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }




}