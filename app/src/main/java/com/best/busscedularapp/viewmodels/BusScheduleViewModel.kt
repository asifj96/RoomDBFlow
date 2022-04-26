package com.best.busscedularapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.best.busscedularapp.db.schedule.Schedule
import com.best.busscedularapp.db.schedule.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDao: ScheduleDao) : ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()
    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}

class BusScheduleViewModelFactory(private val scheduleDao: ScheduleDao) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BusScheduleViewModel::class.java)) {

            return BusScheduleViewModel(scheduleDao) as T
        }

        throw IllegalArgumentException("Unknown ViewModel  class")
    }

}