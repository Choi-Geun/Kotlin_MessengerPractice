package com.example.my.kotlin_messengerpractice

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.my.kotlin_messengerpractice.Fragment.FriendsFragment

/**
 * Created by my on 2017-07-19.
 */

class TabsFragmentsPager(manager: FragmentManager?) : FragmentPagerAdapter(manager) {

    private val mFragmentList = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment){
        mFragmentList.add(fragment)
    }

}