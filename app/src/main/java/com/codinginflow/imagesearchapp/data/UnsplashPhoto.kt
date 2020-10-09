package com.codinginflow.imagesearchapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto (
    val id: String,
    val description: String?,
    val urls: UnplashPhotoUrls,
    val user: UnplashUser,

    ):Parcelable {
    @Parcelize
    data class UnplashPhotoUrls (
        val raw :String,
        val full :String,
        val regular :String,
        val small :String,
        val thumb :String,
    ):Parcelable
    @Parcelize
    data class UnplashUser(
        val name: String,
        val username: String,

    ):Parcelable
    {
        val attributionUrl get() = "https://unplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }

}