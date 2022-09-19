package com.wiktor.smoko.presentation

import androidx.recyclerview.widget.DiffUtil
import com.wiktor.smoko.domain.MyTimer

// Класс для сравнения отдельных элементов
class TimerItemDiffCallback : DiffUtil.ItemCallback<MyTimer>() {
    override fun areItemsTheSame(oldItem: MyTimer, newItem: MyTimer): Boolean {
       return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MyTimer, newItem: MyTimer): Boolean {
       return oldItem == newItem
    }
}