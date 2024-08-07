package com.example.gfg.ui.theme

data class GetProducts(
    val products: List<Product>
)

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val category: String
)