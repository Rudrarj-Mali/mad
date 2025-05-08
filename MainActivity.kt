package com.example.call

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {

    MaterialTheme{
        var text by remember { mutableStateOf("") }


        Column {
            Text(
                modifier = Modifier.fillMaxWidth().background(color = Color.Red)
                 ,
                text = "Welcome",
                fontSize = 40.sp,

                )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Password") }
            )
            val ite = listOf("Apple", "Banana", "Cherry")

            LazyColumn {
                items(ite) { item ->
                    Text(text = item)
                }
            }

        }


            }
        }


