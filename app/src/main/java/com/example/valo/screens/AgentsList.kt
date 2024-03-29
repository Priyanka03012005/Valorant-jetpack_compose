package com.example.valo.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.valo.models.Agents

@Composable
fun AgentsList(
    data: Array<Agents>,
    onClick: (agents: Agents)->Unit
){
    LazyColumn(content = {
        items(data){
            AgentsListItem(agents = it, onClick)
        }
    })
}