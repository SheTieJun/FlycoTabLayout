package com.flyco.tablayoutsamples.ui

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class MySimplePagerAdapter : FragmentStateAdapter {
    private var fragments = ArrayList<Fragment>()

    constructor(fragmentActivity: FragmentActivity, fragments: ArrayList<Fragment>) : super(fragmentActivity) {
        this.fragments = fragments
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        recyclerView.setItemViewCacheSize(itemCount)
    }


    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        Log.i("MySimplePagerAdapter","onDetachedFromRecyclerView")
        this.fragments.clear()
    }

    constructor(fragment: Fragment, fragments: ArrayList<Fragment>) : super(fragment) {
        this.fragments = fragments
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}