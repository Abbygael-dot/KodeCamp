package com.example.kodecamp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kodecamp.R
import com.example.kodecamp.databinding.FragmentSignInBinding
import com.example.kodecamp.model.AppViewModel


class SignIn : Fragment() {

    private var binding : FragmentSignInBinding? = null
    private val sharedViewModel : AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val fragmentBinding = FragmentSignInBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.signIn = this

//        binding?.apply {
//
//            signInBtn.setOnClickListener { goToTrainingScreen() }
//            signUpHereTxt.setOnClickListener { goToSignIn() }
//        }

    }

    fun goToTrainingScreen(){
        findNavController().navigate(R.id.action_signIn_to_topics)
    }
    fun goToSignUp(){
        findNavController().navigate(R.id.action_signIn_to_signUp)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}