package com.example.eslam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Azkar extends AppCompatActivity {

    ListView listAzkar;
    String[] azkar = {"اذكار الصباح", "اذكار المساء", "اذكار النوم", "اذكار الاستيقاظ", "اذكار الصلاة", "اذكار المسجد", "اذكار السفر"};
    ArrayAdapter adapter;
    Intent out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);
        setTitle("الاذكار");
        listAzkar = findViewById(R.id.listAzkar);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, azkar){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView items = (TextView) super.getView(position, convertView, parent);
                items.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 22);
                items.setPadding(50, 50, 50, 50);
                items.setTextColor(Color.BLACK);
                return items;
            }
        };
        listAzkar.setAdapter(adapter);
        listAzkar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    out = new Intent(Azkar.this, AzkarMorning.class);
                    startActivity(out);
                } else if (position == 1) {
                    out = new Intent(Azkar.this, AzkarNight.class);
                    startActivity(out);
                } else if (position == 2) {
                    out = new Intent(Azkar.this, AzkarSleep.class);
                    startActivity(out);
                } else if (position == 3) {
                    out = new Intent(Azkar.this, AzkarWakingUp.class);
                    startActivity(out);
                } else if (position == 4) {
                    out = new Intent(Azkar.this, AzkarPrayer.class);
                    startActivity(out);
                } else if (position == 5) {
                    out = new Intent(Azkar.this, AzkarMosque.class);
                    startActivity(out);
                } else if (position == 6) {
                    out = new Intent(Azkar.this, AzkarTravel.class);
                    startActivity(out);
                }
            }
        });
    }
}