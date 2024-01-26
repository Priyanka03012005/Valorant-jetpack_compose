package com.example.valo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.valo.models.Agents
import com.example.valo.ui.theme.ValorantRed

//
//@Composable
//fun AgentsListItem(
//    agents: Agents,
//    onClick: (agents: Agents)-> Unit
//){
////    Card(
////        modifier = Modifier
////            .clickable{
////                onClick(agents)
////            }
////            .clip(CircleShape)
////            .padding(20.dp)
////    ){
//        Column(modifier = Modifier
//            .fillMaxWidth()
//            .padding(25.dp)
//            .clickable{
//            onClick(agents)
//        },
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(
//                painter = rememberImagePainter(data = agents.displayIcon),
//                contentDescription = "Agents",
//                alignment = Alignment.TopCenter,
//                modifier = Modifier
//                    .size(150.dp)
//                    .align(Alignment.CenterHorizontally)
//            )
//            Text(
//                text = agents.displayName,
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .align(Alignment.CenterHorizontally)
//            )
//        }
////    }
//}

@Composable
fun AgentsListItem(
    agents: Agents,
    onClick: (agents: Agents) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                onClick(agents)
            }
        ,

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberImagePainter(data = agents.displayIcon),
                contentDescription = "Agents",
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = CircleShape)
                    .background(MaterialTheme.colorScheme.background)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = agents.displayName,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = agents.role,
//                fontSize = 14.sp,
//                color = MaterialTheme.colorScheme.secondary
//            )
        }
    }
}
