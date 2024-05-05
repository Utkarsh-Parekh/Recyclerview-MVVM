package com.example.mvvmrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmrecyclerview.Adapter.TravelAdapter
import com.example.mvvmrecyclerview.Model.Travel
import com.example.mvvmrecyclerview.ViewModel.TravelViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var travelAdapter: TravelAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var travelViewModel: TravelViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        travelAdapter = TravelAdapter(ArrayList())

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = travelAdapter
        }

        travelViewModel = ViewModelProvider(this)[TravelViewModel::class.java]
        travelViewModel.getData()
        travelViewModel.travellingdata.observe(this, Observer {
            travelAdapter.setData(it as ArrayList<Travel>)
        })
    }
}