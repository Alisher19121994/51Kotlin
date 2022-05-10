package com.best.a101k

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fragment: FragmentManager) : FragmentPagerAdapter(fragment) {
    private val list = listOf(
        Page_1(), Page_2(), Page_3()
    )

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

}