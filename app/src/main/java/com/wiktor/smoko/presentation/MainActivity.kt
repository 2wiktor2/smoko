package com.wiktor.smoko.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.wiktor.smoko.R
import com.wiktor.smoko.domain.MyTimer
import com.wiktor.smoko.presentation.adapters.TimersAdapter


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = TimersAdapter()
        adapter.onTimerClickListener = object : TimersAdapter.OnTimerClickListener {
            override fun onTimerClick(timer: MyTimer) {
                val intent = Intent(this@MainActivity, TimerDetailActivity::class.java)
                startActivity(intent)
            }

        }

        val listOfTimers = mutableListOf<MyTimer>()
        listOfTimers.add(MyTimer(name = "Timer1"))
        listOfTimers.add(MyTimer(name = "Timer2"))
        listOfTimers.add(MyTimer(name = "Timer3"))
        listOfTimers.add(MyTimer(name = "Timer4"))
        listOfTimers.add(MyTimer(name = "Timer5"))
        listOfTimers.add(MyTimer(name = "Timer6"))
        listOfTimers.add(MyTimer(name = "Timer7"))
        listOfTimers.add(MyTimer(name = "Timer8"))


        adapter.timersList = listOfTimers


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView_timers)
        recyclerView.adapter = adapter


/*
        textViewTime = findViewById(R.id.textView_time)
        textViewTime.text = "00:00"
        buttonStart = findViewById(R.id.button_start)

        val picker =
            MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_12H)
                .setHour(12)
                .setMinute(10)
                .setTitleText("Select Appointment time")
                .build()

        val isSystem24Hour = is24HourFormat(this)
        val clockFormat = if (isSystem24Hour) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H

        // Как в Java
        buttonStart.setOnClickListener {
            textViewTime.text =
                Calendar.getInstance().get(Calendar.HOUR).toString() + ":" + Calendar.getInstance()
                    .get(Calendar.MINUTE).toString()
        }
*/


//Calendar.getInstance().get(Calendar.YEAR)


/*
        // тестовый краш
        //кнопка с тестовым крашем
        val crashButton = Button(this)
        crashButton.text = "Test Crash"
        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }

        addContentView(
            crashButton, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )
*/


    }

}