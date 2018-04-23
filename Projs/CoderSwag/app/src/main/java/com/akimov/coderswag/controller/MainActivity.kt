package com.akimov.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.akimov.coderswag.R
import com.akimov.coderswag.Services.DataService
import com.akimov.coderswag.adapters.CategoryAdapter
import com.akimov.coderswag.model.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  lateinit var adapter: CategoryAdapter
  //lateinit var adapter: ArrayAdapter<Category>

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    //adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
    adapter = CategoryAdapter(this, DataService.categories)
    categoryListView.adapter = adapter


    categoryListView.setOnItemClickListener { adapterView, view, i, l ->
      val category = DataService.categories[i]
      Toast.makeText(this, "You clicked on the ${category.title} category", Toast.LENGTH_SHORT).show()

    }
  }
}
