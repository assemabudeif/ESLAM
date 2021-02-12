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

import java.util.ArrayList;

public class AzkarMorning extends AppCompatActivity {

    Button btnAzkarMorning1;
    Button btnAzkarMorning2;
    Button btnAzkarMorning3;
    Button btnAzkarMorning4;
    Button btnAzkarMorning5;
    Button btnAzkarMorning6;
    Button btnAzkarMorning7;
    Button btnAzkarMorning8;
    Button btnAzkarMorning9;
    Button btnAzkarMorning10;
    Button btnAzkarMorning11;
    Button btnAzkarMorning12;
    Button btnAzkarMorning13;
    Button btnAzkarMorning14;
    Button btnAzkarMorning15;
    Button btnAzkarMorning16;
    Button btnAzkarMorning17;
    Button btnAzkarMorning18;
    Button btnAzkarMorning19;
    Button btnAzkarMorning20;
    Button btnAzkarMorning21;
    Button btnAzkarMorning22;
    Button btnAzkarMorning23;
    Button btnAzkarMorning24;
    Button btnAzkarMorning25;
    Button btnAzkarMorning26;
    Button btnAzkarMorning27;
    Button btnAzkarMorning28;
    Button btnAzkarMorning29;
    Button btnAzkarMorning30;
    Button btnAzkarMorning31;
    LinearLayout layout;
    Vibrator vibrator;
    public static int count = 0;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_morning);
        setTitle("اذكار الصباح");
        layout = findViewById(R.id.layoutMorning);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        btnAzkarMorning1 = findViewById(R.id.btnAzkarMorning1);
        btnAzkarMorning2 = findViewById(R.id.btnAzkarMorning2);
        btnAzkarMorning3 = findViewById(R.id.btnAzkarMorning3);
        btnAzkarMorning4 = findViewById(R.id.btnAzkarMorning4);
        btnAzkarMorning5 = findViewById(R.id.btnAzkarMorning5);
        btnAzkarMorning6 = findViewById(R.id.btnAzkarMorning6);
        btnAzkarMorning7 = findViewById(R.id.btnAzkarMorning7);
        btnAzkarMorning8 = findViewById(R.id.btnAzkarMorning8);
        btnAzkarMorning9 = findViewById(R.id.btnAzkarMorning9);
        btnAzkarMorning10 = findViewById(R.id.btnAzkarMorning10);
        btnAzkarMorning11 = findViewById(R.id.btnAzkarMorning11);
        btnAzkarMorning12 = findViewById(R.id.btnAzkarMorning12);
        btnAzkarMorning13 = findViewById(R.id.btnAzkarMorning13);
        btnAzkarMorning14 = findViewById(R.id.btnAzkarMorning14);
        btnAzkarMorning15 = findViewById(R.id.btnAzkarMorning15);
        btnAzkarMorning16 = findViewById(R.id.btnAzkarMorning16);
        btnAzkarMorning17 = findViewById(R.id.btnAzkarMorning17);
        btnAzkarMorning18 = findViewById(R.id.btnAzkarMorning18);
        btnAzkarMorning19 = findViewById(R.id.btnAzkarMorning19);
        btnAzkarMorning20 = findViewById(R.id.btnAzkarMorning20);
        btnAzkarMorning21 = findViewById(R.id.btnAzkarMorning21);
        btnAzkarMorning22 = findViewById(R.id.btnAzkarMorning22);
        btnAzkarMorning23 = findViewById(R.id.btnAzkarMorning23);
        btnAzkarMorning24 = findViewById(R.id.btnAzkarMorning24);
        btnAzkarMorning25 = findViewById(R.id.btnAzkarMorning25);
        btnAzkarMorning26 = findViewById(R.id.btnAzkarMorning26);
        btnAzkarMorning27 = findViewById(R.id.btnAzkarMorning27);
        btnAzkarMorning28 = findViewById(R.id.btnAzkarMorning28);
        btnAzkarMorning29 = findViewById(R.id.btnAzkarMorning29);
        btnAzkarMorning30 = findViewById(R.id.btnAzkarMorning30);
        btnAzkarMorning31 = findViewById(R.id.btnAzkarMorning31);

        addAzkar(btnAzkarMorning1, 1, findViewById(R.id._1));
        addAzkar(btnAzkarMorning2, 3, findViewById(R.id._2));
        addAzkar(btnAzkarMorning3, 3, findViewById(R.id._3));
        addAzkar(btnAzkarMorning4, 3, findViewById(R.id._4));
        addAzkar(btnAzkarMorning5, 1, findViewById(R.id._5));
        addAzkar(btnAzkarMorning6, 1, findViewById(R.id._6));
        addAzkar(btnAzkarMorning7, 3, findViewById(R.id._7));
        addAzkar(btnAzkarMorning8, 4, findViewById(R.id._8));
        addAzkar(btnAzkarMorning9, 1, findViewById(R.id._9));
        addAzkar(btnAzkarMorning10, 7, findViewById(R.id._10));
        addAzkar(btnAzkarMorning11, 3, findViewById(R.id._11));
        addAzkar(btnAzkarMorning12, 1, findViewById(R.id._12));
        addAzkar(btnAzkarMorning13, 1, findViewById(R.id._13));
        addAzkar(btnAzkarMorning14, 3, findViewById(R.id._14));
        addAzkar(btnAzkarMorning15, 3, findViewById(R.id._15));
        addAzkar(btnAzkarMorning16, 3, findViewById(R.id._16));
        addAzkar(btnAzkarMorning17, 1, findViewById(R.id._17));
        addAzkar(btnAzkarMorning18, 3, findViewById(R.id._18));
        addAzkar(btnAzkarMorning19, 1, findViewById(R.id._19));
        addAzkar(btnAzkarMorning20, 1, findViewById(R.id._20));
        addAzkar(btnAzkarMorning21, 3, findViewById(R.id._21));
        addAzkar(btnAzkarMorning22, 10, findViewById(R.id._22));
        addAzkar(btnAzkarMorning23, 3, findViewById(R.id._23));
        addAzkar(btnAzkarMorning24, 3, findViewById(R.id._24));
        addAzkar(btnAzkarMorning25, 3, findViewById(R.id._25));
        addAzkar(btnAzkarMorning26, 3, findViewById(R.id._26));
        addAzkar(btnAzkarMorning27, 1, findViewById(R.id._27));
        addAzkar(btnAzkarMorning28, 1, findViewById(R.id._28));
        addAzkar(btnAzkarMorning29, 100, findViewById(R.id._29));
        addAzkar(btnAzkarMorning30, 100, findViewById(R.id._30));
        addAzkar(btnAzkarMorning31, 100, findViewById(R.id._31));

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