package com.example.call

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts

import androidx.compose.material3.*
import androidx.compose.runtime.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCameraOpener()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)

    @Composable
    fun SimpleCameraOpener() {
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.TakePicturePreview()) {
        // Do nothing with the result
    }

    Button(onClick = { launcher.launch(null) }) {
        Text("Open Camera")
    }
}



