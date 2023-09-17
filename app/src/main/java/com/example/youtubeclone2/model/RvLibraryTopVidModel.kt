package com.example.youtubeclone2.model

import android.net.Uri

data class RvLibraryTopVidModel(
    val uri_pic_top: Uri,
    val headerTop: String,
    val headerBottom: String,
    val duration: String,
    val isWatched: Boolean
)