package com.example.my.kotlin_messengerpractice.ViewHolder

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.my.kotlin_messengerpractice.R
import com.example.my.kotlin_messengerpractice.model.Friend
import com.example.my.kotlin_messengerpractice.model.FriendSection

/**
 * Created by my on 2017-07-20.
 */

class SectionViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var header : TextView

    init{
        header = itemView!!.findViewById(R.id.header_id)
        var sectionRecyclerView : RecyclerView = itemView!!.findViewById(R.id.section_recycler_view)
        sectionRecyclerView.layoutManager = LinearLayoutManager(itemView.context)
    }

    fun onBind(section : FriendSection){
        var friendList : List<Friend>
    }
}