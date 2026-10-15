package com.example.adamanakjahat.data.model

import androidx.annotation.DrawableRes

data class Category(
    val id: Int = 0,
    val name: String = "",
    val img: String? = null,
    @DrawableRes val iconRes: Int = 0
)
