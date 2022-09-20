package com.wiktor.smoko.data.database

import android.app.Application
import androidx.lifecycle.LiveData
import com.wiktor.smoko.data.mapper.TimerMapper
import com.wiktor.smoko.domain.useCases.TimersRepository

class TimersListRepositoryImpl(private val application: Application) : TimersRepository {

    private val timerList = mutableListOf<MyTimerDbModel>()
    private val timerDao = AppDataBase.getInstance(application).timerDao()
    private val mapper = TimerMapper()

    override fun getTimersList(): List<MyTimerDbModel> {
        return timerList
    }

    override fun addTimer(myTimerDbModel: MyTimerDbModel) {
//        timerList.add(myTimerDbModel)
    }

    override fun getTimer(timerId: Int): MyTimerDbModel {
        return timerList.find { it.id == timerId }
            ?: throw  RuntimeException("Element with id = $timerId not found")
    }

    override fun editTimer(myTimerDbModel: MyTimerDbModel) {
//        val oldElement = getTimer(myTimerDbModel.id)
//        timerList.remove(oldElement)
//        addTimer(myTimerDbModel)
    }

    override fun deleteTimer(myTimerDbModel: MyTimerDbModel) {
//        timerList.remove(myTimerDbModel)
    }

    override fun deleteAllTimers() {
//        timerList.clear()
    }
}