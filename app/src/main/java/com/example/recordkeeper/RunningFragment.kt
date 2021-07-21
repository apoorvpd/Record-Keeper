package com.example.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recordkeeper.databinding.FragmentRunningBinding

class RunningFragment : Fragment(){

    private lateinit var binding: FragmentRunningBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentRunningBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.container5km.setOnClickListener { launchRunningRecordScreen() }
        binding.container10km.setOnClickListener { launchRunningRecordScreen() }
        binding.containerHalfMarathon.setOnClickListener { launchRunningRecordScreen() }
        binding.containerFullMarathon.setOnClickListener { launchRunningRecordScreen() }
    }

    private fun launchRunningRecordScreen() {
        // context -  same as the MainActivity
        // In Activity class, we can use 'this' for Intent context argument.
        // In a Fragment, we can't use 'this', but we can utilize 'context' to get that access.
        val intent = Intent(context, EditRunningRecordActivity::class.java)
        startActivity(intent)
    }

}