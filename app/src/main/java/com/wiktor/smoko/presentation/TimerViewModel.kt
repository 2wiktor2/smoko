package com.wiktor.smoko.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wiktor.smoko.data.database.MyTimerDbModel
import com.wiktor.smoko.data.database.TimersListRepositoryImpl
import com.wiktor.smoko.domain.useCases.*
import kotlinx.coroutines.launch

//class TimerViewModel(application: Application) : AndroidViewModel(application) {
class TimerViewModel(application: Application) : ViewModel() {

    private val repository = TimersListRepositoryImpl(application)
    private val addTimerUseCase = AddTimerUseCase(repository)
    private val deleteAllTimersUseCase = DeleteAllTimersUseCase(repository)
    private val deleteTimerUseCase = DeleteTimerUseCase(repository)
    private val editTimerUseCase = EditTimerUseCase(repository)
    private val getTimersListUseCase = GetTimersListUseCase(repository)
    private val getTimerUseCase = GetTimerUseCase(repository)

    init {
        viewModelScope.launch {
            getTimersListUseCase
        }
    }

    fun addTimer(myTimerDbModel: MyTimerDbModel) = addTimerUseCase.addTimer(myTimerDbModel)

    fun getTimersList() = getTimersListUseCase

    fun getTimer(timerId: Int) = getTimerUseCase

    fun editTimer(myTimerDbModel: MyTimerDbModel) = editTimerUseCase

    fun deleteTimer(myTimerDbModel: MyTimerDbModel) = deleteTimerUseCase

    fun deleteAllTimers() = deleteAllTimersUseCase

}