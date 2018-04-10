package com.akimov.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.akimov.coderswag.R
import com.akimov.coderswag.model.Category

/**
 * Created by lex on 3/11/18.
 */
class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

  // IOS: row at index path
  // position like index path - number that corresponds to the specific row that is being displayed
  // convertView - view that is displayed over and over
  override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    val categoryView: View
    val holder: ViewHolder

    if (convertView == null) {
      categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
      holder = ViewHolder()
      holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
      holder.categoryName = categoryView.findViewById(R.id.categoryName)
      println("I exist for the first time!")
      categoryView.tag = holder
    } else {
      holder = convertView.tag as ViewHolder
      categoryView = convertView
      println("Go green, recycle!")
    }

    val category = categories[position]

    //val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

    val res = R.drawable::class.java
    val field = res.getField(category.image)
    val resourceId = field.getInt(null)

    holder.bindCategoryView(resourceId, category.title)
    return categoryView
  }

  override fun getItem(position: Int): Any {
    return categories[position]
  }

  override fun getItemId(position: Int): Long {
    return 0
  }

  //IOS: number of rows in section for a table View
  override fun getCount(): Int {// this function is telling the listView how many rows that is going
    return categories.count() // to be displaying
  }

  private class ViewHolder {
    var categoryImage: ImageView? = null
    var categoryName: TextView? = null
    fun bindCategoryView(resourceId: Int, text: String) {


      categoryImage?.setImageResource(resourceId)
      categoryName?.text = text
    }
  }

}