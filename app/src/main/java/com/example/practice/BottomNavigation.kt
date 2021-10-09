package com.example.practice

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigation(val route:String,val title:String,val icon: ImageVector){
    object Home: BottomNavigation("Home","Home", Icons.Filled.Home)
    object Favorite: BottomNavigation("Favorite","Favorite", Icons.Filled.Favorite)
    object User: BottomNavigation("User","User", Icons.Filled.Person)
}

val bottomNavigationItems = listOf(
    BottomNavigation.Home,
    BottomNavigation.Favorite,
    BottomNavigation.User
)