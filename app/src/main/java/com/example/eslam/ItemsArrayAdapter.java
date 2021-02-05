package com.example.eslam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Vector;

public class ItemsArrayAdapter extends ArrayAdapter {
    private Vector<MyItems> myItems;
    private Context _context;

    public ItemsArrayAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
        myItems = (Vector<MyItems>) objects;
        _context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        ViewHolder viewHolder;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row, parent, false);
            viewHolder = new ViewHolder(row);
            row.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) row.getTag();
        }

        viewHolder.getImgPage().setImageResource(myItems.get(position).getItem());
        return row;
    }
}
