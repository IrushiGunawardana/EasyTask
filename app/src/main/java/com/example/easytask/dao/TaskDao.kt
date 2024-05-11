package com.example.easytask.dao

import androidx.room.*
import com.example.easytask.models.Task



@Dao
interface TaskDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: Task): Long

}