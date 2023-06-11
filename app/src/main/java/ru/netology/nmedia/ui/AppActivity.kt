package ru.netology.nmedia.ui

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            10F,
            20F,
            30F,
            40F,
        )

//        1.
//        view.startAnimation(
//            AnimationUtils.loadAnimation(this, R.anim.animation)
//        )

//        2.
        view.animate()
            .rotation(360F)
            .scaleX(1.2F)
            .scaleY(1.2F)
            .setInterpolator(LinearInterpolator())
            .setStartDelay(500)
            .setDuration(500)
            .start()
    }
}