package com.wiktor.smoko

import androidx.room.Entity

@Entity(tableName = "timers")
data class TimerEntity(
    val name: String? = null,
    val startInterval: String? = null,
    val incrementInterval: String? = null,
    val perPeriod: String? = null,
    val notification: Boolean = false,
)