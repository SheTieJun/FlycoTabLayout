package com.flyco.tablayoutsamples.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Looper;
import android.util.Log;
import android.util.Printer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.flyco.tablayoutsamples.adapter.SimpleHomeAdapter;

public class SimpleHomeActivity extends AppCompatActivity {
    private Context mContext = this;
    private final String[] mItems = {"SlidingTabLayout", "CommonTabLayout", "SegmentTabLayout","SlidingTabLayout2","SlidingTabLayout3",};
    private final Class<?>[] mClasses = {SlidingTabActivity.class, CommonTabActivity.class,
            SegmentTabActivity.class,SlidingTab2Activity.class,SlidingTab3Activity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Looper.getMainLooper().setMessageLogging(new Printer() {
            @Override
            public void println(String x) {
                Log.i("MessageLog", x);
            }
        });
        ListView lv = new ListView(mContext);
        lv.setCacheColorHint(Color.TRANSPARENT);
        lv.setFadingEdgeLength(0);
        lv.setAdapter(new SimpleHomeAdapter(mContext, mItems));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(mContext, mClasses[position]);
                startActivity(intent);
            }
        });

        setContentView(lv);
    }
}
