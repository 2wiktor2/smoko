package com.wiktor.smoko.domain.useCases

import com.wiktor.smoko.data.database.MyTimerDbModel

class GetTimersListUseCase(private val timersRepository: TimersRepository) {
    fun getTimersList(): List<MyTimerDbModel> {
       return timersRepository.getTimersList()
    }
}