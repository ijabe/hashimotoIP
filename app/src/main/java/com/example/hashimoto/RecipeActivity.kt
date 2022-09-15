package com.example.hashimoto

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_activity)



        val bThaiSoup =findViewById<TextView>(R.id.tvTitleRecipe1)
        val bCurry =findViewById<TextView>(R.id.tvTitleRecipe2)
        val bFish = findViewById<TextView>(R.id.tvTitleRecipe3)
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