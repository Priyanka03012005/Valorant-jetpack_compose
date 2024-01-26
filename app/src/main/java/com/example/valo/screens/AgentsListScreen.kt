package com.example.valo.screens

import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.valo.models.Agents
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.valo.ui.theme.ValorantRed

@Composable
fun AgentsListScreen(
    data: Array<Agents>,
    onClick: (agents: Agents)->Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Image(
                painter = rememberImagePainter("https://www.pngall.com/wp-content/uploads/13/Valorant-Logo-PNG-Cutout.png"),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(100.dp)
                    .align(CenterHorizontally)
            )
            AgentsList(data = data, onClick)
        }
    }
}