package com.example.my.kotlin_messengerpractice

import android.content.Intent
import android.support.v4.app.Fragment
import android.os.Bundle
import android.os.Message
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.my.kotlin_messengerpractice.Fragment.FriendsFragment
import com.example.my.kotlin_messengerpractice.Fragment.MessageFragment
import com.example.my.kotlin_messengerpractice.Fragment.OptionFragment
import com.example.my.kotlin_messengerpractice.Fragment.TimelineFragment
import kotlinx.android.synthetic.main.messenger_main_view.*
import kotlinx.android.synthetic.main.messenger_main_view.view.*


/**
 * Created by my on 2017-07-19.
 */

class Messenger_Main_View : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.messenger_main_view)

        add_friends.setOnClickListener(this)
        search_friends.setOnClickListener(this)

        setSupportActionBar(toolbar)
        addFragmentsToViewPager(viewPager)

        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.friendslist_tab)
        tabs.getTabAt(1)!!.setIcon(R.drawable.message_tab)
        tabs.getTabAt(2)!!.setIcon(R.drawable.timeline_tab)
        tabs.getTabAt(3)!!.setIcon(R.drawable.option_tab)

    }

    private fun addFragmentsToViewPager(viewPager : ViewPager){
        var adapter = TabsFragmentsPager(supportFragmentManager)

        adapter.addFragment(FriendsFragment())
        adapter.addFragment(MessageFragment())
        adapter.addFragment(OptionFragment())
        adapter.addFragment(TimelineFragment())

        viewPager.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.messenger_main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.edit_friends -> return true
            R.id.setting -> return true
            else -> return super.onOptionsItemSelected(item)
        }

    }
    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.add_friends -> startActivity(Intent(this, AddFriendsView::class.java))
            R.id.search_friends -> startActivity(Intent(this, SearchFriendsView::class.java))
        }
    }
}