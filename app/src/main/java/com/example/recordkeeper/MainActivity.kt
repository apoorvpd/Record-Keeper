package com.example.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

import androidx.fragment.app.commit
import com.example.recordkeeper.databinding.ActivityMainBinding

import com.google.android.material.navigation.NavigationBarView



class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

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

        binding.bottomNav.setOnItemSelectedListener(this)
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


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_cycling -> {
                onCyclingClicked()
                true
            }
            R.id.nav_running -> {
                onRunningClicked()
                true
            }
            else -> {
                false
            }
        }
    }
}



