package com.example.easymove.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easymove.screens.MainScreen
import com.example.easymove.screens.MoveSplashScreen

@Composable
fun MoveNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination=MoveScreens.SplashScreen.name) {
        composable(MoveScreens.SplashScreen.name) {
            MoveSplashScreen(navController = navController)
        }
        composable(MoveScreens.MainScreen.name) {
            MainScreen(navController = navController)
        }
    }
}