package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.splashscreen.ui.theme.LightBlue
import com.example.splashscreen.ui.theme.MyBlue
import com.example.splashscreen.ui.theme.MyDoubleDarkBlue
import com.example.splashscreen.ui.theme.MyWhite
import com.example.splashscreen.ui.theme.QuestionColor
import com.example.splashscreen.utils.Answers
import com.example.splashscreen.utils.questions

@SuppressLint("MutableCollectionMutableState")
@Composable
fun TestPage(
    name: String?,
    navController: NavHostController
) {


    val count = remember {
        mutableIntStateOf(0)
    }

    val questions by remember {
        derivedStateOf {
            mutableStateOf(questions)
        }
    }

    var isCleared by remember {
        mutableStateOf(false)
    }


    var selectedOption by remember { mutableStateOf("") }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MyWhite), contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.testpage_back),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
        ) {


            Text(
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .fillMaxWidth(),
                text = "Username : $name",
                color = MyBlue,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )



            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .shadow(elevation = 5.dp, shape = MaterialTheme.shapes.large)
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(color = MyBlue, shape = MaterialTheme.shapes.large),
                contentAlignment = Alignment.TopStart
            ) {


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(color = MyBlue, shape = MaterialTheme.shapes.large),
                    contentAlignment = Alignment.Center
                ) {


                    Image(
                        painter = painterResource
                            (id = R.drawable.data_white_logo_rmb),
                        contentDescription = "",
                        modifier = Modifier
                            .width(160.dp)
                            .height(70.dp)
                    )
                }

                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .padding(16.dp)
                        .background(color = LightBlue, shape = CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Back",
                        tint = MyWhite
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .shadow(
                        elevation = 10.dp,
                        shape = MaterialTheme.shapes.large,
                        spotColor = MyDoubleDarkBlue
                    )
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(color = MyWhite, shape = MaterialTheme.shapes.large),
                contentAlignment = Alignment.Center
            )
            {

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                ) {
                    Text(
                        text = "Question ${count.intValue + 1}/${questions.value.size}",
                        modifier = Modifier,
                        fontSize = 18.sp,
                        color = QuestionColor,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = questions.value[count.intValue].question,
                        modifier = Modifier
                            .padding(20.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        color = QuestionColor,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(), contentAlignment = Alignment.Center
            ) {

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier

                ) {


                    AnswerGroup(
                        answers = arrayListOf(String()),
                        isCleared = isCleared
                    ) {

                    }




                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = {
isCleared=true
                                  count.intValue++
                            isCleared = false


                        }, modifier = Modifier
                            .padding(top = 20.dp)
                            .width(270.dp)
                            .height(45.dp), colors = ButtonDefaults.buttonColors(
                            containerColor = MyBlue
                        )
                    ) {
                        Text(
                            text = "Submit and Next",
                            fontSize = 18.sp,
                            color = MyWhite,
                            textAlign = TextAlign.Center
                        )
                    }


                }


            }


        }


    }


}


@Preview
@Composable
fun TestPagePreview() {
    TestPage(navController = rememberNavController(), name = "")
}