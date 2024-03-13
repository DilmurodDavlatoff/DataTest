package com.example.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.splashscreen.ui.theme.MyBlue
import com.example.splashscreen.ui.theme.MyWhite

@Composable
fun ResultPage(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(color = MyBlue), contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .padding(16.dp)
                        .background(color = MyBlue, shape = CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Back",
                        tint = MyWhite
                    )
                }


            }

            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "These are your results!"
                    , style = TextStyle(
                        fontWeight = FontWeight.Bold
                        , fontSize = 20.sp
                        , color = MyWhite)
                    , modifier = Modifier
                )

            }


        }


        Box(
            modifier = Modifier
                .background(color = MyWhite)
        ) {
            Column(

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .fillMaxWidth()
            ) {

                Image(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp),
                    painter = painterResource(id = R.drawable.data_logo_text),
                    contentDescription = ""
                )


            }

        }


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .background(color = MyWhite)
        ) {
            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Frontend", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(170.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "55%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Backend", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(170.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "15%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Android", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(175.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "90%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }


            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Graphic Design", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(105.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "40%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Brandface", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(150.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "20%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "SMM", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(195.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "15%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }


            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Office programs", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(100.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "10%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Mobilography", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(115.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "75%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Video Editing", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(120.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "60%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Accounting", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(140.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "35%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 5.dp)
                    .fillMaxWidth()
                    .height(70.dp)
                    .border(3.dp, color = MyBlue,
                        shape = RoundedCornerShape(20))
                , contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Architecture and Design", style = TextStyle(
                            fontSize = 19.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(40.dp)
                            .height(2.dp)
                            .background(color = MyBlue)
                    ) {

                    }

                    Text(
                        text = "20%", style = TextStyle(
                            fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MyBlue
                        )
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()

            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(vertical = 20.dp)
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MyBlue
                    )
                ) {
                    Text(
                        text = "Do test again!", fontSize = 22.sp, color = MyWhite
                    )
                }

            }



        }


    }


}



@Preview
@Composable
fun ResultPagePreview() {
    ResultPage(navController = rememberNavController())
}