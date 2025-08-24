package com.example.adaptiveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.adaptiveapp.ui.AdaptiveApp
import com.example.adaptiveapp.ui.theme.AdaptiveAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdaptiveAppTheme {
                AdaptiveApp()
            }
        }


    }
}
