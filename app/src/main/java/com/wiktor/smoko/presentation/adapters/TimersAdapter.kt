package com.wiktor.smoko.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wiktor.smoko.R
import com.wiktor.smoko.domain.MyTimer

class TimersAdapter : RecyclerView.Adapter<TimersAdapter.TimersViewHolder>() {

    var timersList: List<MyTimer> = listOf()
    var onTimerClickListener: OnTimerClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimersViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_timer, parent, false)
        return TimersViewHolder(view)
    }

    override fun onBindViewHolder(holder: TimersViewHolder, position: Int) {
        val timer = timersList.get(position)

        holder.textViewName.text = timer.name
        holder.textViewCreatedDate.text = timer.created
        holder.textViewInterval.text = timer.startInterval

        holder.itemView.setOnClickListener {
            onTimerClickListener?.onTimerClick(timer)
        }
    }

    override fun getItemCount(): Int {
        return timersList.size
    }

    inner class TimersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textViewName: TextView = itemView.findViewById(R.id.textView_name)
        val textViewTimer: TextView = itemView.findViewById(R.id.textView_timer)
        val textViewCreatedDate: TextView = itemView.findViewById(R.id.textView_created)
        val textViewInterval: TextView = itemView.findViewById(R.id.textView_interval)
    }

    interface OnTimerClickListener {
        fun onTimerClick(timer: MyTimer)
    }
}
