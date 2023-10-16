package com.example.weatherapp

import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
        .padding(20.dp)
        .fillMaxSize()) {
        Text(
            text = "Ika Tania Chaerani",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
            )

        Spacer(modifier = Modifier.padding(13.dp))
        
        Box1()

        Spacer(modifier = Modifier.padding(13.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(13.dp))
        
        Box2()
    }
}

@Composable
fun Box1() {
    val image = painterResource(R.drawable.orang)
    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)
        .fillMaxWidth())
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth())
        {
            Image(
                painter = image,
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
            )
            Text(
                text = "Rain",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun Lokasi() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier) {
        Text(
            text = "19 C",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
        )
        
        Spacer(modifier = Modifier.padding(3.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            //Image()

            Text(
                text = "Yogyakarta",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.padding(3.dp))

        Text(
            text = "Kasian, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
            fontSize = 20.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Box2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Cyan)) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "Humidity")
                    Text(
                        text = "98%",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)

                    Spacer(modifier = Modifier.padding(30.dp))

                    Text(
                        text = "Sunrise")
                    Text(
                        text = "05.00 AM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "UV Index")
                    Text(
                        text = "9 / 10",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)

                    Spacer(modifier = Modifier.padding(30.dp))

                    Text(
                        text = "Sunset")
                    Text(
                        text = "05.40 PM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {
        Home()
    }
}