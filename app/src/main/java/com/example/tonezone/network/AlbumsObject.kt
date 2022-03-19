package com.example.tonezone.network

data class AlbumsObject(
    val albums: Albums
)

data class Albums(
    val items: List<Album>
)

data class Album(
    val id: String?="",
    val album_type: String?="",
    val images: List<Image>?= listOf(),
    val name: String?="",
    val uri: String?="",
    val artists: List<Artist>? = listOf(),
    val release_date: String? = "",
    val type: String?=""
)