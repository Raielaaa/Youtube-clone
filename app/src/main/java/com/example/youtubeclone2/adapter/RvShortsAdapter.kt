package com.example.youtubeclone2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.databinding.RvShortsSubscriptionBinding
import com.example.youtubeclone2.model.RvShortsModel

class RvShortsAdapter(
    private val collections: List<RvShortsModel>
): RecyclerView.Adapter<RvShortsAdapter.RvShortsViewHolder>() {
    inner class RvShortsViewHolder(private val binding: RvShortsSubscriptionBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(currentList: RvShortsModel) {
            binding.apply {
                ivShortsThumbnail.setImageURI(currentList.ivShortsThumbnail)
                tvBanner.text = currentList.tvBanner
                tvViews.text = currentList.tvViews
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvShortsViewHolder {
        val binding: RvShortsSubscriptionBinding = RvShortsSubscriptionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return RvShortsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvShortsViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}