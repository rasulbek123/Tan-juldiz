package com.example.tanjuldizi.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.tanjuldizi.data.models.Qosiqlar

@Dao
interface QosiqlarDao {
    @Query ("SELECT * FROM Qosiqlar")
    fun getAll():List<Qosiqlar>
}