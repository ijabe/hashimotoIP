package com.example.hashimoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_activity)



        val bThaiSoup =findViewById<CardView>(R.id.cvBreakfastRecipeItem)
        val bCurry =findViewById<CardView>(R.id.cvBreakfastRecipeItem1)
        val bFish = findViewById<CardView>(R.id.cvBreakfastRecipeItem2)
        bThaiSoup.setOnClickListener{

            val intent = Intent(this, ThaiActivity::class.java)
            startActivity(intent)
        }
        bCurry.setOnClickListener{

            val intent = Intent(this, CurryActivity::class.java)
            startActivity(intent)
        }
        bFish.setOnClickListener{

            val intent = Intent(this, FishActivity::class.java)
            startActivity(intent)
        }
    }

}