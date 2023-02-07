package com.manubett.animatedcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.manubett.animatedcard.ui.theme.AnimatedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedTheme {
                // A surface container using the 'background' color from the theme
                ExpandableCard()
            }
        }
    }
}

