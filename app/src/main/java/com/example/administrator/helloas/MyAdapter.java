package com.example.administrator.helloas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/2/2.
 */
public class MyAdapter extends FragmentStatePagerAdapter {

    List<String> list1;
    List<Fragment> list2;


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    public MyAdapter(FragmentManager fm, List<String> list1, List<Fragment> list2) {
        super(fm);
        this.list1 = list1;
        this.list2 = list2;
    }

    @Override
    public Fragment getItem(int position) {

        return list2.get(position);

    }

    @Override
    public int getCount() {
        return list2.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list1.get(position);
    }
}
