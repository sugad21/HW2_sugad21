package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;

public class CenterFlower {
    private int oldRed;
    private int oldGreen;
    private int oldBlue;




    public void setCColor(int red, int green, int blue){
        oldRed = red;
        oldGreen = green;
        oldBlue = blue;
    }

    public void drawCenterFlower(Canvas canvas){
        Paint leftPaint = new Paint();
        leftPaint.setARGB(255,oldRed,oldGreen,oldBlue);

    }
}