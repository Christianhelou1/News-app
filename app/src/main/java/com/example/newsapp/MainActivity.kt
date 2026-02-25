package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsList = listOf(
            NewsItem("Beirut Traffic Reduced After New Road Opens",   "The new coastal highway section officially opened today, easing morning congestion for thousands of drivers.", R.mipmap.ic_launcher),
            NewsItem("Environment: Rare Sea Turtle Spotted in Tyre",   "Marine biologists reported a rare loggerhead turtle returning to Lebanon’s southern shores.",  R.mipmap.ic_launcher),
            NewsItem("Travel: Beirut Airport Adds 5 New Destinations",         "Passengers can now fly directly to Madrid, Stockholm, Muscat, Yerevan, and Casablanca.",       R.mipmap.ic_launcher),
            NewsItem("Food: New Shawarma Trend Goes Viral",     "A Beirut restaurant introduced a spicy mango shawarma that attracted massive crowds.",    R.mipmap.ic_launcher),
            NewsItem("Weather: Heavy Rain Expected Tomorrow", "Meteorologists warn of heavy rainfall and strong winds in coastal areas starting early morning.",      R.mipmap.ic_launcher),
            NewsItem("Safety: New Fire Prevention Campaign Launched",    "Authorities urge residents to check gas cylinders and electrical wiring before winter..", R.mipmap.ic_launcher)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)

        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}
