package com.bitmask.android.compose

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel: ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChange(item: WellnessTask, checked: Boolean) {
        _tasks.find { it.id == item.id }?.let { tasks ->
            tasks.checked = checked
        }
    }
}