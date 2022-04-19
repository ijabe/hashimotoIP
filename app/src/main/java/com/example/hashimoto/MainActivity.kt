package com.example.hashimoto

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bCheckFood =findViewById<Button>(R.id.bCheckFood)
        val bRecipes =findViewById<Button>(R.id.bRecipes)


        bCheckFood.setOnClickListener{
            val intent = Intent(this, CheckFoodActivity::class.java)
            startActivity(intent)
        }
        bRecipes.setOnClickListener{
            val intent = Intent(this, RecipeActivity::class.java)
            startActivity(intent)
        }
    }
}