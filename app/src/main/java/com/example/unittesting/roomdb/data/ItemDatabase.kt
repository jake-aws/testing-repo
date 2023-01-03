package com.example.unittesting.roomdb.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Item::class],
    version = 1
)
abstract class ItemDatabase :RoomDatabase(){
    abstract fun itemDAO():ItemDAO
}