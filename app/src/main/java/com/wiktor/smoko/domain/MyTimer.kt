package com.wiktor.smoko.domain

data class MyTimer(
    val name: String? = " null",
    val created: String? = "null",
    val startInterval: String? = "null",
    val incrementInterval: String? = "null",
    val perPeriod: String? = "null",
    val notification: Boolean = false,
)