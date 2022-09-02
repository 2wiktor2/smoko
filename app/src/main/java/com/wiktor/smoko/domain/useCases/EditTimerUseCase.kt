package com.wiktor.smoko.domain.useCases

import com.wiktor.smoko.data.database.MyTimerDbModel

class EditTimerUseCase(private val timersRepository: TimersRepository) {
    fun editTimer(myTimerDbModel: MyTimerDbModel) {
        timersRepository.editTimer(myTimerDbModel)
    }
}