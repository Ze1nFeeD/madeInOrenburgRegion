package com.example.madeinorenburgregion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class FeedBackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_back)
        val vew: WebView = findViewById(R.id.webView1)
        vew.loadUrl("https://forms.yandex.ru/cloud/6548765dc09c02f2566d283f/")
        vew.settings.javaScriptEnabled = true
    }
}