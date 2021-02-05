package com.example.eslam;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AzkarWakingUp extends AppCompatActivity {

    Button btnAzkarWakingUp1;
    Button btnAzkarWakingUp2;
    Button btnAzkarWakingUp3;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_waking_up);
        setTitle("اذكار الاستيقاظ");

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        btnAzkarWakingUp1 = findViewById(R.id.btnAzkarWakingUp1);
        btnAzkarWakingUp2 = findViewById(R.id.btnAzkarWakingUp2);
        btnAzkarWakingUp3 = findViewById(R.id.btnAzkarWakingUp3);

        addAzkar(btnAzkarWakingUp1, 1,  findViewById(R.id._1));
        addAzkar(btnAzkarWakingUp2, 1, findViewById(R.id._2));
        addAzkar(btnAzkarWakingUp3, 1, findViewById(R.id._3));
        
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
                    txtZekr.setTextSize(0);
                    txtZekr.setText("");
                    btnZekr.setText("");
                    btnZekr.setVisibility(View.INVISIBLE);
                    txtZekr.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}