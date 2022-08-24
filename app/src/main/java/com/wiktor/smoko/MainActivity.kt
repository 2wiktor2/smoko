package com.wiktor.smoko

import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var textViewTime: TextView
    private lateinit var buttonStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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