package com.example.eslam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sebha extends AppCompatActivity {

    TextView txtShow;
    Button btnClick;
    Button btnReset;
    Vibrator vibrator;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebha);

        setTitle("السبحة");
        txtShow =findViewById(R.id.txtShow);
        btnClick = findViewById(R.id.btnClick);
        btnReset = findViewById(R.id.btnReset);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(50);
                ++counter;
                txtShow.setText("" + counter);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(150);
                counter = 0;
                txtShow.setText("" + counter);

            }
        });
    }
}