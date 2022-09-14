package com.ewaldo.view_binding_10859

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ewaldo.view_binding_10859.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}