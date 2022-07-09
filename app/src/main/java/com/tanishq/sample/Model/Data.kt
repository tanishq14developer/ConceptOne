package com.tanishq.sample.Model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("child")
    val child: List<Child>,
    @SerializedName("count")
    val count: Int,
    @SerializedName("icon")
    val icon: String,
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