package com.emi.tracker.core.navigation

sealed class Screen(val route: String){
    object Splash: Screen("splash")
}