package com.fullana.tutorialandroidkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fullana.tutorialandroidkt.ui.theme.TutorialAndroidKtTheme


class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialAndroidKtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hi,my name is Android!")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Magenta) {
        Text(
            text = "Hello $name!",
            modifier = modifier.padding(24.dp)
        )

    }
}
@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    TutorialAndroidKtTheme {
        Greeting("Meghan")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TutorialAndroidKtTheme {
        Greeting("Android")
    }
}
