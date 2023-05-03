package com.kevin.whatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevin.whatsapp.Model.ProfileModel
import com.kevin.whatsapp.R
import com.kevin.whatsapp.databinding.ActivityMainBinding
import com.kevin.whatsapp.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    var image = arrayOf(
        R.drawable.dp1,
        R.drawable.dp2,
        R.drawable.dp3,
        R.drawable.dp4,
        R.drawable.dp5,
        R.drawable.dp6,
        R.drawable.dp7,
        R.drawable.dp8,
        R.drawable.dp9,
        R.drawable.dp10,
        R.drawable.dp11,
        R.drawable.dp12,
        R.drawable.dp13,
        R.drawable.dp14,
        R.drawable.dp15
    )
    var name = arrayOf("Raman", "Crazy girl", "Shyam", "Rajesh", "Angel", "Sweeti", "Snaya", "Ajay", "Stan Boy", "Prete", "Semma", "Addie", "Srenu", "Rasmi", "Sam")

    lateinit var binding: FragmentStatusBinding
    var statusList = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStatusBinding.inflate(layoutInflater)

        for (x in 0..image.size) {
            var data = ProfileModel(image[x], name[x])
            statusList.add(data)
        }

        return binding.root
    }
}