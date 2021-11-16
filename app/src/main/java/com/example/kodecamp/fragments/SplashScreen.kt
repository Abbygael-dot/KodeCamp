package com.example.kodecamp.fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.kodecamp.R
import com.example.kodecamp.databinding.FragmentSplashScreen2Binding

class SplashScreen : Fragment() {

    private var binding : FragmentSplashScreen2Binding? = null
//    private lateinit var navcon : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View{
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentSplashScreen2Binding.inflate(inflater, container, false)
        binding = fragmentBinding
//        navcon = NavHostFragment.findNavController(this)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_signIn, bundle)
        }, 3000)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}