package com.example.hashimoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_activity)

        val bSniadaniaPrzepisy =findViewById<Button>(R.id.bRecipeBreakfast)
        val bObiadyPrzepisy =findViewById<Button>(R.id.bRecipeDinner)
       // val bDeseryPrzepisy =findViewById<Button>(R.id.bDeseryPrzepisy)
        val bPrzekaskiPrzepisyepisy =findViewById<Button>(R.id.bRecipeDinner)


        bSniadaniaPrzepisy.setOnClickListener{
            val intent = Intent(this, BreakfastActivity::class.java)
            startActivity(intent)
        }
        bObiadyPrzepisy.setOnClickListener{
            val intent = Intent(this, DinnerActivity::class.java)
            startActivity(intent)
        }
       // bDeseryPrzepisy.setOnClickListener{
          //  val intent = Intent(this, CheckFoodActivity::class.java)
          //  startActivity(intent)
       // }
        bPrzekaskiPrzepisyepisy.setOnClickListener{
            val intent = Intent(this, SnacksActivity::class.java)
            startActivity(intent)
        }
    }
}