package com.techcariernet.compose.bootcampbasicpagedesignhomework

import android.app.Application
import android.app.LocaleConfig
import android.content.Context
import android.content.res.Resources
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.ButtonColor1
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.ButtonColor2

import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.TextColor1
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.TextColor2
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.TextColor3
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun Buttons(btnName: String, darkTheme: Boolean = isSystemInDarkTheme()) {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (darkTheme) ButtonColor1 else ButtonColor2,
            contentColor = TextColor1
        )
    ) {
        Text(text = btnName)
    }
}

@Composable
fun TextFields(value: String, labelText: String) {

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp, 0.dp),
        value = value,
        onValueChange = {
            it
        },
        label = { Text(labelText) }
    )
}

@Composable
fun GetTexts(fontsize: Int, text: String, darkTheme: Boolean = isSystemInDarkTheme()) {
    Text(
        modifier = Modifier.padding(50.dp, 0.dp, 5.dp, 50.dp),
        text = text,
        color = if (darkTheme) TextColor1 else TextColor3,
        fontSize = (fontsize / 25).sp
    )
}

@Composable
fun UnderlinedText(fontsize: Int, text: String,darkTheme: Boolean = isSystemInDarkTheme()) {
    Text(
        text = text,
        color = if (darkTheme) TextColor1 else TextColor3,
        textDecoration = TextDecoration.Underline,
        fontSize = (fontsize / 25).sp
    )

}

@Composable
fun GetImage(image: Painter, contentDescription: String, size: Int) {
    Image(
        painter = image,
        contentDescription = contentDescription,
        modifier = Modifier
            .fillMaxWidth()
            .size(size.dp)
            .clickable {

            }
    )
}

@Composable
fun GetImageFlag(image: Painter, contentDescription: String, size: Int) {

    Image(
        painter = image,
        contentDescription = contentDescription,
        modifier = Modifier
            .size(size.dp)
            .clickable {
                Log.e("change location", "Dil değiştiriliyor.")
            },

        )
}







