package com.akimov.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.akimov.coderswag.R
import com.akimov.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

  override fun getItemCount(): Int = products.count()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
    return ProductViewHolder(view)
  }

  override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
    holder.bindProductView(products[position], context)
  }

  inner class ProductViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
//    val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
//    val productName = itemView?.findViewById<TextView>(R.id.productName)
//    val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

    fun bindProductView(product: Product, context: Context) =
        with(product) {
          val resourceId = context.resources.getIdentifier(image, "drawable", context.packageName)
          itemView.productImage?.setImageResource(resourceId)
          itemView.productName?.text = title
          itemView.productPrice?.text = price
        }


  }
}