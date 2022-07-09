package com.example.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
                Item("", "")
            }
        }

    }
}
@Composable
private fun Item(name: String, description: String){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .pointerInput(Unit) {
                detectDragGesturesAfterLongPress { change, dragAmount -> Log.d("Mylog","Long: $dragAmount")  }
            }
            .clickable {
                Log.d("Mylog", "clicked")
            }
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ) {
            Box(

                ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.image), contentDescription = "text", contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                        )
                    Column() {
                        Text(text = "Linus tech tips")
                        Text(text = "Tech youtuber")
                    }
                }
            }
        }
}