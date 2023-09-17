package com.example.youtubeclone2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.databinding.RvNewsBinding
import com.example.youtubeclone2.model.RvNewsModel

class RvNewsAdapter(
    private val collections: List<RvNewsModel>
): RecyclerView.Adapter<RvNewsAdapter.RvNewsViewHolder>() {
    inner class RvNewsViewHolder(private val binding: RvNewsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(currentList: RvNewsModel) {
            binding.apply {
                ivNewsPic.setImageURI(currentList.uri_news_pic)
                tvNewsPosition.text = currentList.tvNewsPosition
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvNewsViewHolder {
        val binding: RvNewsBinding = RvNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvNewsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvNewsViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}