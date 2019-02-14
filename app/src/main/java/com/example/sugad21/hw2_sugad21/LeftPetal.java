package com.example.sugad21.hw2_sugad21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.view.View;

public class LeftPetal {

    private int oldRed;
    private int oldGreen;
    private int oldBlue;




    public void setLColor(int red, int green, int blue){
        oldRed = red;
        oldGreen = green;
        oldBlue = blue;
    }

    public void drawLeftPetal(Canvas canvas){
        Paint leftPaint = new Paint();
        leftPaint.setARGB(255,oldRed,oldGreen,oldBlue);

    }



}
