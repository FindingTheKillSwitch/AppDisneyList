package com.alexisserapio.appdisneylist.data.remote.model

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("_id")
    var _id: Int,
    @SerializedName("name")
    var name:String,
    @SerializedName("createdAt")
    var createdAt:String
)