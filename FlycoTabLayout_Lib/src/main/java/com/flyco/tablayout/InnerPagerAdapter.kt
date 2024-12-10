package com.flyco.tablayout

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

internal class InnerViewPager2Adapter : FragmentStateAdapter {
    private var fragments = ArrayList<Fragment>()

    constructor(fragmentActivity: FragmentActivity, fragments: ArrayList<Fragment>) : super(fragmentActivity) {
        this.fragments.clear()
        this.fragments = fragments
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        recyclerView.setItemViewCacheSize(itemCount)
    }

    constructor(fragment: Fragment, fragments: ArrayList<Fragment>) : super(fragment) {
        this.fragments.clear()
        this.fragments = fragments
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}

internal class InnerViewPagerAdapter(fm: FragmentManager, fragments: java.util.ArrayList<Fragment>, private val titles: Array<String>) : FragmentPagerAdapter(fm) {
    private var fragments = java.util.ArrayList<Fragment>()

    init {
        this.fragments = fragments
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        // 覆写destroyItem并且空实现,这样每个Fragment中的视图就不会被销毁
//         super.destroyItem(container, position, object);
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }
}
