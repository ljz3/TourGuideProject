package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Context context, int resources, List<Location> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photoImageView);
        imageView.setImageResource(currentLocation.getmImageResourceId());


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameTextView.setText(currentLocation.getmName());

        TextView addyTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addyTextView.setText("Address:   " + currentLocation.getmAddress());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.descriptionTextView);
        descTextView.setText(("Description:   " + currentLocation.getmDescription()));


        return listItemView;
    }
}
