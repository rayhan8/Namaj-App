package com.example.poconamajapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    private CardView islam,ajan,waqt,wudu,gosol,calender,kalima,dua,tajbih,compass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

//        Card
        islam = (CardView) findViewById(R.id.islamID);
        ajan = (CardView) findViewById(R.id.ajanID);
        waqt = (CardView) findViewById(R.id.waqtID);
        wudu = (CardView) findViewById(R.id.wuduID);
        gosol = (CardView) findViewById(R.id.gosolID);
        calender = (CardView) findViewById(R.id.calenderID);
        kalima = (CardView) findViewById(R.id.kalimaID);
        dua = (CardView) findViewById(R.id.duaID);
        tajbih = (CardView) findViewById(R.id.tajbihID);
        compass = (CardView) findViewById(R.id.compassID);

//        add click listener to the card
        islam.setOnClickListener(this);
        ajan.setOnClickListener(this);
        waqt.setOnClickListener(this);
        wudu.setOnClickListener(this);
        gosol.setOnClickListener(this);
        calender.setOnClickListener(this);
        kalima.setOnClickListener(this);
        dua.setOnClickListener(this);
        tajbih.setOnClickListener(this);
        compass.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.islamID: i=new Intent(this,Islam.class);startActivity(i);break;
            case R.id.ajanID: i=new Intent(this,Ajan.class);startActivity(i);break;
            case R.id.waqtID: i=new Intent(this,Waqt.class);startActivity(i);break;
            case R.id.wuduID: i=new Intent(this,Wudu.class);startActivity(i);break;
            case R.id.gosolID: i=new Intent(this,Gosol.class);startActivity(i);break;
            case R.id.calenderID: i=new Intent(this,Calender.class);startActivity(i);break;
            case R.id.kalimaID: i=new Intent(this,Kalima.class);startActivity(i);break;
            case R.id.duaID: i=new Intent(this,Dua.class);startActivity(i);break;
            case R.id.tajbihID: i=new Intent(this,Tajbih.class);startActivity(i);break;
            case R.id.compassID: i=new Intent(this,Compass.class);startActivity(i);break;
            default:break;
        }
    }
}