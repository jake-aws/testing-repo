package com.example.unittesting.roomdb.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data_items")
data class Item(var name:String, var price:Float,@PrimaryKey(autoGenerate = true)val id:Int? = null)
