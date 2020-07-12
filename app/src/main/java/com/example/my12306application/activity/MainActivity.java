package com.example.my12306application.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.my12306application.R;
import com.example.my12306application.adapter.MyFragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{
    private TabLayout tabLayout;
    private ViewPager vp;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private TabLayout.Tab tbTicket;
    private TabLayout.Tab tbOrder;
    private TabLayout.Tab tbMy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        //使用适配器将ViewPager与Fragment绑定在一起
        vp=findViewById(R.id.vp);
        myFragmentPagerAdapter=new MyFragmentPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(myFragmentPagerAdapter);

        //将TabLayout与ViewPager绑定在一起
        tabLayout=findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(vp);

        //指定Tab的位置
        tbTicket=tabLayout.getTabAt(0);
        tbOrder=tabLayout.getTabAt(1);
        tbMy=tabLayout.getTabAt(2);

        //为tab添加分割线
        LinearLayout linearLayout= (LinearLayout) tabLayout.getChildAt(0);
        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        linearLayout.setDividerDrawable(ContextCompat.getDrawable(this,R.drawable.layout_divider_vertical));
        linearLayout.setDividerPadding(50);
    }
}
