package com.example.splashscreen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.splashscreen.ui.theme.GreyForText
import com.example.splashscreen.ui.theme.KindBlue
import com.example.splashscreen.ui.theme.LetsPlayColor
import com.example.splashscreen.ui.theme.MyBlue
import com.example.splashscreen.ui.theme.MyGrey
import com.example.splashscreen.ui.theme.MyWhite


@Composable
fun NamePage(

    context: Context = LocalContext.current,
    navController: NavHostController,

    ) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = KindBlue)
    ) {
        Image(
            painter = painterResource(id = R.drawable.namepageback),
            contentDescription = "NamePageBack",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier
                        .width(165.dp)
                        .height(85.dp),
                    painter = painterResource(
                        id = R.drawable.data_white_logo_rmb
                    ),
                    contentDescription = ""
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(color = MyWhite)
            ) {


                Image(
                    painter = painterResource(id = R.drawable.imageboy),
                    contentDescription = "",
                    modifier = Modifier
                        .width(244.dp)
                        .height(200.dp)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = "Let's do tests!",
                        style = TextStyle(
                            color = LetsPlayColor,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(
                        text =
                        "This app was created one of students in 'Data Ta'lim Stantsiyasi' and our aim is that you can choose right program by doing test.Good Luck Everyone!",

                        style = TextStyle(
                            color = GreyForText,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center
                        )
                    )
                }

                var text by remember {
                    mutableStateOf("")
                }

                Box(
                    modifier = Modifier
                        .padding(top = 15.dp)
                ) {
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        modifier = Modifier
                            .border(
                                BorderStroke(3.dp, color = MyBlue)
                            )
                            .width(370.dp)
                            .height(60.dp),
                        placeholder = {
                            Text(
                                text = "Enter your name", color = MyGrey,
                                fontWeight = FontWeight.Bold
                            )
                        }


                    )
                }

                Box(
                    modifier = Modifier
                        .padding(top = 15.dp, end = 20.dp)
                        .height(60.dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.BottomEnd
                ) {

                    LargeFloatingActionButton(
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp),
                        onClick = {
                            if (text.isNotEmpty()) {
                                navController.navigate("test_page/${text}")
                            } else {
                                Toast.makeText(context, "Enter your name", Toast.LENGTH_LONG).show()
                            }
                        },
                        shape = CircleShape,
                        containerColor = MyBlue,
                        contentColor = MyWhite
                    ) {
                        Icon(
                            Icons.Filled.KeyboardArrowRight, ""
                        )

                    }
                }


            }


        }


    }


}


@Preview
@Composable
fun NamePagePreview() {
    NamePage(navController = rememberNavController())
}