package com.example.hashimoto

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class CheckFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.check_food_activity)

        val bCheckIngredient =findViewById<Button>(R.id.bCheckIngredient)
        var etCheckIngredient =findViewById<EditText>(R.id.etCheckIngredient)
        val textView1 = findViewById<TextView>(R.id.textView27)
        val textView2 = findViewById<TextView>(R.id.textView28)
        val textView3 = findViewById<TextView>(R.id.textView29)


        bCheckIngredient.setOnClickListener {
            val etCheckIngredient: String = etCheckIngredient.getText().toString()
            val word = etCheckIngredient.toString();
            val cukier = "cukier";
            val ogorek = "ogórek zielony"
            val kalafior = "kalafior"
            if (word == cukier){
                textView1.setText(word);
                textView1.setTextColor(Color.parseColor("#FA7470"));
            }
            if (word == ogorek){
                textView2.setText(word);
                textView2.setTextColor(Color.parseColor("#759F08"));
            }
            if (word == kalafior){
                textView3.setText(word);
                textView3.setTextColor(Color.parseColor("#FFCF00"));
            }
        }

    }
}