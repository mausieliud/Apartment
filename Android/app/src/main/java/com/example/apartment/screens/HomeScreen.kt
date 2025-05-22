package com.example.apartment.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AttachMoney
import androidx.compose.material.icons.sharp.Chat
import androidx.compose.material.icons.sharp.Extension
import androidx.compose.material.icons.sharp.HomeRepairService
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.apartment.components.NotificationItem

@Composable
fun HomeScreen() {
    var username = "Eliud"

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(4.dp)

    ) {
        Text(
            text = "Welcome back , $username"
        )
        Card(
            modifier = Modifier.padding(4.dp)
                .height(125.dp)
                .fillMaxSize(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
        ) {
            Text("Your Apartment")
            Text("Cheche Studios, Room D10")
        }
        Text(
            text = "Quick Actions"
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier.height(65.dp)
                    .weight(1f)
                    .padding(4.dp), onClick = {}
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Pay Rent")
                    Icon(
                        imageVector = Icons.Sharp.AttachMoney,
                        contentDescription = "Pay Rent"
                    )
                }

            }
            Card(
                modifier = Modifier.height(65.dp)
                    .weight(1f)
                    .padding(4.dp), onClick = {}
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Maintenance")
                    Icon(
                        imageVector = Icons.Sharp.HomeRepairService,
                        contentDescription = "Maintenance"
                    )
                }

            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier.height(65.dp)
                    .weight(1f)
                    .padding(4.dp), onClick = {}
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Action")
                    Icon(
                        imageVector = Icons.Sharp.Chat,
                        contentDescription = "Contact Manager"
                    )
                }

            }
            Card(
                modifier = Modifier.height(65.dp)
                    .weight(1f)
                    .padding(4.dp), onClick = {}
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Extra")
                    Icon(
                        imageVector = Icons.Sharp.Extension,
                        contentDescription = "Extras"
                    )
                }

            }

        }
        Text("Recent Notifications")
        //should insert with if
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(5) { index ->
                NotificationItem()
            }

        }
    }
}
