package com.example.youtubeclone2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.databinding.RvMainVidBinding
import com.example.youtubeclone2.model.RvMainVidModel

class RvMainVidAdapter(
    private val collections: List<RvMainVidModel>
): RecyclerView.Adapter<RvMainVidAdapter.RvMainVidViewHolder>() {
    inner class RvMainVidViewHolder(private val binding: RvMainVidBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(currentList: RvMainVidModel) {
            binding.apply {
                ivThumbnail.setImageURI(currentList.uri_thumbnail)
                ivChannelIcon.setImageURI(currentList.uri_channelIcon)
                tvTopTitle.text = currentList.tvTitleTop
                tvBottomTitle.text = currentList.tvTitleBottom
                tvDuration.text = currentList.tvDuration
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvMainVidViewHolder {
        val binding: RvMainVidBinding = RvMainVidBinding.inflate(LayoutInflater.from(parent.context), parent,  false)
        return RvMainVidViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvMainVidViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}