package com.example.apartment.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Pay(onClick: () -> Unit = {}) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .height(200.dp)
            ,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
        )
    ) {
        Column (
            modifier = Modifier.fillMaxSize().padding(vertical = 8.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = "Next Payment",
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal
            )
            Text(
                text = "Ksh. 7500/=",
                fontSize = 24.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Due on June 1 2025",
                fontSize = 18.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Thin
            )
            Button(
                onClick = { /* TODO: Handle click */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Pay Now")
            }

        }


    }
}
