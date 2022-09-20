package com.wiktor.smoko.domain.useCases

class DeleteAllTimersUseCase(private val timersRepository: TimersRepository) {
    fun deleteAllTimers() {
        timersRepository.deleteAllTimers()
    }
}