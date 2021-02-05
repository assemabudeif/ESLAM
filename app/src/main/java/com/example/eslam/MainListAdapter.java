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

public class MainListAdapter extends ArrayAdapter {
    private Vector<MainItems> mainItems;
    Context _context;
    public MainListAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List objects) {
        super(context, resource, textViewResourceId, objects);
        mainItems = (Vector<MainItems>) objects;
        _context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        ViewMainHolder viewMainHolder;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.main_list, parent, false);
            viewMainHolder = new ViewMainHolder(row);
            row.setTag(viewMainHolder);
        }else {
            viewMainHolder = (ViewMainHolder) row.getTag();
        }

        viewMainHolder.getImgListImage().setImageResource(mainItems.get(position).getImgListImage());
        viewMainHolder.getTxtItemName().setText("" + mainItems.get(position).getTxtItemName());
        return row;
    }
}
