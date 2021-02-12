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

public class AzkarTravel extends AppCompatActivity {

    Button btnAzkarTravel1;
    Button btnAzkarTravel2;
    Button btnAzkarTravel3;
    Button btnAzkarTravel4;
    Button btnAzkarTravel5;
    Vibrator vibrator;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("اذكار السفر");

        setContentView(R.layout.activity_azkar_travel);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        layout = findViewById(R.id.layoutTravel);
        btnAzkarTravel1 = findViewById(R.id.btnAzkarTravel1);
        btnAzkarTravel2 = findViewById(R.id.btnAzkarTravel2);
        btnAzkarTravel3 = findViewById(R.id.btnAzkarTravel3);
        btnAzkarTravel4 = findViewById(R.id.btnAzkarTravel4);
        btnAzkarTravel5 = findViewById(R.id.btnAzkarTravel5);
        addAzkar(btnAzkarTravel1, 1, findViewById(R.id._1));
        addAzkar(btnAzkarTravel2, 1, findViewById(R.id._2));
        addAzkar(btnAzkarTravel3, 1, findViewById(R.id._3));
        addAzkar(btnAzkarTravel4, 1, findViewById(R.id._4));
        addAzkar(btnAzkarTravel5, 1, findViewById(R.id._5));
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