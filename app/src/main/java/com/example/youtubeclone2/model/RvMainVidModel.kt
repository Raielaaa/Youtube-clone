package com.example.youtubeclone2.model

import android.net.Uri

data class RvMainVidModel(
    val uri_thumbnail: Uri,
    val uri_channelIcon: Uri,
    val tvTitleTop: String,
    val tvTitleBottom: String,
    val tvDuration: String
)