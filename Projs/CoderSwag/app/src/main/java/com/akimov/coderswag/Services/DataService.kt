package com.akimov.coderswag.Services

import com.akimov.coderswag.model.Category
import com.akimov.coderswag.model.Product

/**
 * Created by lex on 1/14/18.
 */
object DataService {
    var categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$18","hat03"),
            Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$32", "hoodie03"),
            Product("Devslopes Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$20", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
            Product("Devslopes Hussle", "$22", "shirt04"),
            Product("Kickflip Sshirttudios", "$18", "shirt05")
    )
}