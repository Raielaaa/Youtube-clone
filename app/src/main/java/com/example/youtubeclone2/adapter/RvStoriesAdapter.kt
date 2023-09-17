package com.example.youtubeclone2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.databinding.RvStoriesBinding
import com.example.youtubeclone2.model.RvStoriesModel

class RvStoriesAdapter(
    private val collections: List<RvStoriesModel>
): RecyclerView.Adapter<RvStoriesAdapter.RvStoriesViewHolder>() {
    inner class RvStoriesViewHolder(private val binding: RvStoriesBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(currentList: RvStoriesModel) {
            binding.apply {
                ivStoryThumbnail.setImageURI(currentList.ivStoryThumbnail)
                ivStoryChannel.setImageURI(currentList.ivStoryChannel)
                tvStoryTitle.text = currentList.tvStoryTitle
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvStoriesViewHolder {
        val binding: RvStoriesBinding = RvStoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvStoriesViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvStoriesViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}