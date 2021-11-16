package com.example.kodecamp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kodecamp.R
import com.example.kodecamp.databinding.FragmentTopicsBinding
import com.example.kodecamp.model.AppViewModel

class Topics : Fragment() {

    private var binding : FragmentTopicsBinding? = null
    private val sharedViewModel : AppViewModel by activityViewModels()
//    private lateinit var navcon : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val fragmentBinding = FragmentTopicsBinding.inflate(inflater, container, false)
        binding = fragmentBinding
//        navcon = NavHostFragment.findNavController(this)
        // Inflate the layout for this fragment
        return fragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnClick = this

//        binding?.apply {
//
//            seeTopics.setOnClickListener { goToTopicList() }
//            cardView.setOnClickListener { goToProfilePage() }
//        }
    }

    fun goToTopicList(){
        findNavController().navigate(R.id.action_topics_to_listOfTopics)
    }
    fun goToProfilePage(){
        findNavController().navigate(R.id.action_topics_to_profilePage)
    }

}