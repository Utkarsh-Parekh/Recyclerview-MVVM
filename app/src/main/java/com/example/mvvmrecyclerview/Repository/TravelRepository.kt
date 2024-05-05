package com.example.mvvmrecyclerview.Repository

import com.example.mvvmrecyclerview.Model.Travel
import com.example.mvvmrecyclerview.R

class TravelRepository {

    companion object {
        fun setTravelData(): List<Travel> {
            val data = ArrayList<Travel>()
            data.add(Travel(R.drawable.agra, "Uttar Pradesh", "Lucknow"))
            data.add(Travel(R.drawable.delhi, "Delhi", "Delhi"))
            data.add(Travel(R.drawable.gujarat, "Gujarat", "Gandhinagar"))
            data.add(Travel(R.drawable.himachal, "Himachal Pradesh", "Shimla"))
            data.add(Travel(R.drawable.jk, "Jammu & Kashmir", "Srinagar"))
            data.add(Travel(R.drawable.karnataka, "Karnataka", "Bengalore"))
            data.add(Travel(R.drawable.kerala, "Kerala", "Thiruvananthapuram"))
            data.add(Travel(R.drawable.madhyapradesh, "Madhya Pradesh", "Bhopal"))
            data.add(Travel(R.drawable.mumbai, "Maharashtra", "Mumbai"))
            data.add(Travel(R.drawable.amritsar, "Punjab", "Chandigadh"))
            data.add(Travel(R.drawable.rajasthan, "Rajasthan", "Jaipur"))
            data.add(Travel(R.drawable.kolkata, "West Bangal", "Kolkata"))
            data.add(Travel(R.drawable.andhrapradesh, "Andhra Pradesh", "Amaravati"))
            data.add(Travel(R.drawable.arunachalpradesh, "Arunachal Pradesh", "Itanagar"))
            data.add(Travel(R.drawable.assam, "Assam", "Dispur"))
            data.add(Travel(R.drawable.bihar, "Bihar", "Patna"))
            data.add(Travel(R.drawable.chhatisgadh, "Chhattisgarh", "Raipur"))
            data.add(Travel(R.drawable.goa, "Goa", "Panji"))
            data.add(Travel(R.drawable.jharkhand, "Jharkhand", "Ranchi"))
            data.add(Travel(R.drawable.manipur, "Manipur", "Imphal"))
            data.add(Travel(R.drawable.meghalaya, "Meghalaya", "Shillong"))
            data.add(Travel(R.drawable.mizoram, "Mizoram", "Aizwal"))
            data.add(Travel(R.drawable.nagaland, "Nagaland", "Kohima"))
            data.add(Travel(R.drawable.odisha, "Odisha", "Bhubaneshwar"))
            data.add(Travel(R.drawable.sikkim, "Sikkim", "Gangtok"))
            data.add(Travel(R.drawable.tamilnadu, "Tamilnadu", "Chennai"))
            data.add(Travel(R.drawable.hydrabad, "Telangana", "Hyderabad"))
            data.add(Travel(R.drawable.tripura, "Tripura", "Agartala"))
            data.add(Travel(R.drawable.uttrakhand, "Uttrakhand", "Dehradun"))

            return data
        }

    }
}