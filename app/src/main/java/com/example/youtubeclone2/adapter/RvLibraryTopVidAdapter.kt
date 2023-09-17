package com.example.youtubeclone2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.databinding.RvLibraryTopVidBinding

class RvLibraryTopVidAdapter(
    private val collections: List<com.example.youtubeclone2.model.RvLibraryTopVidModel>
): RecyclerView.Adapter<RvLibraryTopVidAdapter.RvLibraryTopVidModel>() {
    inner class RvLibraryTopVidModel(private val binding: RvLibraryTopVidBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(currentListLibrary: com.example.youtubeclone2.model.RvLibraryTopVidModel) {
            binding.apply {
                ivThumbnailTop.setImageURI(currentListLibrary.uri_pic_top)
                tvHeaderTop.text = currentListLibrary.headerTop
                tvHeaderBottom.text = currentListLibrary.headerBottom
                tvDuration.text = currentListLibrary.duration
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvLibraryTopVidModel {
        val binding: RvLibraryTopVidBinding = RvLibraryTopVidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvLibraryTopVidModel(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvLibraryTopVidModel, position: Int) {
        holder.bind(collections[position])
    }
}