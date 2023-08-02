package com.codespacepro.checkboxuianimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codespacepro.checkboxuianimation.ui.theme.CheckBoxUiAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CheckBoxUiAnimationTheme {
                var selected by remember {
                    mutableStateOf(false)
                }
                var selected2 by remember {
                    mutableStateOf(false)
                }

                Column(
                    modifier = Modifier
                        .background(if (isSystemInDarkTheme()) Color.Black else Color.White)
                        .fillMaxSize()
                        .padding(80.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SelectableItem(modifier = Modifier,
                        selected = selected,
                        title = "Lorem Ipsum",
                        onClick = {
                            selected = !selected
                        }
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    SelectableItem(modifier = Modifier,
                        selected = selected2,
                        title = "Lorem Ipsum",
                        subtitle = "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum" +
                                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum" +
                                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                        onClick = {
                            selected2 = !selected2
                        }
                    )
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CheckBoxUiAnimationTheme {

    }
}