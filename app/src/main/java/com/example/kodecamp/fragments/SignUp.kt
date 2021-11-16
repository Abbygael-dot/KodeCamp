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
import com.example.kodecamp.databinding.FragmentSignUpBinding
import com.example.kodecamp.model.AppViewModel

class SignUp : Fragment() {

    private var binding : FragmentSignUpBinding? = null
    private val sharedViewModel : AppViewModel by activityViewModels()
//    private lateinit var navcon : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
       val fragmentBinding = FragmentSignUpBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            signUpBtn.setOnClickListener {

                saveInputtedName()
                saveInputtedUserName()
                saveInputtedEmail()
                saveInputtedPhoneNumber()
                saveInputtedTrack()

                if (sharedViewModel.hasNoValueTyped()){Toast.makeText(activity, "Please input your details", Toast.LENGTH_SHORT).show()
                }
                else {goToTrainings() }


            }

            signInHereTxt.setOnClickListener { goToSignIn()}
        }

    }

    private fun saveInputtedTrack() : String {
        val inputT = binding?.signUpTrackLayout?.editText?.text
        sharedViewModel.saveTrack(inputT.toString())
        return inputT.toString()
    }

    private fun saveInputtedPhoneNumber() : String {
        val inputP = binding?.signUpPhoneNoLayout?.editText?.text
        sharedViewModel.savePhoneNumber(inputP.toString())
        return inputP.toString()
    }

    private fun saveInputtedEmail() : String {
        val inputE = binding?.signUpEmailLayout?.editText?.text
        sharedViewModel.saveEmail(inputE.toString())
        return inputE.toString()
    }

    private fun saveInputtedUserName() : String {
        val inputU = binding?.signUpUserNameLayout?.editText?.text
        sharedViewModel.saveUserName(inputU.toString())
        return inputU.toString()
    }

    private fun saveInputtedName(): String {
        val inputN = binding?.signUpFullNameLayout?.editText?.text
        sharedViewModel.saveFullName(inputN.toString())
        return inputN.toString()
    }

    fun goToTrainings(){
        findNavController().navigate(R.id.action_signUp_to_topics)
    }

    fun goToSignIn (){
        findNavController().navigate(R.id.action_signUp_to_signIn)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}