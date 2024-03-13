package com.example.splashscreen

import android.app.StatusBarManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor = getColor(R.color.blue)
            Surface(color = Color(0xFF202020), modifier = Modifier.fillMaxSize()) {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "splash_screen"
                ) {

                    composable("splash_screen") {
                        SplashScreen(navController = navController)
                    }
                    composable("get_started") {
                        GetStarted(navController=navController)
                    }

                    composable(route = "name_page"){
                        NamePage(navController = navController)
                    }
                    composable(
                        route = "test_page/{name}",
                        arguments = listOf(
                            navArgument(name = "name"){
                                type = NavType.StringType
                            }
                        )
                    ) { backstackEntry ->
                        TestPage(
                            navController=navController
                            , name = backstackEntry.arguments?.getString("name")
                        )
                    }
                    
                    composable("result_page"){
                        ResultPage(navController = navController)
                    }

                }

            }
        }
    }
}






