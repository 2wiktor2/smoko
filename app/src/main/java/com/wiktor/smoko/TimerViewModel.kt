package com.wiktor.smoko

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.wiktor.smoko.data.database.AppDataBase
import com.wiktor.smoko.data.database.MyTimerDbModel

class TimerViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDataBase.getInstance(application)
    //   private var timers : LiveData<List<MyTimerDbModel>> =
    //private val compositeDisposable = CompositeDisposable()

    fun getTimersList() = db.timerDao().getAllTamers()

    fun getTimer(timerId: Int) = db.timerDao().getTimerById(timerId)

    fun updateTimer(myTimerDbModel: MyTimerDbModel) = db.timerDao().editTimer(myTimerDbModel)

    fun deleteTimer(myTimerDbModel: MyTimerDbModel) = db.timerDao().deleteTimer(myTimerDbModel)


}