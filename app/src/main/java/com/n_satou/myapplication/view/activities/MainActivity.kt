package com.n_satou.myapplication.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import com.n_satou.myapplication.R

import com.n_satou.myapplication.view.fragments.ChatFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ViewPager>(R.id.view_pager).also {
            it.adapter = ViewPagerAdapter(supportFragmentManager)
        }
    }

    inner class ViewPagerAdapter(manager: FragmentManager): FragmentStatePagerAdapter(manager) {
        override fun getItem(position: Int): Fragment {
            return ChatFragment()
        }

        override fun getCount(): Int  = 2
    }
}
