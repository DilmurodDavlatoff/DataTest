package com.example.splashscreen

import android.widget.RadioGroup
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.splashscreen.ui.theme.MyBlue

@Composable
fun AnswerGroup(
    answers: ArrayList<String>,
    isCleared:Boolean=false,
    selectedAnswer: (String) -> Unit
) {


    var selectedOption by remember { mutableStateOf("") }

    if (isCleared) {
        selectedOption = ""
    }


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 3.dp,
                shape = RoundedCornerShape(5),
                color = MyBlue
            )

    )
    {
        answers.forEach { answer ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (answer == selectedOption),
                    onClick = {
                        selectedOption = answer
                        selectedAnswer.invoke(selectedOption)
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = MyBlue,
                        unselectedColor = MyBlue
                    )
                )
                Text(text = answer)
            }

        }




    }

}

@Preview(showBackground = true)
@Composable
fun AnswerItemPrev() {
    AnswerGroup(
       arrayListOf(
           "Javob1",
           "Javob2",
           "Javob3",
           "Javob4",
       )
    ){}
}