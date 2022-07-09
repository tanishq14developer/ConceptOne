package com.tanishq.sample.Model


import com.google.gson.annotations.SerializedName

data class Child(
    @SerializedName("count")
    val count: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("parent")
    val parent: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("type")
    val type: Int
)