package com.stevdza.san.themeswitcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.stevdza.san.themeswitcher.ui.theme.ThemeSwitcherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var darkTheme by remember { mutableStateOf(false) }
            ThemeSwitcherTheme(darkTheme = darkTheme) {
                MainScreen(
                    darkTheme = darkTheme,
                    onThemeUpdated = { darkTheme = !darkTheme }
                )
            }
        }
    }
}