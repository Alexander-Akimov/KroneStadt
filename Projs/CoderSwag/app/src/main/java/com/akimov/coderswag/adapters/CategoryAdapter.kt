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
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    // IOS: row at index path
    // position like index path - number that corresponds to the specific row that is being displayed
    // convertView - view that is displayed over and over
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        categoryName.text = category.title
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

}