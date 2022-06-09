package com.example.applicationfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CalendarioActivity : AppCompatActivity() {
    CompactCalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario)
    }
}