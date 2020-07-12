package com.example.my12306application.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.my12306application.fragment.MyFragment;
import com.example.my12306application.fragment.OrderFragment;
import com.example.my12306application.fragment.TicketFragment;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] mTitles = new String[]{"车票", "订单", "@我的"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new OrderFragment();
        } else if (position == 2) {
            return new MyFragment();
        }
        return new TicketFragment();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
