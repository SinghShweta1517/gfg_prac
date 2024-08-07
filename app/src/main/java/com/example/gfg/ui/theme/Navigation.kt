package com.example.gfg.ui.theme

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gfg.ui.theme.viewmodel.ProductViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController)
        }
        composable(route = Screen.CounterScreen.route) {
            CounterScreen(navController)
        }
        composable(route = Screen.ProductListScreen.route) {
            val productViewModel: ProductViewModel = viewModel()
            ProductListScreen(productViewModel = productViewModel, navController = navController)
        }
    }
}
