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

public class AzkarNight extends AppCompatActivity {
    Button btnAzkarNight1;
    Button btnAzkarNight2;
    Button btnAzkarNight3;
    Button btnAzkarNight4;
    Button btnAzkarNight5;
    Button btnAzkarNight6;
    Button btnAzkarNight7;
    Button btnAzkarNight8;
    Button btnAzkarNight9;
    Button btnAzkarNight10;
    Button btnAzkarNight11;
    Button btnAzkarNight12;
    Button btnAzkarNight13;
    Button btnAzkarNight14;
    Button btnAzkarNight15;
    Button btnAzkarNight16;
    Button btnAzkarNight17;
    Button btnAzkarNight18;
    Button btnAzkarNight19;
    Button btnAzkarNight20;
    Button btnAzkarNight21;
    Button btnAzkarNight22;
    Button btnAzkarNight23;
    Button btnAzkarNight24;
    Button btnAzkarNight25;
    Button btnAzkarNight26;
    Button btnAzkarNight27;
    Button btnAzkarNight28;
    Button btnAzkarNight29;
    Button btnAzkarNight30;
    Vibrator vibrator;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_night);
        setTitle("اذكار المساء");

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        layout = findViewById(R.id.layoutNight);
        btnAzkarNight1 = findViewById(R.id.btnAzkarNight1);
        btnAzkarNight2 = findViewById(R.id.btnAzkarNight2);
        btnAzkarNight3 = findViewById(R.id.btnAzkarNight3);
        btnAzkarNight4 = findViewById(R.id.btnAzkarNight4);
        btnAzkarNight5 = findViewById(R.id.btnAzkarNight5);
        btnAzkarNight6 = findViewById(R.id.btnAzkarNight6);
        btnAzkarNight7 = findViewById(R.id.btnAzkarNight7);
        btnAzkarNight8 = findViewById(R.id.btnAzkarNight8);
        btnAzkarNight9 = findViewById(R.id.btnAzkarNight9);
        btnAzkarNight10 = findViewById(R.id.btnAzkarNight10);
        btnAzkarNight11 = findViewById(R.id.btnAzkarNight11);
        btnAzkarNight12 = findViewById(R.id.btnAzkarNight12);
        btnAzkarNight13 = findViewById(R.id.btnAzkarNight13);
        btnAzkarNight14 = findViewById(R.id.btnAzkarNight14);
        btnAzkarNight15 = findViewById(R.id.btnAzkarNight15);
        btnAzkarNight16 = findViewById(R.id.btnAzkarNight16);
        btnAzkarNight17 = findViewById(R.id.btnAzkarNight17);
        btnAzkarNight18 = findViewById(R.id.btnAzkarNight18);
        btnAzkarNight19 = findViewById(R.id.btnAzkarNight19);
        btnAzkarNight20 = findViewById(R.id.btnAzkarNight20);
        btnAzkarNight21 = findViewById(R.id.btnAzkarNight21);
        btnAzkarNight22 = findViewById(R.id.btnAzkarNight22);
        btnAzkarNight23 = findViewById(R.id.btnAzkarNight23);
        btnAzkarNight24 = findViewById(R.id.btnAzkarNight24);
        btnAzkarNight25 = findViewById(R.id.btnAzkarNight25);
        btnAzkarNight26 = findViewById(R.id.btnAzkarNight26);
        btnAzkarNight27 = findViewById(R.id.btnAzkarNight27);
        btnAzkarNight28 = findViewById(R.id.btnAzkarNight28);
        btnAzkarNight29 = findViewById(R.id.btnAzkarNight29);
        btnAzkarNight30 = findViewById(R.id.btnAzkarNight30);

        addAzkar(btnAzkarNight1, 1, findViewById(R.id._1));
        addAzkar(btnAzkarNight2, 1, findViewById(R.id._2));
        addAzkar(btnAzkarNight3, 3, findViewById(R.id._3));
        addAzkar(btnAzkarNight4, 3, findViewById(R.id._4));
        addAzkar(btnAzkarNight5, 3, findViewById(R.id._5));
        addAzkar(btnAzkarNight6, 1, findViewById(R.id._6));
        addAzkar(btnAzkarNight7, 1, findViewById(R.id._7));
        addAzkar(btnAzkarNight8, 3, findViewById(R.id._8));
        addAzkar(btnAzkarNight9, 4, findViewById(R.id._9));
        addAzkar(btnAzkarNight10, 1, findViewById(R.id._10));
        addAzkar(btnAzkarNight11, 7, findViewById(R.id._11));
        addAzkar(btnAzkarNight12, 3, findViewById(R.id._12));
        addAzkar(btnAzkarNight13, 1, findViewById(R.id._13));
        addAzkar(btnAzkarNight14, 1, findViewById(R.id._14));
        addAzkar(btnAzkarNight15, 3, findViewById(R.id._15));
        addAzkar(btnAzkarNight16, 3, findViewById(R.id._16));
        addAzkar(btnAzkarNight17, 3, findViewById(R.id._17));
        addAzkar(btnAzkarNight18, 1, findViewById(R.id._18));
        addAzkar(btnAzkarNight19, 3, findViewById(R.id._19));
        addAzkar(btnAzkarNight20, 1, findViewById(R.id._20));
        addAzkar(btnAzkarNight21, 1, findViewById(R.id._21));
        addAzkar(btnAzkarNight22, 3, findViewById(R.id._22));
        addAzkar(btnAzkarNight23, 10, findViewById(R.id._23));
        addAzkar(btnAzkarNight24, 3, findViewById(R.id._24));
        addAzkar(btnAzkarNight25, 3, findViewById(R.id._25));
        addAzkar(btnAzkarNight26, 3, findViewById(R.id._26));
        addAzkar(btnAzkarNight27, 3, findViewById(R.id._27));
        addAzkar(btnAzkarNight28, 100, findViewById(R.id._28));
        addAzkar(btnAzkarNight29, 1, findViewById(R.id._29));
        addAzkar(btnAzkarNight30, 100, findViewById(R.id._30));

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