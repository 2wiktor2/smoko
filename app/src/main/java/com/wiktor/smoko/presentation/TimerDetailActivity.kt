package com.wiktor.smoko.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.wiktor.smoko.R
import com.wiktor.smoko.TimerViewModel

class TimerDetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var viewModel: TimerViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_detail)

 //      viewModel = ViewModelProvider(this)[ TimerViewModel :: class.java]

        val buttonStart = findViewById<Button>(R.id.button_start)
        buttonStart.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_start -> {
                finish()
            }
        }
    }
}