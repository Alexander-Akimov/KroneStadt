package com.akimov.coderswag.controller

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akimov.coderswag.R
import com.akimov.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_products)

    val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
  }

  companion object {
    fun getIntent(context: Context, category: String): Intent {
      val intent = Intent(context, ProductsActivity::class.java)
      intent.putExtra(EXTRA_CATEGORY, category)
      return intent
    }
  }
}
