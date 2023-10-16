package com.example.madeinorenburgregion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class BashkirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bashkir)

        val viewPager = findViewById<ViewPager>(R.id.viewpagerBashkir)
        viewPager.adapter = MyPagerAdapterBashkir(supportFragmentManager)
        val tabLayout = findViewById<TabLayout>(R.id.sliding_tabsBaskir)
        tabLayout.setupWithViewPager(viewPager)
    }
}