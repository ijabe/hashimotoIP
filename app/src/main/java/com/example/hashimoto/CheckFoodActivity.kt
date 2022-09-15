package com.example.hashimoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CheckFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.check_food_activity)

        val bCheckIngredient =findViewById<Button>(R.id.bCheckIngredient)
    }
}