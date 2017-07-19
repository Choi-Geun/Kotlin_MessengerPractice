package com.example.my.kotlin_messengerpractice.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my.kotlin_messengerpractice.Adapter.SectionAdapter
import com.example.my.kotlin_messengerpractice.R
import com.example.my.kotlin_messengerpractice.model.Friend
import com.example.my.kotlin_messengerpractice.model.FriendSection
import kotlinx.android.synthetic.main.friend_list_recyclerview.*


/**
 * Created by my on 2017-07-19.
 */

class FriendsFragment : Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

     override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.friend_list_recyclerview, container, false)
     }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        friend_recyclerView.layoutManager = LinearLayoutManager(context)
        friend_recyclerView.setHasFixedSize(true)
        val sectionAdapter = SectionAdapter(FriendsDate(),SectionData())
        friend_recyclerView.adapter = sectionAdapter
    }

    private fun FriendsDate() : List<Friend>{
        var friendList : List<Friend> = listOf(
                Friend("이름1","상태1",""),
                Friend("이름2","상태2",""),
                Friend("이름3","상태3",""),
                Friend("이름4","상태4","")
        )

        return friendList
    }

    private fun SectionData() : List<FriendSection>{
        var sectionList : List<FriendSection> = listOf(
                FriendSection("프로필"),
                FriendSection("추천 친구"),
                FriendSection("친구")

        )
        return sectionList
    }
}