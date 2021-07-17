package com.example.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.buttonCycling.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//
//            binding.bottomNav
//            }
//
//        })

        binding.buttonCycling.setOnClickListener { binding.bottomNav }
        binding.buttonRunning.setOnClickListener {  }
    }


    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }
    }

