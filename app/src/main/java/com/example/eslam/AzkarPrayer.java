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

public class AzkarPrayer extends AppCompatActivity {

    Button btnAzkarPrayer1;
    Button btnAzkarPrayer2;
    Button btnAzkarPrayer3;
    Button btnAzkarPrayer4;
    Button btnAzkarPrayer5;
    Button btnAzkarPrayer6;
    Button btnAzkarPrayer7;
    Button btnAzkarPrayer8;
    Button btnAzkarPrayer9;
    Button btnAzkarPrayer10;
    Button btnAzkarPrayer11;
    Vibrator vibrator;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_prayer);
        setTitle("اذكار الصلاة");
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        layout = findViewById(R.id.layoutPrayer);
        btnAzkarPrayer1 = findViewById(R.id.btnAzkarPrayer1);
        btnAzkarPrayer2 = findViewById(R.id.btnAzkarPrayer2);
        btnAzkarPrayer3 = findViewById(R.id.btnAzkarPrayer3);
        btnAzkarPrayer4 = findViewById(R.id.btnAzkarPrayer4);
        btnAzkarPrayer5 = findViewById(R.id.btnAzkarPrayer5);
        btnAzkarPrayer6 = findViewById(R.id.btnAzkarPrayer6);
        btnAzkarPrayer7 = findViewById(R.id.btnAzkarPrayer7);
        btnAzkarPrayer8 = findViewById(R.id.btnAzkarPrayer8);
        btnAzkarPrayer9 = findViewById(R.id.btnAzkarPrayer9);
        btnAzkarPrayer10 = findViewById(R.id.btnAzkarPrayer10);
        btnAzkarPrayer11 = findViewById(R.id.btnAzkarPrayer11);

        addAzkar(btnAzkarPrayer1, 1, findViewById(R.id._1));
        addAzkar(btnAzkarPrayer2, 1, findViewById(R.id._2));
        addAzkar(btnAzkarPrayer3, 1, findViewById(R.id._3));
        addAzkar(btnAzkarPrayer4, 1, findViewById(R.id._4));
        addAzkar(btnAzkarPrayer5, 1, findViewById(R.id._5));
        addAzkar(btnAzkarPrayer6, 1, findViewById(R.id._6));
        addAzkar(btnAzkarPrayer7, 1, findViewById(R.id._7));
        addAzkar(btnAzkarPrayer8, 1, findViewById(R.id._8));
        addAzkar(btnAzkarPrayer9, 1, findViewById(R.id._9));
        addAzkar(btnAzkarPrayer10, 1, findViewById(R.id._10));
        addAzkar(btnAzkarPrayer11, 1, findViewById(R.id._11));
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