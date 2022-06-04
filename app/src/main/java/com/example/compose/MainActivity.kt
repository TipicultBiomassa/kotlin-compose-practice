package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewText()
        }

    }
}
@Preview (showBackground = true)
@Composable
fun NewText(){
    Row(modifier = Modifier
        .background(Color.Gray)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
//        Text(text = "Hello!")
//        Text(text = "Контент!")
//        Text(text = "Hello!")
        Column(
            modifier = Modifier
                .background(Color.Red).fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
                    Text(text = "Hello!")
                    Text(text = "Контент!")
                    Text(text = "Hello!")
        }
        Column(modifier = Modifier.background(Color.Blue).fillMaxHeight(0.5f)) {
            Text(text = "Hello!")
            Text(text = "Контент!")
            Text(text = "Hello!")
        }
    }
}