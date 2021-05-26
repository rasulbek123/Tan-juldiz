package com.example.tanjuldizi.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Qosiqlar")
data class Qosiqlar (
    @PrimaryKey
    val id:Int,
    @ColumnInfo (name = "name") val name :String,
    @ColumnInfo (name = "text") val text:String,
    @ColumnInfo(name = "is-Favorite") var isFavorite:Int,
    @ColumnInfo(name = "deportment-id") val deportmentId:Int?,
    @ColumnInfo(name = "category-id") val categoryId:Int
)