package com.example.hashimoto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.json.JSONArray
import java.net.HttpURLConnection
import java.net.URL


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

        ///////////////////////////
        val url = "http:localhost:8081/hashimoto/dishes"

        AsyncTaskHandleJson().execute(url)

    }

    inner class AsyncTaskHandleJson(): AsyncTask<String,String,String>() {
        override fun doInBackground(vararg url: String?): String {

            val text: String
            val connection = URL(url[0]).openConnection() as HttpURLConnection
            try{
                connection.connect()
                text=connection.inputStream.use {it.reader().use{reader -> reader.readText()}}
            }finally{
                connection.disconnect()
            }

            return text
        }
        override fun onPostExecute(result: String?){
            super.onPostExecute(result)
            handleJson(result)
        }
    }
    private fun handleJson(jsonString: String?) {

        val jsonArray = JSONArray(jsonString)
        val list = ArrayList<Meal>()

        var x = 0
        while (x < jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(x)
            list.add(Meal(
                jsonObject.getInt("id"),
                jsonObject.getString("name"),
                jsonObject.getString("dishType"),
                jsonObject.getString("indegrideintList")
            ))
            x++
        }
        val adapter = ListAdapter(this,list)
        // ponizej ustawia się id listy gdzie ma sie wyświetlać. Przykadowo tak jak ponizej. Layout (android:id="@+id/meal_list")
        // meal_list.adapter = adapter
    }
    ///////////////////////////////////////
}