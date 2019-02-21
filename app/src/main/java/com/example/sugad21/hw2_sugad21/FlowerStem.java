package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/*
author: Dylan Suga
Date: 2-20-19
 */

public class FlowerStem  {
    //instance variables and set
    //I think this is bad etiquette... Sorry
    private int TAP_MARGIN = 10;
    protected Rect myRect = new Rect(500,900,700,1500);
    private Paint newPaint1;
    private int newGreen;
    private int newRed;
    private int newBlue;

    //this method is called in listener class and is set there
    //instance variables are defined by progress
    public void setStemColor(int red, int green, int blue){

        newGreen = green;
        newRed = red;
        newBlue = blue;

    }
    /*
    Called in the flowerView class to draw the basic shape of the stem aspect
    of the flower
     */
    public void drawMe(Canvas canvas) {
        newPaint1 = new Paint();
        newPaint1.setARGB(255,newRed,newGreen,newBlue);
        canvas.drawRect(myRect, newPaint1);

    }

    /*
    External Citation
    Date: 2-17-19
    Problem: Before, I thought I could tap on the image and check if it touched a subclass of the
    SurfaceView, but that didn't work, so I used the optional code. I like it.
    Solution: I used the containsPoint method
     */
    public boolean containsPoint(int x, int y) {

        //Want to check for a tap within a slightly larger rectangle
        int left = this.myRect.left - TAP_MARGIN;
        int top = this.myRect.top - TAP_MARGIN;
        int right = this.myRect.right + TAP_MARGIN;
        int bottom = this.myRect.bottom + TAP_MARGIN;
        Rect r = new Rect(left, top, right, bottom);

        return r.contains(x, y);
    }//contaisPoint

}
