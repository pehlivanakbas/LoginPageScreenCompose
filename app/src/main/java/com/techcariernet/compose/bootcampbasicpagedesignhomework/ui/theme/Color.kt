package com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

//Added Colors
val TextColor1 = Color(0xFFCCCBCF)
val TextColor2= Color(0xFF666668)
val TextColor3= Color(0xFF111111)
val ButtonColor1= Color(0xFF64B5F6)
val ButtonColor2= Color(0xFF0D47A1)


val  brush = Brush.horizontalGradient(
    // use Brush.verticalGradeint to change the angle
    colors = listOf(
        Color(0xFF64B5F6), // Start color
        Color(0xFF0D47A1)  // End color
    )
)

