package com.wiktor.smoko.presentation

import androidx.recyclerview.widget.DiffUtil
import com.wiktor.smoko.domain.MyTimer

// это класс принимает два списка и говорит как их сравнивать
class TimersListDiffCallback(
    private val oldList: List<MyTimer>,
    private val newList: List<MyTimer>,
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        // Здесь нужно стравнить одинаковые ли элементы списка. В нашем случае мы будем знать,
        // что работаем с одним и тем же элементом если у него тот же Id.
        // даже если все поля изменились.
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        // этот метод проверяет поменялись ли поля самого объекта
        // если поля изменились то объект нужно перерисовать, если нет то перерисовывать не нужно.
        // метод должен вернуть true если все поля остались прежними
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        // сравнение по equals. т.к. это дата класс то метод equals переопределен.
        return oldItem == newItem
    }
}