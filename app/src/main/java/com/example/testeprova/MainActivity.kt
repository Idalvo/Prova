package com.example.testeprova

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
            val randomInt = (1..6).random()
        rollDice (randomInt)
    }
    val resultText: TextView = findViewById(R.id.result_text)
}
    private  fun rollDice(int: Any) {

    }