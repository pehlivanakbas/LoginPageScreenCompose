package com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.techcariernet.compose.bootcampbasicpagedesignhomework.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

    */
)
    // Added Fonts:
    val montserratitalic= FontFamily(Font(R.font.montserratitalic))
    val montserratthin= FontFamily(Font(R.font.montserratthin))
    val montserratxtralight= FontFamily(Font(R.font.montserratxtralight))
    val montserratlightitalic= FontFamily(Font(R.font.montserratlightitalic))
    val sfpasifico= FontFamily(Font(R.font.sfpasifico))
