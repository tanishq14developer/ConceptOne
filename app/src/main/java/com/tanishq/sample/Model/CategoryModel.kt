package com.tanishq.sample.Model


import com.google.gson.annotations.SerializedName

data class CategoryModel(
    @SerializedName("code")
    val code: String,
    @SerializedName("data")
    val `data`: List<Data>
)