package com.example.eslam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    ListView listEslam;
    MainListAdapter quranRow;
    Vector<MainItems> mainItems;
    Intent out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainItems = new Vector<>();
        mainItems.add(new MainItems(getString(R.string.quran_text), R.mipmap.mos7f));
        mainItems.add(new MainItems(getString(R.string.azkae_text), R.mipmap.azhkar_muslim));
        mainItems.add(new MainItems(getString(R.string.sebha), R.mipmap.electronic_seb7a));
        mainItems.add(new MainItems(getString(R.string.about_programming), R.mipmap.info));

        listEslam = findViewById(R.id.listEslam);
        quranRow = new MainListAdapter(this, R.layout.main_list, R.id.txtItemName, mainItems);
        listEslam.setAdapter(quranRow);

        listEslam.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    out = new Intent(MainActivity.this, Quran.class);
                    startActivity(out);
                } else if (position == 1){
                    out = new Intent(MainActivity.this, Azkar.class);
                    startActivity(out);
                } else if (position == 2){
                    out = new Intent(MainActivity.this, Sebha.class);
                    startActivity(out);
                }  else if (position == 3){
                    out = new Intent(MainActivity.this, AboutProgrammer.class);
                    startActivity(out);
                }
            }
        });
    }
}