package com.example.my.kotlin_messengerpractice.model

/**
 * Created by my on 2017-07-20.
 */
class FriendSection(var header : String){
    lateinit var friends : List<Friend>

    fun setFriendList(friends : List<Friend>){
        this.friends = friends
    }
}