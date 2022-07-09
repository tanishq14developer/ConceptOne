package com.tanishq.sample.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tanishq.sample.Model.Data
import com.tanishq.sample.R

class CategoryAdapter(val context: Context, val itemList: List<Data>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.categoryName.text = itemList[position].name
        Glide.with(context).load("https://media.homedrop.in/media/categories/new/tiffin.webp").into(holder.categoryImage)

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val categoryName: TextView = view.findViewById(R.id.item_title)
        val categoryImage: ImageView = view.findViewById(R.id.item_image)
    }
}
