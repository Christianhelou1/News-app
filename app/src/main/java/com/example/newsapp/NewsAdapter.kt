package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val newsList: List<NewsItem>) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.newsTitle)
        val description: TextView = itemView.findViewById(R.id.newsDescription)
        val image: ImageView = itemView.findViewById(R.id.newsImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = newsList[position]
        holder.title.text = item.title
        holder.description.text = item.description
        holder.image.setImageResource(item.image)
    }

    override fun getItemCount() = newsList.size
}