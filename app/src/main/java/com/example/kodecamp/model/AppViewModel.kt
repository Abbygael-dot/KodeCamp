package com.example.kodecamp.model

import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kodecamp.fragments.TopicDetails

class AppViewModel : ViewModel() {

    private var _fullName = MutableLiveData("")
    val fullName : LiveData<String> = _fullName

    private var _userName = MutableLiveData("")
    val userName : LiveData<String> = _userName

    private var _email = MutableLiveData("")
    val email : LiveData<String> = _email

    private var _phoneNumber = MutableLiveData("")
    val phoneNUmber : LiveData<String> = _phoneNumber

    private var _track = MutableLiveData("")
    val track : LiveData<String> = _track

    private var _topicDetails = MutableLiveData<String>()
    val topicDetals : LiveData<String> = _topicDetails

    private var _topicTitle = MutableLiveData<String>()
    val topicTitle : LiveData<String> = _topicTitle

//    private var _topic2Share = TopicDetails()
//    val topic2Share : TopicDetails = _topic2Share




    fun saveFullName (newName : String){
        _fullName.value = newName
    }
    fun saveUserName (userName : String){
        _userName.value = userName
    }

    fun saveEmail (email : String){
        _email.value = email
    }

    fun savePhoneNumber (number : String){
        _phoneNumber.value = number
    }

    fun saveTrack (track : String){
        _track.value = track
    }



    fun hasNoValueTyped() : Boolean{
        return _fullName.value.isNullOrEmpty()
    }

    fun emailEmpty() : Boolean{
        return _email.value.isNullOrEmpty()
    }

}