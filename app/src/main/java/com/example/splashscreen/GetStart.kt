package com.example.splashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.splashscreen.ui.theme.MyBlue
import com.example.splashscreen.ui.theme.MyWhite

@Composable
fun GetStarted(
    navController: NavHostController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            modifier = Modifier
                .width(145.dp)
                .height(65.dp),
            painter = painterResource
                (id = R.drawable.filtered_new_blue),
            contentDescription = ""
        )
        Image(
            modifier = Modifier
                .width(430.dp)
                .height(332.dp),
            painter = painterResource
                (id = R.drawable.quizlogo),
            contentDescription = ""
        )


        Button(
            onClick = {
                navController.navigate("name_page")
            },
            modifier = Modifier
                .width(278.dp)
                .height(55.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MyBlue
            )
        ) {
            Text(
                text = "Get Started",
                fontSize = 26.sp,
                color = MyWhite
            )
        }


    }
}

@Preview
@Composable
fun GetStartedPreview() {
    GetStarted(navController = rememberNavController())
}