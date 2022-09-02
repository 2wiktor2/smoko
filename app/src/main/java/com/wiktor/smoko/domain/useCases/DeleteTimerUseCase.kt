package com.wiktor.smoko.domain.useCases

import com.wiktor.smoko.data.database.MyTimerDbModel

class DeleteTimerUseCase(private val timersRepository: TimersRepository) {
    fun deleteTimer(myTimerDbModel: MyTimerDbModel) {
        timersRepository.deleteTimer(myTimerDbModel)
    }
}