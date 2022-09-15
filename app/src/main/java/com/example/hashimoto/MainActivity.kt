package com.example.hashimoto

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bCheckFood =findViewById<Button>(R.id.bCheckFood)
        val bRecipes =findViewById<Button>(R.id.bRecipes)
        val bBlood = findViewById<Button>(R.id.bBlood)


        bCheckFood.setOnClickListener{
            var message = Toast.makeText(applicationContext, "Wybrano sprawdzenie posiłku", Toast.LENGTH_LONG)
            message.show()
            val intent = Intent(this, CheckFoodActivity::class.java)
            startActivity(intent)
        }
        bRecipes.setOnClickListener{
            var message = Toast.makeText(applicationContext,"Wybrano przepisy",Toast.LENGTH_LONG)
            message.show()
            val intent = Intent(this, RecipeActivity::class.java)
            startActivity(intent)
        }
       bBlood.setOnClickListener{
           var message = Toast.makeText(applicationContext,"Opcja dostępna już w krótce!", Toast.LENGTH_LONG)
           message.show()
           val intent = Intent(this, BloodActivity::class.java)
           startActivity(intent)
       }
    }
}