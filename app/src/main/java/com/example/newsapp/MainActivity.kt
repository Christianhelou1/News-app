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
            NewsItem("Breaking: Explosion in Lebanon",   "A major Explosion struck downtown today causing damage.", R.mipmap.ic_launcher),
            NewsItem("Sports: Sagesse Team Wins Championship",   "The local team won the national championship last night.",  R.mipmap.ic_launcher),
            NewsItem("Tech: New iPhone Released",         "A new flagship smartphone was unveiled at the expo.",       R.mipmap.ic_launcher),
            NewsItem("Health: New COVID Vaccine Approved in Lebanon",     "Health officials approved a new vaccine for the virus.",    R.mipmap.ic_launcher),
            NewsItem("Economy: Lebanese pound Hit Record High", "Stock markets reached an all-time high this morning.",      R.mipmap.ic_launcher),
            NewsItem("Weather: Storm Warning Issued",    "Authorities issued a storm warning for the coastal areas.", R.mipmap.ic_launcher)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)

        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}