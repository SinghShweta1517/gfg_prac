package com.example.gfg.ui.theme

sealed class Screen (val route: String){
    object MainScreen : Screen("main_screen")
    object CounterScreen : Screen("counter_screen")
    object ProductListScreen : Screen("product_list_screen")
}