package com.wiktor.smoko.domain.useCases

import com.wiktor.smoko.data.database.MyTimerDbModel

interface TimersRepository {
    fun getTimersList(): List<MyTimerDbModel>
    fun getTimer(timerId: Int): MyTimerDbModel
    fun addTimer(myTimerDbModel: MyTimerDbModel)
    fun editTimer(myTimerDbModel: MyTimerDbModel)
    fun deleteTimer(myTimerDbModel: MyTimerDbModel)
    fun deleteAllTimers()
}