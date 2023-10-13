package com.example.madeinorenburgregion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TatarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tatar)

        val viewPager1 = findViewById<ViewPager>(R.id.viewpager1)
        viewPager1.adapter = MyPagerAdapterTatar(supportFragmentManager)
        val tabLayout1 = findViewById<TabLayout>(R.id.sliding_tabs1)
        tabLayout1.setupWithViewPager(viewPager1)
    }
}