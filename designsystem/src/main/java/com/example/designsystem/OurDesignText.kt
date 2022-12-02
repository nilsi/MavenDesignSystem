package com.example.designsystem;

import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun OurDesignText() {
    Text("My design text!", modifier = Modifier.background(Color.Blue))
}