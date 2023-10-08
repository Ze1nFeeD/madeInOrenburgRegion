package com.example.madeinorenburgregion

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.madeinorenburgregion.MainActivity
import com.example.madeinorenburgregion.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //скроем заголовок окна
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //Сделаем активность на весь на экран
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_splash)

        //Задержка на 4 секунды
        Handler().postDelayed({
            //Старт главной активности
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            //И остановка splash активности
            finish()
        },1000)
    }
}
