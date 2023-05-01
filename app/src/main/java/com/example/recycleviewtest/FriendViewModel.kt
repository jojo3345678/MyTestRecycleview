package com.example.recycleviewtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FriendViewModel : ViewModel(){
    val friend: MutableLiveData<Friend> by lazy { MutableLiveData<Friend>() }

}