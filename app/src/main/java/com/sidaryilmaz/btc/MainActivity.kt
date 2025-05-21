package com.sidaryilmaz.btc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sidaryilmaz.btc.ui.theme.BTCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BTCTheme {


                val viewModel : CryptoViewModel by viewModels()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                   modifier = Modifier.padding(innerPadding),
                    viewModel=viewModel
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier:Modifier=Modifier , viewModel:CryptoViewModel ){
    val state by viewModel.state.collectAsState()
}