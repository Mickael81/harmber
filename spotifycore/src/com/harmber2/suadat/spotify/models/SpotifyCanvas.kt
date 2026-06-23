/*
 * harmber (2026)
 * © Rukamori — github.com/suadatbiniqbal
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package com.harmber2.suadat.spotify.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SpotifyCanvasResponse(
    val canvases: List<SpotifyCanvas> = emptyList()
)

@Serializable
data class SpotifyCanvas(
    val id: String = "",
    val url: String = "",
    val type: String = "", // IMAGE, VIDEO
    @SerialName("canvas_uri") val canvasUri: String? = null,
    @SerialName("artist_id") val artistId: String? = null,
    @SerialName("artist_name") val artistName: String? = null,
    @SerialName("track_uri") val trackUri: String? = null
)
