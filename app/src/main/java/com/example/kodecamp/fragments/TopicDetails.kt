package com.example.kodecamp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kodecamp.adapter.KeyFeaturesAdapter
import com.example.kodecamp.data.KeyFeaturesSource
import com.example.kodecamp.databinding.FragmentTopicDetailsBinding

class TopicDetails : Fragment() {
    private var binding : FragmentTopicDetailsBinding? = null
    private lateinit var shareTopic : String

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
        binding?.txtClick = this


        binding?.apply {
            val kotlinKeyFeatures = KeyFeaturesSource().loadKeyFeatures()
            keyFeaturesRecView.adapter = KeyFeaturesAdapter(this@TopicDetails, kotlinKeyFeatures)
            keyFeaturesRecView.setHasFixedSize(true)

            shareTopic = TopicDetails.text.toString()



//            viewModel = sharedViewModel


        }
    }
    fun share(){
        val intent = Intent()
        intent.setAction(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT, shareTopic)
        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent, "share with"))


    }


}