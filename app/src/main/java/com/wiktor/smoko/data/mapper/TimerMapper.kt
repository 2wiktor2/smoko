package com.wiktor.smoko.data.mapper

import com.wiktor.smoko.data.database.MyTimerDbModel
import com.wiktor.smoko.domain.MyTimer

class TimerMapper {
    fun mapDbModelToEntity(dbModel: MyTimerDbModel): MyTimer {
        return MyTimer(name = dbModel.name,
            created = dbModel.created,
            startInterval = dbModel.startInterval,
            incrementInterval = dbModel.incrementInterval,
            perPeriod = dbModel.perPeriod,
            notification = dbModel.notification,
            isActive = dbModel.isActive,
            id = dbModel.id
        )
    }
}