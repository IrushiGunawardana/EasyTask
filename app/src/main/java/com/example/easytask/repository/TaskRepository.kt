package com.example.easytask.repository

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.easytask.database.TaskDatabase
import com.example.easytask.models.Task
import com.example.easytask.utils.Resource
import com.example.easytask.utils.Resource.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskRepository(application: Application) {


    private val taskDao = TaskDatabase.getInstance(application).taskDao

    fun insertTask(task: Task) = MutableLiveData<Resource<Long>>().apply {
        postValue(Resource.Loading())
        try{
          CoroutineScope(Dispatchers.IO).launch {
              val result = taskDao.insertTask(task)
              postValue(Success(result.toString())) //different
          }
        }catch (e :Exception){
              postValue(Error(e.message.toString()))
        }

    }
}