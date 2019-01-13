package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;

import java.util.List;

public class HistoryMuseum extends Fragment {

    public static void initFoodsList(List<Location> list, Context context) {
        list.add(new Location(context.getString(R.string.museum), context.getString(R.string.museum_desc), context.getString(R.string.museum_addy), -1));
    }
}

