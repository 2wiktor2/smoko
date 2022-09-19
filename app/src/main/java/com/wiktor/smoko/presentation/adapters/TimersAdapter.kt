package com.wiktor.smoko.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.wiktor.smoko.R
import com.wiktor.smoko.domain.MyTimer
import com.wiktor.smoko.presentation.TimerItemDiffCallback
import com.wiktor.smoko.presentation.TimersViewHolder

class TimersAdapter : ListAdapter<MyTimer, TimersViewHolder>(TimerItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimersViewHolder {

        val layout = when (viewType) {
            VIEW_TYPE_ACTIVE -> R.layout.item_timer_active
            VIEW_TYPE_INACTIVE -> R.layout.item_timer_inactive
            else -> throw RuntimeException("Unknown view type: $viewType")
        }
        val view =
            LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return TimersViewHolder(view)
    }

    override fun onBindViewHolder(holder: TimersViewHolder, position: Int) {
        val timer = getItem(position)

        holder.textViewTimer.text = if (timer.isActive) {
            "RUNNING"
        } else {
            "STOPPED"
        }
        holder.textViewName.text = timer.name
        holder.textViewCreatedDate.text = timer.created
        holder.textViewInterval.text = timer.startInterval

    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item.isActive) {
            VIEW_TYPE_ACTIVE
        } else {
            VIEW_TYPE_INACTIVE
        }

    }

    companion object {
        const val VIEW_TYPE_ACTIVE = 100
        const val VIEW_TYPE_INACTIVE = 101
        const val MAX_POOL_SIZE = 30
    }
}
