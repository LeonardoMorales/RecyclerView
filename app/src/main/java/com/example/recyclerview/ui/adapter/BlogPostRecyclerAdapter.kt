package com.example.recyclerview.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerview.R
import com.example.recyclerview.model.BlogPost
import com.example.recyclerview.utils.ToSimpleString
import com.google.android.material.chip.Chip
import kotlinx.android.synthetic.main.layout_blogpost_item.view.*
import java.util.*

class BlogPostRecyclerAdapter(var items: List<BlogPost>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogPostViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_blogpost_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        holder.setIsRecyclable(false)

        when(holder) {
            is BlogPostViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class BlogPostViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        var autor = itemView.tvAutor
        var imagen = itemView.ivFoto
        var titulo = itemView.tvTitulo
        var fecha = itemView.tvFecha
        var chips = itemView.chipGroup

        fun bind(blogPost: BlogPost) {

            autor.text = blogPost.autor
            titulo.text = blogPost.titulo

            val date = Date()
            date.time = blogPost.fecha * 1000
            fecha.text = ToSimpleString.convert(date)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(blogPost.foto)
                .into(imagen)

            chips.isSingleSelection = true
            chips.setChipSpacing(20)

            for(index in blogPost.hashtags) {
                val chip = Chip(chips.context)
                chip.text = index.titulo

                chips.addView(chip)
            }
        }

    }

}