package com.example.diceroll

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

   lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val rollbutton: Button = findViewById(R.id.roll_button)

       // rollbutton.text="lets roll"

        rollbutton.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()

        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
       // val resultText: TextView= findViewById(R.id.result_text)
       val randomInt = java.util.Random().nextInt(6) + 1
        val drawableResource = when (randomInt)
        {
            1-> R.drawable.dice
            2-> R.drawable.dice1
            3-> R.drawable.dice2
            4-> R.drawable.dice3
            5-> R.drawable.dice4
            else -> R.drawable.dice5
        }
       // val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
       // resultText.text= randomInt.toString()
    }



    //This feature is conflicted



}
