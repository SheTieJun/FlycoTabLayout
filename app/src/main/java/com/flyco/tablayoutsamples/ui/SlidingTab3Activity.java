package com.flyco.tablayoutsamples.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.flyco.tablayout.SlidingTabConfig;
import com.flyco.tablayout.SlidingTabLayoutV3;
import com.flyco.tablayout.bean.TabTitleType;
import com.flyco.tablayout.bean.TabV3Title;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.flyco.tablayout.widget.MsgView;
import com.flyco.tablayoutsamples.R;
import com.flyco.tablayoutsamples.utils.SimpleImageLoader;
import com.flyco.tablayoutsamples.utils.ViewFindUtils;

import java.util.ArrayList;

import static com.flyco.tablayout.bean.TabTitleType.TEXT;

public class SlidingTab3Activity extends AppCompatActivity implements OnTabSelectListener {
    private Context mContext = this;
    private ArrayList<Fragment> mFragments2 = new ArrayList<>();

    private final ArrayList<TabV3Title> list = new ArrayList<>();

    private SimpleImageLoader mSimpleImageLoader = new SimpleImageLoader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tab3);


        list.add(new TabV3Title(TEXT, "热门"));
        list.add(new TabV3Title(TEXT, "iOS"));
        list.add(new TabV3Title(TEXT, "Android"));
        list.add(new TabV3Title(TabTitleType.IMAGE, R.drawable.icon_youxue));
        list.add(new TabV3Title(TEXT, "前端"));
        list.add(new TabV3Title(TEXT, "后端"));
        list.add(new TabV3Title(TabTitleType.IMAGE, R.drawable.icon_remengx));
        list.add(new TabV3Title(TEXT, "设计"));
        list.add(new TabV3Title(TEXT, "工具资源"));
        for (TabV3Title title : list) {
            mFragments2.add(SimpleCardFragment.getInstance(title.getContent().toString()));
        }


        View decorView = getWindow().getDecorView();
        ViewPager2 vp2 = ViewFindUtils.find(decorView, R.id.vp_2);
        MyPagerAdapter2 mAdapter2 = new MyPagerAdapter2(this);
        vp2.setAdapter(mAdapter2);

        /** 默认 */
        SlidingTabLayoutV3 tabLayout_1 = ViewFindUtils.find(decorView, R.id.tl_1);
        /**自定义部分属性*/
        SlidingTabLayoutV3 tabLayout_2 = ViewFindUtils.find(decorView, R.id.tl_2);
        /** 字体加粗,大写 */
        SlidingTabLayoutV3 tabLayout_3 = ViewFindUtils.find(decorView, R.id.tl_3);
        /** tab固定宽度 */
        SlidingTabLayoutV3 tabLayout_4 = ViewFindUtils.find(decorView, R.id.tl_4);
        /** indicator固定宽度 */
        SlidingTabLayoutV3 tabLayout_5 = ViewFindUtils.find(decorView, R.id.tl_5);
        /** indicator圆 */
        SlidingTabLayoutV3 tabLayout_6 = ViewFindUtils.find(decorView, R.id.tl_6);
        /** indicator矩形圆角 */
        final SlidingTabLayoutV3 tabLayout_7 = ViewFindUtils.find(decorView, R.id.tl_7);
        /** indicator三角形 */
        SlidingTabLayoutV3 tabLayout_8 = ViewFindUtils.find(decorView, R.id.tl_8);
        /** indicator圆角色块 */
        SlidingTabLayoutV3 tabLayout_9 = ViewFindUtils.find(decorView, R.id.tl_9);
        /** indicator圆角色块 */
        SlidingTabLayoutV3 tabLayout_10 = ViewFindUtils.find(decorView, R.id.tl_10);
        /** indicator/dawable */
        SlidingTabLayoutV3 tabLayout_11 = ViewFindUtils.find(decorView, R.id.tl_11);
        /** indicator/dawable */
        SlidingTabLayoutV3 tabLayout_12 = ViewFindUtils.find(decorView, R.id.tl_12);

        SlidingTabConfig.INSTANCE.setImageLoader(mSimpleImageLoader);

        tabLayout_1.setViewPager(vp2, list);
        tabLayout_2.setViewPager(vp2, list);
        tabLayout_3.setViewPager(vp2, list);
        tabLayout_4.setViewPager(vp2, list);
        tabLayout_5.setViewPager(vp2, list);
        tabLayout_6.setViewPager(vp2, list);
        tabLayout_7.setViewPager(vp2, list);
        tabLayout_8.setViewPager(vp2, list);
        tabLayout_9.setViewPager(vp2, list);
        tabLayout_10.setViewPager(vp2, list);
        tabLayout_11.setViewPager(vp2, list);
        tabLayout_12.setViewPager(vp2, list);

        vp2.setCurrentItem(4);

        tabLayout_1.showDot(4);
        tabLayout_3.showDot(4);
        tabLayout_2.showDot(4);

        tabLayout_2.showMsg(3, 5);
        tabLayout_2.setMsgMargin(3, 0, 10);
        MsgView rtv_2_3 = tabLayout_2.getMsgView(3);
        if (rtv_2_3 != null) {
            rtv_2_3.setBackgroundColor(Color.parseColor("#6D8FB0"));
        }

        tabLayout_2.showMsg(5, 5);
        tabLayout_2.setMsgMargin(5, 0, 10);
    }

    @Override
    public void onTabSelect(int position) {
        Toast.makeText(mContext, "onTabSelect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabReselect(int position) {
        Toast.makeText(mContext, "onTabReselect&position--->" + position, Toast.LENGTH_SHORT).show();
    }


    private class MyPagerAdapter2 extends FragmentStateAdapter {

        public MyPagerAdapter2(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        public MyPagerAdapter2(@NonNull Fragment fragment) {
            super(fragment);
        }

        public MyPagerAdapter2(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return mFragments2.get(position);
        }

        @Override
        public int getItemCount() {
            return mFragments2.size();
        }
    }
}
