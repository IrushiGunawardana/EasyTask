package com.example.easytask.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.easytask.models.Task
import com.example.easytask.repository.TaskRepository
import com.example.easytask.utils.Resource


class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val taskRepository = TaskRepository(application)

    fun insertTask(task: Task): MutableLiveData<Resource<Long>> {

        return taskRepository.insertTask(task)
    }
}