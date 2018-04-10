package com.akimov.coderswag.Services

import com.akimov.coderswag.model.Category
import com.akimov.coderswag.model.Product

/**
 * Created by lex on 1/14/18.
 */
object DataService {
  var categories = listOf(
      Category("SHIRTS", "shirtimage"),
      Category("HOODIES", "hoodieimage"),
      Category("HATS", "hatimage"),
      Category("DIGITAL", "digitalgoodsimage"),
      Category("SHIRTS", "shirtimage"),
      Category("HOODIES", "hoodieimage"),
      Category("HATS", "hatimage"),
      Category("DIGITAL", "digitalgoodsimage"),
      Category("SHIRTS", "shirtimage"),
      Category("HOODIES", "hoodieimage"),
      Category("HATS", "hatimage"),
      Category("DIGITAL", "digitalgoodsimage")
  )

  val hats = listOf(
      Product("Devslopes Graphic Beanie", "$18", "hat1"),
      Product("Devslopes Hat Black", "$20", "hat2"),
      Product("Devslopes Hat White", "$18", "hat3"),
      Product("Devslopes Hat Snapback", "$22", "hat4"),
      Product("Devslopes Graphic Beanie", "$18", "hat1"),
      Product("Devslopes Hat Black", "$20", "hat2"),
      Product("Devslopes Hat White", "$18", "hat3"),
      Product("Devslopes Hat Snapback", "$22", "hat4")
  )

  val hoodies = listOf(
      Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
      Product("Devslopes Hoodie Red", "$32", "hoodie2"),
      Product("Devslopes Gray Hoodie", "$32", "hoodie3"),
      Product("Devslopes Black Hoodie", "$32", "hoodie4"),
      Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
      Product("Devslopes Hoodie Red", "$32", "hoodie2"),
      Product("Devslopes Gray Hoodie", "$32", "hoodie3"),
      Product("Devslopes Black Hoodie", "$32", "hoodie4")
  )

  val shirts = listOf(
      Product("Devslopes Shirt Black", "$18", "shirt1"),
      Product("Devslopes Badge Light Gray", "$20", "shirt2"),
      Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
      Product("Devslopes Hussle", "$22", "shirt4"),
      Product("Kickflip Studios", "$18", "shirt5"),
      Product("Devslopes Shirt Black", "$18", "shirt1"),
      Product("Devslopes Badge Light Gray", "$20", "shirt2"),
      Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
      Product("Devslopes Hussle", "$22", "shirt4"),
      Product("Kickflip Studios", "$18", "shirt5"),
      Product("Devslopes Shirt Black", "$18", "shirt1"),
      Product("Devslopes Badge Light Gray", "$20", "shirt2"),
      Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
      Product("Devslopes Hussle", "$22", "shirt4"),
      Product("Kickflip Studios", "$18", "shirt5")
  )

  val digitalGood = listOf<Product>()

  fun getProducts(category: String): List<Product> =
      when (category) {
        "SHIRTS" -> shirts
        "HOODIES" -> hoodies
        "HATS" -> hats
        else -> digitalGood
      }
}