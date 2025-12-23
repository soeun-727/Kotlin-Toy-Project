package com.soeun.kotlin_toy_project

import androidx.room.Dao
import androidx.room.Query
@Dao
interface PlaceDao {
    // category 또는 category2가 입력받은 값과 일치하는 데이터 검색
    @Query("SELECT * FROM places WHERE category = :keyword OR category2 = :keyword")
    fun getPlacesByKeyword(keyword: String): List<Place>
}
