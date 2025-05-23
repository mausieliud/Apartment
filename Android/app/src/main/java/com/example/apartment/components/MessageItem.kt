package com.example.apartment.components
/*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MessageItem(
    message: String,
    timestamp: String,
    isFromMe: Boolean,
    isRead: Boolean = false,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 2.dp),
        horizontalArrangement = if (isFromMe) Arrangement.End else Arrangement.Start
    ) {
        if (!isFromMe) {
            // Add some space for incoming messages
            Spacer(modifier = Modifier.width(48.dp))
        }

        Card(
            modifier = Modifier
                .widthIn(min = 100.dp, max = 280.dp),
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = if (isFromMe) 16.dp else 4.dp,
                bottomEnd = if (isFromMe) 4.dp else 16.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = if (isFromMe) {
                    Color(0xFF005C4B) // WhatsApp green for sent messages
                } else {
                    Color(0xFF202C33) // Dark gray for received messages
                }
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Text(
                    text = message,
                    color = Color.White,
                    fontSize = 16.sp,
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = timestamp,
                        color = Color(0xFF8696A0),
                        fontSize = 12.sp
                    )

                    if (isFromMe) {
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = if (isRead) Icons.Default.DoneAll else Icons.Default.Done,
                            contentDescription = if (isRead) "Read" else "Sent",
                            modifier = Modifier.size(16.dp),
                            tint = if (isRead) Color(0xFF53BDEB) else Color(0xFF8696A0)
                        )
                    }
                }
            }
        }

        if (isFromMe) {
            // Add some space for outgoing messages
            Spacer(modifier = Modifier.width(48.dp))
        }
    }
}

// Example usage in a conversation
@Preview
@Composable
fun MessageItemPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0B141A))
            .padding(16.dp)
    ) {
        MessageItem(
            message = "Hey! How are you doing?",
            timestamp = "10:30 AM",
            isFromMe = false
        )

        Spacer(modifier = Modifier.height(8.dp))

        MessageItem(
            message = "I'm doing great, thanks for asking! Just finished work and heading home.",
            timestamp = "10:32 AM",
            isFromMe = true,
            isRead = true
        )

        Spacer(modifier = Modifier.height(8.dp))

        MessageItem(
            message = "That's awesome! Want to grab dinner tonight?",
            timestamp = "10:33 AM",
            isFromMe = false
        )

        Spacer(modifier = Modifier.height(8.dp))

        MessageItem(
            message = "Sure! Let's meet at 7 PM at our usual spot.",
            timestamp = "10:35 AM",
            isFromMe = true,
            isRead = false
        )
    }
}

// Data class for message
data class ChatMessage(
    val id: String,
    val text: String,
    val timestamp: String,
    val isFromMe: Boolean,
    val isRead: Boolean = false
)

// Usage in a LazyColumn
@Composable
fun ChatScreen(messages: List<ChatMessage>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B141A)),
        reverseLayout = true // Start from bottom like WhatsApp
    ) {
        items(messages.reversed()) { message ->
            MessageItem(
                message = message.text,
                timestamp = message.timestamp,
                isFromMe = message.isFromMe,
                isRead = message.isRead
            )
        }
    }
}

 */