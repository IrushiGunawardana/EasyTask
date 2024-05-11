package com.example.easytask

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easytask.databinding.ActivityMainBinding
import android.widget.ImageView
import com.example.easytask.utils.setupDialog

class MainActivity : AppCompatActivity() {

    private val mainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val addTaskDialog: Dialog by lazy {
        Dialog(this, R.style.DialogCustomTheme).apply {
            setupDialog(R.layout.add_task_dialog)
        }
    }

    private val updateTaskDialog: Dialog by lazy {
        Dialog(this, R.style.DialogCustomTheme).apply {
            setupDialog(R.layout.update_task_layout)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)



        // Add task start
        val addCloseImg = addTaskDialog.findViewById<ImageView>(R.id.closeImg)
        val updateCloseImg = updateTaskDialog.findViewById<ImageView>(R.id.closeImg)

        addCloseImg.setOnClickListener { addTaskDialog.dismiss() }
        updateCloseImg.setOnClickListener { updateTaskDialog.dismiss() }

        mainBinding.addTaskFABtn.setOnClickListener {
            addTaskDialog.show()
        }
    }
}