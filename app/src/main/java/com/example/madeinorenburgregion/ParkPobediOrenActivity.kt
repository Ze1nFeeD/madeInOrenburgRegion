package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class ParkPobediOrenActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_pobedi_oren)
        viewPager = findViewById(R.id.idViewPager)

        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.park4
        imageList = imageList + R.drawable.park5
        imageList = imageList + R.drawable.park6
        imageList = imageList + R.drawable.park7
        imageList = imageList + R.drawable.park8


        viewPagerAdapter = ViewPagerAdapter(this@ParkPobediOrenActivity, imageList)


        viewPager.adapter = viewPagerAdapter
        dotsIndicator.attachTo(viewPager)
    }
    fun maps(view: View) {
        val geoUriString = "geo:51.776910, 55.165685?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }
}