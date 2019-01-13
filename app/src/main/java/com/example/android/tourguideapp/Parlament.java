package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;

import java.util.List;

public class Parlament extends Fragment {

    public static void initFoodsList(List<Location> list, Context context) {
        list.add(new Location(context.getString(R.string.parliament), context.getString(R.string.parliament_desc), context.getString(R.string.parliament_addy), -1));
    }
}