package com.wiktor.smoko.domain.useCases

import com.wiktor.smoko.data.database.MyTimerDbModel

class GetTimerUseCase(private val timersRepository: TimersRepository) {
    fun getTimer(timerId: Int): MyTimerDbModel {
        return timersRepository.getTimer(timerId)
    }
}