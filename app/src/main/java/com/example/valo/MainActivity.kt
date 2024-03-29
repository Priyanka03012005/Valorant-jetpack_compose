package com.example.valo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.valo.screens.AgentsDetail
import com.example.valo.screens.AgentsListScreen
import com.example.valo.ui.theme.ValoTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
//            delay(10000)
            DataManager.loadAssetsFromFile(applicationContext)
        }
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
//    if(DataManager.isDataLoaded.value){
//        AgentsListScreen(data = DataManager.data) {
//
//        }
//    }
//    else{
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier.fillMaxSize()
//         ){
//            Text(
//                text = "Loading....",
//                )
//        }
//    }
    if(DataManager.isDataLoaded.value){
        if(DataManager.currentPage.value == Pages.LISTING){
            AgentsListScreen(data = DataManager.data) {
            DataManager.switchPages(it)
        }
        }
        else{
            DataManager.currentAgent?.let { AgentsDetail(agents = it) }
        }
    }

}

enum class Pages{
    LISTING,
    DETAIL
}

