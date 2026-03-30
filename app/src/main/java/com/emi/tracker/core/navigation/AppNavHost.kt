package com.emi.tracker.core.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.emi.tracker.presentation.feature.splash.SplashScreen

@Composable
fun AppNavHost(innerPadding: PaddingValues){
    val navController = rememberNavController()

    NavHost(navController =navController,
        startDestination = Screen.Splash.route){

        composable(route = Screen.Splash.route){
            SplashScreen(navController)
        }

    }
}