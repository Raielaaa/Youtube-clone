package com.example.youtubeclone2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.databinding.RvSubscriptionsTopChannelsBinding
import com.example.youtubeclone2.model.RvSubscriptionsTopChannelsModel

class RvSubscriptionsTopChannelsAdapter(
    private val collections: List<RvSubscriptionsTopChannelsModel>
): RecyclerView.Adapter<RvSubscriptionsTopChannelsAdapter.RvSubscriptionsTopChannelViewHolder>() {
    inner class RvSubscriptionsTopChannelViewHolder(private val binding: RvSubscriptionsTopChannelsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(collections: RvSubscriptionsTopChannelsModel) {
            val lengthCheck: String = collections.channelName
            var finalString: String = ""
            if (lengthCheck.length >= 7) {
                try {
                    finalString = lengthCheck.substring(0, 8)
                    binding.tvChannelName.text = "$finalString.."
                } catch (ignored: Exception) {
                    binding.tvChannelName.text = collections.channelName
                }

            } else binding.tvChannelName.text = collections.channelName

            binding.ivChannelPic.setImageURI(collections.uriChannelPic)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RvSubscriptionsTopChannelViewHolder {
        val binding: RvSubscriptionsTopChannelsBinding = RvSubscriptionsTopChannelsBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return RvSubscriptionsTopChannelViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: RvSubscriptionsTopChannelViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}