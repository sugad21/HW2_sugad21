package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;

public class RightPetal {
    private int oldRed;
    private int oldGreen;
    private int oldBlue;




    public void setRColor(int red, int green, int blue){
        oldRed = red;
        oldGreen = green;
        oldBlue = blue;
    }

    public void drawRightPetal(Canvas canvas){
        Paint leftPaint = new Paint();
        leftPaint.setARGB(255,oldRed,oldGreen,oldBlue);

    }
}