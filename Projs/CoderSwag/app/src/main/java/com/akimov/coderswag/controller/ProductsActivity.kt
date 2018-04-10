package com.akimov.coderswag.controller

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.akimov.coderswag.R
import com.akimov.coderswag.Services.DataService
import com.akimov.coderswag.Utilities.EXTRA_CATEGORY
import com.akimov.coderswag.adapters.ProductsAdapter
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

  lateinit var adapter: ProductsAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_products)

    val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

    val orientation = resources.configuration.orientation
    var spanCount = if (orientation == Configuration.ORIENTATION_LANDSCAPE) 3 else 2

    val screenSize = resources.configuration.screenWidthDp
    if (screenSize > 720)
      spanCount = 3


    val layoutManager = GridLayoutManager(this, spanCount)
    productListView.layoutManager = layoutManager
    productListView.adapter = adapter
  }

  companion object {
    fun getIntent(context: Context, category: String): Intent {
      val intent = Intent(context, ProductsActivity::class.java)
      intent.putExtra(EXTRA_CATEGORY, category)
      return intent
    }
  }
}
