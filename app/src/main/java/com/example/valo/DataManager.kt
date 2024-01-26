package com.example.valo

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.valo.models.Agents
import com.google.gson.Gson

object DataManager{
    var  data = emptyArray<Agents>()
    var currentAgent: Agents? = null
    var currentPage = mutableStateOf(Pages.LISTING)

    var isDataLoaded = mutableStateOf(false)
    fun loadAssetsFromFile(context: Context){
        val inputStream = context.assets.open("agents.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Agents>::class.java)
        isDataLoaded.value = true

    }

    fun switchPages(agents: Agents?){
        if(currentPage.value == Pages.LISTING){
            currentAgent = agents
            currentPage.value = Pages.DETAIL
        }else{
            currentPage.value = Pages.LISTING
        }
    }
}