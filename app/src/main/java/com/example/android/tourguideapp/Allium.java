package com.example.android.tourguideapp;

import android.content.Context;

import java.util.List;


public class Allium {

    public static void initFoodsList(List<Location> list, Context context) {
        list.add(new Location(context.getString(R.string.allium), context.getString(R.string.allium_desc), context.getString(R.string.allium_addy), R.drawable.allium));
        list.add(new Location(context.getString(R.string.frasercafe), context.getString(R.string.frasercafe_desc), context.getString(R.string.frasercafe_addy), R.drawable.frasercafe));
    }
}
