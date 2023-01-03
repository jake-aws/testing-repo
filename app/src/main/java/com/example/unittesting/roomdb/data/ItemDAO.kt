package com.example.unittesting.roomdb.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ItemDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: Item)

    @Delete
    suspend fun deleteItem(item: Item)

    @Query("SELECT * FROM data_items")
    fun observeAllItems(): LiveData<List<Item>>

    @Query("SELECT SUM(price) FROM data_items")
    fun getTotalPrice():LiveData<Float>
}