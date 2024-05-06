package com.example.mianses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mianses.ui.theme.MiAnsesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiAnsesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MiAnsesView("Android")
                }
            }
        }
    }
}

@Composable
fun MiAnsesView(name: String, modifier: Modifier = Modifier) {
    Column(modifier.padding(horizontal = 30.dp)) {
        Text(
            text = "Hola Juan Carlos",
            modifier = modifier.padding(vertical = 10.dp)
        )
        Row(modifier.padding()) {
            Text(
                text = "Cambiar usuario",
                modifier = modifier
            )
            Spacer(modifier = modifier.weight(1f)) // sorted by weight
            Text(
                text = "Ingresa a tu cuenta",
                modifier = modifier
            )
        }
        TextField(
            value = "Clave", onValueChange = {}, modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth(1f)
        )
        Button(onClick = {}, modifier.align(Alignment.CenterHorizontally).padding(10.dp)) {
            Text(
                text = "Ingresar",
                modifier = modifier.padding(horizontal = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiAnsesTheme {
        MiAnsesView("Android")
    }
}