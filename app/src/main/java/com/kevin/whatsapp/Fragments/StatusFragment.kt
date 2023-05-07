package com.kevin.whatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kevin.whatsapp.Adapter.StatusAdapter
import com.kevin.whatsapp.Model.ProfileModel
import com.kevin.whatsapp.R
import com.kevin.whatsapp.R.drawable.*
import com.kevin.whatsapp.databinding.ActivityMainBinding
import com.kevin.whatsapp.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    var image = arrayOf(dp1, dp2, dp3, dp4, dp5, dp6, dp7, dp8, dp9, dp10, dp11, dp12, dp13, dp14, dp15)
    var name = arrayOf("Raman", "Crazy girl", "Shyam", "Rajesh", "Angel", "Sweeti", "Snaya", "Ajay", "Stan Boy", "Prete", "Semma", "Addie", "Srenu", "Rasmi", "Sam")

    lateinit var binding: FragmentStatusBinding
    var statusList = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStatusBinding.inflate(layoutInflater)

        for (x in 0..image.size-1) {
            var data = ProfileModel(image[x], name[x])
            statusList.add(data)
        }

        binding.rcvStatuslist.layoutManager = LinearLayoutManager(context)
        binding.rcvStatuslist.adapter = StatusAdapter(statusList)

        return binding.root
    }
}