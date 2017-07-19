package com.example.my.kotlin_messengerpractice.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my.kotlin_messengerpractice.R
import com.example.my.kotlin_messengerpractice.ViewHolder.SectionViewHolder
import com.example.my.kotlin_messengerpractice.model.Friend
import com.example.my.kotlin_messengerpractice.model.FriendSection

/**
 * Created by my on 2017-07-20.
 */

class SectionAdapter(var FriendList : List<Friend>, var SectionList : List<FriendSection>) : RecyclerView.Adapter<SectionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SectionViewHolder {
        var context : Context = parent!!.context
        var inflater : LayoutInflater = LayoutInflater.from(context)

        var SectionView : View = inflater.inflate(R.layout.friend_list_section, parent, false)
        var sectionViewHolder : SectionViewHolder = SectionViewHolder(SectionView)

        return sectionViewHolder
    }

    override fun getItemCount(): Int {
        return SectionList.size
    }


    override fun onBindViewHolder(holder: SectionViewHolder?, position: Int) {
        var friendSection : FriendSection = SectionList[position]
        friendSection.setFriendList(FriendList)
        holder!!.onBind(friendSection)
        holder.header.text = friendSection.header
    }

}