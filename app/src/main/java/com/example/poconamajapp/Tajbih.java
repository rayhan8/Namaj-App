package com.example.poconamajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tajbih extends AppCompatActivity {
    TextView tvdisplay;
    Button add,reset;
    Button plus_one;
    Button plus_two;
    Button plus_three;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajbih);

        tvdisplay = findViewById(R.id.display);
        add = findViewById(R.id.plus);
        reset = findViewById(R.id.reset);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvdisplay.setText("সুবাহান আল্লাহ "+count);
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                tvdisplay.setText(""+count);
            }
        });

        plus_one = findViewById(R.id.plus_alhamdulillah);

        plus_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvdisplay.setText("আলহামদুলিল্লাহ "+count);
            }
        });


        plus_two = findViewById(R.id.plus_allahu_akbar);


        plus_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvdisplay.setText("আল্লাহু আকবার "+count);
            }
        });


        plus_three = findViewById(R.id.plus_la_ilaha_illallah);


        plus_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvdisplay.setText("লা ইলাহা ইল্লাল্লাহু "+count);
            }
        });



    }
}