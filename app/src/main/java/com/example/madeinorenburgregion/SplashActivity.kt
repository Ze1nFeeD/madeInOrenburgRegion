package com.example.madeinorenburgregion

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.example.madeinorenburgregion.MainActivity
import com.example.madeinorenburgregion.R
import com.romainpiel.shimmer.Shimmer
import com.romainpiel.shimmer.ShimmerTextView
import com.yandex.mapkit.MapKitFactory

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("33b9b2ff-c110-4b33-9d66-1433f24ea7a7")
        MapKitFactory.initialize(this)
        //скроем заголовок окна
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //Сделаем активность на весь на экран
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_splash)

        val shimmerTextView = findViewById<ShimmerTextView>(R.id.my_shimmer_text_view)
        val shimmerTextView2 = findViewById<ShimmerTextView>(R.id.my_shimmer_text_view2)
        val shimmer = Shimmer()
            .setDuration(1500)
            .setStartDelay(300)
            .setDirection(Shimmer.ANIMATION_DIRECTION_LTR)

        shimmer.start(shimmerTextView)
        shimmer.start(shimmerTextView2)

        val imageView = findViewById<ImageView>(R.id.imageView27)
        val textView1 = findViewById<TextView>(R.id.my_shimmer_text_view)
        val textView2 = findViewById<TextView>(R.id.my_shimmer_text_view2)
        val textView3 = findViewById<TextView>(R.id.textView3)

        // Убедитесь, что начальная позиция TextView установлена вне экрана
        textView1.alpha = 0f
        textView2.alpha = 0f
        textView3.alpha = 0f

        imageView.postDelayed({
            // Анимация для появления и движения ImageView
            imageView.visibility = View.VISIBLE
            imageView.animate()
                .translationXBy(-225.2f) // Двигаем влево
                .setDuration(1000)
                .setInterpolator(AccelerateDecelerateInterpolator())
                .withEndAction {
                    // По окончании анимации ImageView скроется и начнется плавное появление текста
                    animateTextAppearance(textView1)
                    animateTextAppearance(textView2)
                    animateTextAppearance(textView3)
                }
                .start()
        }, 1000) // Задержка в миллисекундах

        //Задержка на 4 секунды
        Handler().postDelayed({
            //Старт главной активности
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            //И остановка splash активности
            finish()
        },5000)
    }
    // Функция для плавного появления текста
    private fun animateTextAppearance(textView: TextView) {
        textView.visibility = View.VISIBLE
        textView.animate()
            .alpha(1f) // Плавное появление текста
            .setDuration(1000)
            .setInterpolator(AccelerateDecelerateInterpolator())
            .start()
    }
}
