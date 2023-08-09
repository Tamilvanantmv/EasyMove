package com.example.easymove.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.easymove.R

@Composable
fun MainScreen(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), elevation = 10.dp) {

        Column() {
            Row(modifier = Modifier.fillMaxSize()) {

                Column() {
                    TextField(value = "From", onValueChange = {}, modifier = Modifier.height(50.dp))
                }

                Image(
                    painter = painterResource(id = R.drawable.from_to),
                    contentDescription = "Source-destination image",
                    contentScale = ContentScale.FillWidth,
                    alignment = Alignment.Center,
                    modifier = Modifier.size(250.dp)
                )
            }
            Row(modifier = Modifier.fillMaxSize()) {
                Column() {
                    TextField(value = "To", onValueChange = {}, modifier = Modifier.height(50.dp))
                }
            }
        }

    }

}
