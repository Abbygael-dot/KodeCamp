package com.example.kodecamp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kodecamp.R
import com.example.kodecamp.databinding.FragmentProfilePageBinding
import com.example.kodecamp.model.AppViewModel


class ProfilePage : Fragment() {

    private var binding : FragmentProfilePageBinding? = null
    private val sharedViewModel : AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val fragmentBinding = FragmentProfilePageBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        // Inflate the layout for this fragment
        return fragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
        }
        binding?.btnClick = this
    }
    fun goToSignIn(){
        findNavController().navigate(R.id.action_profilePage_to_signIn)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}