package com.example.madeinorenburgregion


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(MainFragment())
       val bot:BottomNavigationView = findViewById(R.id.bottomMainNav)
       bot.setOnNavigationItemSelectedListener {
           item ->
           when(item.itemId){
               R.id.home->
               {
                   loadFragment(MainFragment())
                   true
               }
               R.id.author->
               {

                   loadFragment(AuthorBlank())
                   true
               }
           }
           return@setOnNavigationItemSelectedListener true
       }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}