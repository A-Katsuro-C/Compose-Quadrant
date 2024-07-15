package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Card()
                }
            }
        }
    }
}
@Composable
fun Card(){
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)) {
            CardInfo(
                title = stringResource(R.string.title_column_one),
                description = stringResource(R.string.desc_column_one),
                background = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            CardInfo(
                title = stringResource(R.string.title_column_two),
                description = stringResource(R.string.desc_column_two),
                background = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)){
            CardInfo(
                title = stringResource(R.string.title_column_three),
                description = stringResource(R.string.desc_column_three),
                background = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f),
            )
            CardInfo(
                title = stringResource(R.string.title_column_four),
                description = stringResource(R.string.desc_column_four),
                background = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f),
            )
        }
    }


}

@Composable
fun CardInfo(title: String, description: String, background: Color, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            )
        Text(
            text = description,
            textAlign = TextAlign.Justify
            )

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Compose Quadrant",
    )
@Composable
fun ComposePreview() {
    ComposeQuadrantTheme {
        Card()
    }
}