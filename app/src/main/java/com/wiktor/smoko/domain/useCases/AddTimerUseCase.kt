package com.wiktor.smoko.domain.useCases

import com.wiktor.smoko.data.database.MyTimerDbModel

class AddTimerUseCase(private val timersRepository: TimersRepository) {
    fun addTimer(myTimerDbModel: MyTimerDbModel) {
        timersRepository.addTimer(myTimerDbModel)
    }
}