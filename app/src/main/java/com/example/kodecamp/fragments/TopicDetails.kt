package com.example.kodecamp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kodecamp.databinding.FragmentTopicDetailsBinding



class TopicDetails : Fragment() {
    private var binding : FragmentTopicDetailsBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val fragmentBinding = FragmentTopicDetailsBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        // Inflate the layout for this fragment
            return fragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.apply {

//            viewModel = sharedViewModel


        }
    }


}