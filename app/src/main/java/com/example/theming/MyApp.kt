package com.example.theming

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theming.ui.theme.ThemingTheme

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "My title",
            style = MaterialTheme.typography.titleLarge
        )

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            label = { Text("Enter text") }
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    ThemingTheme {
        MyApp()
    }
}