package com.kevin.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.kevin.whatsapp.Adapter.FragPageAdapter
import com.kevin.whatsapp.Fragments.CallsFragment
import com.kevin.whatsapp.Fragments.ChatsFragment
import com.kevin.whatsapp.Fragments.StatusFragment
import com.kevin.whatsapp.databinding.ActivityMainBinding
import javax.net.ssl.SSLEngineResult.Status

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var item = arrayOf("Calls", "Status", "Calls")
    var fragments = arrayOf(ChatsFragment(), StatusFragment(), CallsFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vpFrage.adapter = FragPageAdapter(supportFragmentManager, fragments, item)
        binding.tabitem.setupWithViewPager(binding.vpFrage)
    }
}