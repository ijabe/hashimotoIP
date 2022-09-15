package com.example.hashimoto

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListAdapter (val context: Context, val list: ArrayList<Meal>): BaseAdapter(){

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        ////////////////zmienic R.layout itp poniżej

        val view: View = LayoutInflater.from(context).inflate(R.layout.raw_layout.parent, false)

        val mealId=view.findViewById(R.id...) as AppComatTextView
        val mealName=view.findViewById(R.id...) as AppComatTextView
        val mealDishType=view.findViewById(R.id...) as AppComatTextView
        val mealIndegrideintList=view.findViewById(R.id...) as AppComatTextView

        mealId.text = list[position].id.toString()
        mealName.text = list[position].name
        mealDishType.text = list[position].dishType
        mealIndegrideintList.text = list[position].indegrideintList

        return view 
    }
}