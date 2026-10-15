package com.example.adamanakjahat.data.model

import androidx.annotation.DrawableRes

data class Product(
    val id: Int = 0,
    val name: String = "",
    val description: String = "",
    val category_id: Int = 0, // Disesuaikan dengan penamaan API
    val price: Int = 0,
    val stock: Int = 0,
    val img: String = "",
    val category: Category? = null,
    @DrawableRes val imageRes: Int = 0
)
