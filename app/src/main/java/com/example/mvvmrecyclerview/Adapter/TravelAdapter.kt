package com.example.mvvmrecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmrecyclerview.Model.Travel
import com.example.mvvmrecyclerview.R

class TravelAdapter(private var travelList : ArrayList<Travel>) : RecyclerView.Adapter<TravelAdapter.travelViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): travelViewholder {
        return travelViewholder(LayoutInflater.from(parent.context).inflate(R.layout.layout_view,parent,false))
    }

    override fun onBindViewHolder(holder: travelViewholder, position: Int) {
        val places = travelList[position]

        holder.textview_tv.text = places.place.toString()
        holder.capital_tv.text = places.capital.toString()
        holder.imageview_iv.setImageResource(places.picture)

    }

    override fun getItemCount(): Int {
        return travelList.size
    }

    class travelViewholder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textview_tv = itemView.findViewById<TextView>(R.id.textview_tv)
        val imageview_iv = itemView.findViewById<ImageView>(R.id.imageview_iv)
        val capital_tv = itemView.findViewById<TextView>(R.id.capital_tv)

    }

    fun setData(travelList: ArrayList<Travel>){
        this.travelList = travelList
    }

}