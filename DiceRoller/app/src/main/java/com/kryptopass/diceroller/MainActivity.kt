package com.kryptopass.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.kryptopass.diceroller.databinding.ActivityMainBinding

/**
 * A single, focused thing that the user can do.
 * Almost all activities interact with the user, so the Activity class takes
 * care of creating a window for you in which you can place your UI with.
 * AppCompatActivity is a subclass of Android that gives us access to modern
 * Android features while still supporting older versions of the Android OS.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dieImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dieImage = binding.imageViewDie
        setupButtonRoll()
    }
    private fun setupButtonRoll() {
        binding.btnRoll.setOnClickListener {
            rollDie()
        }
    }

    private fun rollDie() {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.die1
            2 -> R.drawable.die2
            3 -> R.drawable.die3
            4 -> R.drawable.die4
            5 -> R.drawable.die5
            else ->  R.drawable.die6
        }
        dieImage.setImageResource(drawableResource)
    }
}