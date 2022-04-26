package com.best.busscedularapp

import android.app.Application
import com.best.busscedularapp.db.AppDatabase

class BusScheduleApplication() : Application() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }

    override fun onCreate() {
        super.onCreate()
    }
}