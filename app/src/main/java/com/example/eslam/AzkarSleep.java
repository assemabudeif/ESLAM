package com.example.eslam;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AzkarSleep extends AppCompatActivity {
    Button btnAzkarSleep1;
    Button btnAzkarSleep2;
    Button btnAzkarSleep3;
    Button btnAzkarSleep4;
    Button btnAzkarSleep5;
    Button btnAzkarSleep6;
    Button btnAzkarSleep7;
    Button btnAzkarSleep8;
    Button btnAzkarSleep9;
    Button btnAzkarSleep10;
    Button btnAzkarSleep11;
    Button btnAzkarSleep12;
    Button btnAzkarSleep13;
    Button btnAzkarSleep14;
    Button btnAzkarSleep15;
    Vibrator vibrator;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_sleep);
        setTitle("اذكار النوم");
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        layout = findViewById(R.id.layoutSleep);
        btnAzkarSleep1 = findViewById(R.id.btnAzkarSleep1);
        btnAzkarSleep2 = findViewById(R.id.btnAzkarSleep2);
        btnAzkarSleep3 = findViewById(R.id.btnAzkarSleep3);
        btnAzkarSleep4 = findViewById(R.id.btnAzkarSleep4);
        btnAzkarSleep5 = findViewById(R.id.btnAzkarSleep5);
        btnAzkarSleep6 = findViewById(R.id.btnAzkarSleep6);
        btnAzkarSleep7 = findViewById(R.id.btnAzkarSleep7);
        btnAzkarSleep8 = findViewById(R.id.btnAzkarSleep8);
        btnAzkarSleep9 = findViewById(R.id.btnAzkarSleep9);
        btnAzkarSleep10 = findViewById(R.id.btnAzkarSleep10);
        btnAzkarSleep11 = findViewById(R.id.btnAzkarSleep11);
        btnAzkarSleep12 = findViewById(R.id.btnAzkarSleep12);
        btnAzkarSleep13 = findViewById(R.id.btnAzkarSleep13);
        btnAzkarSleep14 = findViewById(R.id.btnAzkarSleep14);
        btnAzkarSleep15 = findViewById(R.id.btnAzkarSleep15);
       
        addAzkar(btnAzkarSleep1, 1, findViewById(R.id._1));
        addAzkar(btnAzkarSleep2, 1, findViewById(R.id._2));
        addAzkar(btnAzkarSleep3, 3, findViewById(R.id._3));
        addAzkar(btnAzkarSleep4, 1, findViewById(R.id._4));
        addAzkar(btnAzkarSleep5, 1, findViewById(R.id._5));
        addAzkar(btnAzkarSleep6, 1, findViewById(R.id._6));
        addAzkar(btnAzkarSleep7, 1, findViewById(R.id._7));
        addAzkar(btnAzkarSleep8, 33, findViewById(R.id._8));
        addAzkar(btnAzkarSleep9, 33, findViewById(R.id._9));
        addAzkar(btnAzkarSleep10, 34, findViewById(R.id._10));
        addAzkar(btnAzkarSleep11, 3, findViewById(R.id._11));
        addAzkar(btnAzkarSleep12, 1, findViewById(R.id._12));
        addAzkar(btnAzkarSleep13, 1, findViewById(R.id._13));
        addAzkar(btnAzkarSleep14, 1, findViewById(R.id._14));
        addAzkar(btnAzkarSleep15, 1, findViewById(R.id._15));
       
    }

    public void addAzkar(Button btnZekr, int num, TextView txtZekr) {
        btnZekr.setText("" + num);
        btnZekr.setOnClickListener(new View.OnClickListener() {
            int counter = num;
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                if (counter > 1) {
                    vibrator.vibrate(100);
                    btnZekr.setText("" + --counter);
                } else {
                    vibrator.vibrate(150);
                    layout.removeView(btnZekr);
                    layout.removeView(txtZekr);
                }
            }
        });

    }
}