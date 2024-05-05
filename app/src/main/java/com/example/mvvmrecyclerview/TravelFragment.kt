package com.example.mvvmrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmrecyclerview.Adapter.TravelAdapter
import com.example.mvvmrecyclerview.Model.Travel
import com.example.mvvmrecyclerview.ViewModel.TravelViewModel
import com.example.mvvmrecyclerview.databinding.FragmentTravelBinding

class TravelFragment : Fragment() {

    private lateinit var binding: FragmentTravelBinding
    private lateinit var travelAdapter: TravelAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var travelViewModel: TravelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_travel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerview)

        travelAdapter = TravelAdapter(ArrayList())

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = travelAdapter
        }

        travelViewModel = ViewModelProvider(this)[TravelViewModel::class.java]
        travelViewModel.getData()
        travelViewModel.travellingdata.observe(viewLifecycleOwner, Observer {
            travelAdapter.setData(it as ArrayList<Travel>)
        })
    }
}