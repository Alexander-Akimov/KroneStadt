package com.akimov.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.akimov.coderswag.R
import com.akimov.coderswag.Services.DataService
import com.akimov.coderswag.adapters.CategoryRecycleAdapter
import kotlinx.android.synthetic.main.activity_recycler_view_main.*


class RecyclerViewMainActivity : AppCompatActivity() {

  lateinit var adapter: CategoryRecycleAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_recycler_view_main)

    adapter = CategoryRecycleAdapter(this, DataService.categories)
    categoryListView.adapter = adapter

    val layoutManager = LinearLayoutManager(this)

    categoryListView.layoutManager = layoutManager
    categoryListView.setHasFixedSize(true)

  }
}
