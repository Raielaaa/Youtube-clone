package com.example.youtubeclone2.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.R
import com.example.youtubeclone2.databinding.RvHomeTopGenreBinding
import com.example.youtubeclone2.model.RvHomeTopGenreModel

class RvHomeTopGenreAdapter(
    private val collections: List<RvHomeTopGenreModel>
): RecyclerView.Adapter<RvHomeTopGenreAdapter.RvHomeTopGenreAdapterViewHolder>() {
    inner class RvHomeTopGenreAdapterViewHolder(private val binding: RvHomeTopGenreBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(dataFromModel: String, currentPosition: Int) {
            binding.tvGenre.text = dataFromModel
            if (dataFromModel == "All") {
                binding.apply {
                    tvGenre.setTextColor(Color.parseColor("#FFFFFF"))
                    clHolder.setBackgroundResource(R.drawable.first_index_genre_background)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RvHomeTopGenreAdapterViewHolder {
        val binding: RvHomeTopGenreBinding = RvHomeTopGenreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvHomeTopGenreAdapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvHomeTopGenreAdapterViewHolder, position: Int) {
        holder.bind(collections[position].tvGenre, position)
    }
}