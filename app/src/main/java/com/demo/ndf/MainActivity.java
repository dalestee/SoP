package com.demo.ndf;

import static com.demo.ndf.UtilityMethods.round;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Double totalValue = 0.0;
    private Double statValue = 0.0;
    private Integer totalValueInt = 0;
    private Double ratio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button stat = findViewById(R.id.stat);
        final Button pasStat = findViewById(R.id.passtat);
        final TextView ratioText = findViewById(R.id.ratio);
        final TextView total = findViewById(R.id.total);
        final Button reset = findViewById(R.id.reset_button);
        final Button save = findViewById(R.id.save_button);


        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalValue ++;
                statValue ++;
                totalValueInt ++;
                ratio = statValue/totalValue;
                ratio = ratio*100;
                ratio = round(ratio,2);
                ratioText.setText(ratio+"%");
                total.setText(totalValueInt.toString());
            }
        });

        pasStat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalValue ++;
                totalValueInt ++;
                ratio = statValue/totalValue;
                ratio = ratio*100;
                ratio = round(ratio,2);
                ratioText.setText(ratio+"%");
                total.setText(totalValueInt.toString());
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalValue = 0.0;
                statValue = 0.0;
                ratioText.setText("0.0%");
            }
        });
    }
}