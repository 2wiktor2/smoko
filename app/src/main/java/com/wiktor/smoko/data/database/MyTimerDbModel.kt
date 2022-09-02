package com.wiktor.smoko.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MyTimers")
data class MyTimerDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String? = "MyTimer",
    val created: String? = null,
    val startInterval: String? = "null",
//    Если вы хотите, чтобы имя столбца в таблице отличалось от имени переменной-члена,
//    укажите это имя. Это назовет столбец «increment».
    @ColumnInfo(name = "increment")
    val incrementInterval: Int = 0,
    val perPeriod: String? = "null",
    val notification: Boolean = false,
)