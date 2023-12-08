package com.example.lab3_mp_habel_073

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val categories: List<kategori>) :
    RecyclerView.Adapter<ListAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.container.setBackgroundResource(category.bg)
        holder.gambar.setImageResource(category.gambar)
        holder.judul.text = category.judul
        holder.calories.text = category.calories
        holder.time.text = category.time
    }

    override fun getItemCount(): Int = categories.size

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val container: View = itemView.findViewById(R.id.container)
        val gambar: ImageView = itemView.findViewById(R.id.gambar)
        val judul: TextView = itemView.findViewById(R.id.judul)
        val calories: TextView = itemView.findViewById(R.id.calories)
        val time: TextView = itemView.findViewById(R.id.time)
    }
}