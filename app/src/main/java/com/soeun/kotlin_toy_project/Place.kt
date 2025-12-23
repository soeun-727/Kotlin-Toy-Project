package com.soeun.kotlin_toy_project

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "places")
data class Place(
    @PrimaryKey val id: Int,
    val name: String,
    val category: String,
    val category2: String?,
    val link: String?,
    val star: String?
)