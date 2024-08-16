package com.techcariernet.compose.bootcampbasicpagedesignhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.BootcampBasicPageDesignHomeworkTheme

import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.Pink40
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.TextColor1
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.TextColor2
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.TextColor3
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.brush
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.montserratitalic
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.montserratlightitalic
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.montserratxtralight
import com.techcariernet.compose.bootcampbasicpagedesignhomework.ui.theme.sfpasifico

/*
ToppAppBar dahil edilip başlık yazı fontu tema renkleri ayarlanacak.
Tema renkleri sistem saatine göre gece ve gündüz olarak ayarlanabilecek
Tasarlayacağımız sayfanın Font'u pasifico olacak
Dil seçeneği: İngilizce ve Türkçe destekli olacak.
Uygulama iconunu "iconkitchen" sitesinden seçip değiştireceğiz.
String verilerin hepsini @string içerisinden alacağız.

 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            BootcampBasicPageDesignHomeworkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EntrancePage()

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrancePage(darkTheme: Boolean = isSystemInDarkTheme()) {
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp
    val screenheight = config.screenHeightDp
    var phoneNumber by rememberSaveable { mutableStateOf("+90") }
    var password by rememberSaveable { mutableStateOf("   ") }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            // use Brush.verticalGradeint to change the angle
                            colors = listOf(
                                Color(0xFF64B5F6), // Start color
                                Color(0xFF0D47A1)  // End colo
                            )
                        )
                    ),
                title = {

                    Text(text = stringResource(id = R.string.welcome_en), fontFamily = sfpasifico)

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = if (darkTheme) Color.DarkGray else Color.Transparent,
                    titleContentColor = TextColor1
                )
            )
        }

    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GetImageFlag(image = painterResource(id = R.drawable.tr_flag) , contentDescription = "Language_flag_icon", size = screenWidth/10 )
            GetImage(image =painterResource(id = R.drawable.welcomeimage) , contentDescription ="account_image" , size = screenWidth/3)

            UnderlinedText(fontsize = screenWidth, text =  stringResource(id = R.string.changeAvatar))

            GetTexts(fontsize =(screenWidth), text = stringResource(id = R.string.text_enter))

            TextFields(value = phoneNumber, labelText = stringResource(id = R.string.phone))
            TextFields(value = password, labelText = stringResource(id = R.string.password))

            Buttons(btnName = stringResource(id = R.string.login))
            Buttons(btnName = stringResource(id = R.string.signup))

            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {

                GetTexts(fontsize =screenWidth, text = stringResource(id = R.string.forget_password))
                UnderlinedText(fontsize = screenWidth, text = stringResource(id = R.string.clickable_text) )
            }

        }
    }

}



@Preview(showBackground = true, locale = "eng" )
@Composable
fun EntrancePagePreview() {
    BootcampBasicPageDesignHomeworkTheme {
        EntrancePage()
    }
}