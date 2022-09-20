package com.wiktor.smoko.presentation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.wiktor.smoko.R
import com.wiktor.smoko.domain.MyTimer
import com.wiktor.smoko.presentation.adapters.TimersAdapter


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var viewModel : TimerViewModel
    private lateinit var timersAdapter: TimersAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()

        var fab = findViewById<FloatingActionButton>(R.id.fab_new_timer)
        fab.setOnClickListener(this)


        val listOfTimers = mutableListOf<MyTimer>()
        listOfTimers.add(MyTimer(name = "Timer1", id = 1, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer2", id = 2, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer3", id = 3, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer4", id = 4, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer5", id = 5, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer6", id = 6, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer7", id = 7, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer8", id = 8, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer9", id = 9, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer10", id = 10, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer11", id = 11, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer12", id = 12, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer13", id = 13, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer14", id = 14, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer15", id = 15, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer16", id = 16, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer17", id = 17, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer18", id = 18, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer19", id = 19, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer20", id = 20, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer21", id = 21, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer22", id = 22, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer23", id = 23, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer24", id = 24, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer25", id = 25, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer26", id = 26, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer27", id = 27, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer28", id = 28, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer29", id = 29, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer30", id = 30, isActive = true))
        listOfTimers.add(MyTimer(name = "Timer31", id = 31, isActive = false))
        listOfTimers.add(MyTimer(name = "Timer32", id = 32, isActive = true))


        //adapter.timersList = listOfTimers
        timersAdapter.submitList(listOfTimers)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab_new_timer -> startDetailActivity()
        }
    }

    private fun startDetailActivity() {
        val intent = Intent(this@MainActivity, TimerDetailActivity::class.java)
        startActivity(intent)
    }

    private fun setupRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView_timers)
        with(recyclerView) {
            timersAdapter = TimersAdapter()
            adapter = timersAdapter
            recycledViewPool.setMaxRecycledViews(TimersAdapter.VIEW_TYPE_ACTIVE,
                TimersAdapter.MAX_POOL_SIZE)
            recycledViewPool.setMaxRecycledViews(TimersAdapter.VIEW_TYPE_INACTIVE,
                TimersAdapter.MAX_POOL_SIZE)
        }

        timersAdapter.onTimerLongClickListener = object :TimersAdapter.OnTimerLongClickListener{
            override fun onTimerLongClick(myTimer: MyTimer) {

            }

        }
    }
}