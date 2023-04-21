package com.example.simpleanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_view.setOnClickListener {
            image_view.animate().apply {

                duration = 1500
                rotationYBy(360f)
            }.withEndAction {
                image_view.animate().apply {

                    duration = 1500
                    rotationXBy(360f)
                }.withEndAction {
                    image_view.animate().apply {

                        scaleY(2f)
                        scaleX(2f)
                    }.start()
                }
            }
        }

    }

}