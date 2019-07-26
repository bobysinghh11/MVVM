package com.stuffshuf.mvvm.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stuffshuf.mvvm.Models.User


class MainActivityViewModel : ViewModel(){

    private val user:MutableLiveData<User> = MutableLiveData()


    fun getUser():LiveData<User> = user

}
