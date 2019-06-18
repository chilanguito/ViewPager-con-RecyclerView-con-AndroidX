package android.bignerdranch.practicaserviciorecycler.view

import android.bignerdranch.practicaserviciorecycler.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerActivity : AppCompatActivity() {

    private lateinit var viewpager:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_pagert)

        val fm= supportFragmentManager
        viewpager= findViewById(R.id.viewpager)
        viewpager.adapter= object : FragmentStatePagerAdapter(fm) {
            override fun getItem(position: Int): Fragment {
             return FragmentoPager.newInstance()
            }

            override fun getCount(): Int {
                return 3
            }

        }
    }



}