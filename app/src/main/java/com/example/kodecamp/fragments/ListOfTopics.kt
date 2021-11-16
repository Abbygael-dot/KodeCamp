package com.example.kodecamp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

import com.example.kodecamp.adapter.topicItemAdapter
import com.example.kodecamp.data.TopicSource
import com.example.kodecamp.databinding.FragmentListOfTopicsBinding
import com.example.kodecamp.model.AppViewModel


class ListOfTopics : Fragment(){

    private var binding : FragmentListOfTopicsBinding? = null
    

    private val sharedViewModel : AppViewModel by activityViewModels()
//    private lateinit var navcon : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val fragmentBinding = FragmentListOfTopicsBinding.inflate(inflater, container, false)
        binding = fragmentBinding
//        navcon = NavHostFragment.findNavController(this)
        // Inflate the layout for this fragment
        return fragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.apply {

            val myTopicLists = TopicSource().loadTopics()
            topicRecyclerView.adapter = topicItemAdapter(this@ListOfTopics, myTopicLists)
            topicRecyclerView.setHasFixedSize(true)


        }
    }


}