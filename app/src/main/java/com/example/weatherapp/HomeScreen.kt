package com.example.weatherapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.weather_wallpaper),
            contentDescription = null,
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Egypt",
                fontSize = 40.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                "40°",
                fontSize = 100.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )
            Text(
                "Mostly Clear",
                fontSize = 20.sp,
                color = Color.White.copy(alpha = 0.8f),
                fontFamily = FontFamily.SansSerif,

                )
            Image(
                painter = painterResource(R.drawable.sunny),
                contentDescription = null,
                modifier = modifier
                    .padding(8.dp)
                    .size(300.dp)
            )
            ForecastWeather()
        }

    }
}

@Composable
fun ForecastWeather(modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        BlockOfForecastWeather()
        BlockOfForecastWeather()
        BlockOfForecastWeather()
        BlockOfForecastWeather()
    }
}

@Composable
fun BlockOfForecastWeather(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .size(width = 80.dp, height = 200.dp)
            .wrapContentSize(align = Alignment.Center),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
        ),
        border = BorderStroke(1.dp, Color.White),
        shape = RoundedCornerShape(100.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text("12 PM", color = Color.White, fontSize = 12.sp)
            Image(
                painter = painterResource(R.drawable.cloudy_icon_test),
                contentDescription = null,
                modifier = modifier.size(50.dp)
            )
            Text(
                "40°",
                modifier = modifier.padding(bottom = 4.dp),
                color = Color.White.copy(alpha = 0.5f),
                fontSize = 16.sp
            )
            Text("clear sky", color = Color.White, textAlign = TextAlign.Center)
        }
    }
}

@Preview(showSystemUi = false)
@Composable
fun testBlock() {
    BlockOfForecastWeather()
}

@Preview(showSystemUi = true)
@Composable
fun testHomeScreen() {
    HomeScreen()
}