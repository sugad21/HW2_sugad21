package com.example.sugad21.hw2_sugad21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        initializes the variables for objects that will change.
        If anything changes, ListenController will receive these changes.
         */

        FlowerView mySurface = findViewById(R.id.flowerView);
        SeekBar rSeekBar = (SeekBar)findViewById(R.id.redSeekBar);
        SeekBar gSeekBar = (SeekBar)findViewById(R.id.greenSeekBar);
        SeekBar bSeekBar = (SeekBar)findViewById(R.id.blueSeekBar);
        TextView locationText = (TextView)findViewById(R.id.locationText);

        ListenController listControl = new ListenController(rSeekBar,gSeekBar,bSeekBar,mySurface,locationText);


        mySurface.setOnTouchListener(listControl);
        rSeekBar.setOnSeekBarChangeListener(listControl);
        gSeekBar.setOnSeekBarChangeListener(listControl);
        bSeekBar.setOnSeekBarChangeListener(listControl);




    }
}
