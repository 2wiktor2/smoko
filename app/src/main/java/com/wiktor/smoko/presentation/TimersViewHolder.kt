package com.wiktor.smoko.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wiktor.smoko.R
import com.wiktor.smoko.domain.MyTimer

class TimersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textViewName: TextView = itemView.findViewById(R.id.textView_name)
    val textViewTimer: TextView = itemView.findViewById(R.id.textView_timer)
    val textViewCreatedDate: TextView = itemView.findViewById(R.id.textView_created)
    val textViewInterval: TextView = itemView.findViewById(R.id.textView_interval)
}

interface OnTimerClickListener {
    fun onTimerClick(timer: MyTimer)
}