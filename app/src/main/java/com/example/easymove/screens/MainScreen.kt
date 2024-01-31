package com.example.easymove.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.easymove.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun MainScreen(navController: NavController) {

    Surface(modifier = Modifier.fillMaxSize(), elevation = 10.dp) {

        Column() {
            Row(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.from_to),
                    contentDescription = "Source-destination image",
                    contentScale = ContentScale.FillWidth,
                    alignment = Alignment.Center,
                    modifier = Modifier.size(50.dp)
                )

                Column() {
                    Row() {
                        var fromText: String by remember { mutableStateOf("") }
                        TextField(
                            value = fromText,
                            onValueChange = { fromText = it },
                            modifier = Modifier.height(50.dp)
                        )
                        Icon(Icons.Outlined.Place, contentDescription = "Testing the place", modifier = Modifier.clickable {
                            Log.i("Location", "From location")
                        }.fillMaxWidth().size(50.dp))
                    }
                    Row() {
                        var toText by remember { mutableStateOf("") }
                        TextField(
                            value = "my text",
                            onValueChange = { toText = it },
                            modifier = Modifier.height(50.dp)
                        )
                        Icon(Icons.Outlined.Place, contentDescription = "Testing the place", modifier = Modifier.clickable {
                            openMap() }.fillMaxWidth().size(50.dp))
                    }
                }
            }
        }

    }
}
