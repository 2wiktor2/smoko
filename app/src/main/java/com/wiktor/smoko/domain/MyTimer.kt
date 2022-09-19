package com.wiktor.smoko.domain

data class MyTimer(
    val name: String? = " null",
    val created: String? = "null",
    val startInterval: String? = "null",
    val incrementInterval: Int? = 0,
    val perPeriod: String? = "null",
    val notification: Boolean = false,
    val isActive: Boolean = false,
    val id: Int
)