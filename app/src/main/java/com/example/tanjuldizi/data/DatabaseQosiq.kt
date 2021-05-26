package com.example.tanjuldizi.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tanjuldizi.data.dao.QosiqlarDao
import com.example.tanjuldizi.data.models.Qosiqlar

@Database(entities = [Qosiqlar::class],version = 1)
abstract class DatabaseQosiq:RoomDatabase() {
    companion object{
        private lateinit var INSTANCE:DatabaseQosiq
        fun getInstance(context: Context):DatabaseQosiq =
            Room.databaseBuilder(
                context,
                DatabaseQosiq::class.java,
                "Tan_Juldiz.db"
            )   .createFromAsset("Tan_Juldiz.db")
                .allowMainThreadQueries()
                .build()
    }
    abstract fun QosiqDao():QosiqlarDao
}