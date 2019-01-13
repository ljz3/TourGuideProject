package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AlliumFragment();
        } else if (position == 1) {
            return new HistoryMuseumFragment();
        } else if (position == 2) {
            return new ParlamentFragment();
        } else {
            return new RideauCentreFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Food";
        } else if (position == 1) {
            return "Museum";
        } else if (position == 2) {
            return "Attractions";
        } else {
            return "Shop";
        }
    }
}