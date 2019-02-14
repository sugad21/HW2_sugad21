package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;

public class FlowerStem {
    private int oldRed;
    private int oldGreen;
    private int oldBlue;




    public void setSColor(int red, int green, int blue){
        oldRed = red;
        oldGreen = green;
        oldBlue = blue;
    }

    public void drawFlowerStem(Canvas canvas){
        Paint stemPaint = new Paint();
        stemPaint.setARGB(255,oldRed,oldGreen,oldBlue);
        canvas.drawRect(250,250,250,250,stemPaint);

    }
}
