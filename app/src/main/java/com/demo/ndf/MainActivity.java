package com.demo.ndf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Integer totalValue = 0;
    private Integer statValue = 0;
    private Double ratio;
    DecimalFormat ratioFormat = new DecimalFormat("#.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button stat = findViewById(R.id.stat);
        final Button pasStat = findViewById(R.id.passtat);
        final TextView total = findViewById(R.id.total);

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalValue ++;
                statValue ++;
                total.setText(statValue.toString()+"/"+totalValue.toString());
            }
        });

        pasStat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalValue ++;
                ratio = Double.valueOf(statValue/totalValue);
                total.setText(statValue.toString()+"/"+totalValue.toString());
            }
        });
    }
}