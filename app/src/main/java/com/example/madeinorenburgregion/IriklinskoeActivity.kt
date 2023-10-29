package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class IriklinskoeActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iriklinskoe)
        viewPager = findViewById(R.id.idViewPager)

        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.iriklin1
        imageList = imageList + R.drawable.iriklin2
        imageList = imageList + R.drawable.iriklin3
        imageList = imageList + R.drawable.iriklin4
        imageList = imageList + R.drawable.iriklin5


        viewPagerAdapter = ViewPagerAdapter(this@IriklinskoeActivity, imageList)


        viewPager.adapter = viewPagerAdapter
        dotsIndicator.attachTo(viewPager)
    }
    fun mapsIriklinskoe(view: View) {
        val geoUriString = "geo:51.890927, 58.883228?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }
}