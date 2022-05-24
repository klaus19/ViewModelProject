package com.example.viewmodelproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[CounterViewmodel::class.java]

        findViewById<Button>(R.id.btnClick).setOnClickListener {
            viewModel.incrementByOne()
        }

        viewModel.counterLiveData.observe(this){
            findViewById<TextView>(R.id.txtCounter).text = it.toString()
        }
    }
}