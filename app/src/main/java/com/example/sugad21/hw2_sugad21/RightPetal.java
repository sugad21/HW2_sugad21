package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;
/*
Author: Dylan Suga
Date: 2-20-19
 */
public class RightPetal  {

    /** these variables define the location and radius of a circle */
    private int TAP_MARGIN = 10;
    private int x = 900;
    private int y = 600;
    private int radius= 200;
    private Paint newPaint1;
    private int newRed = 0;
    private int newGreen = 0;
    private int newBlue = 0;



    /*
    this method is called in listener class and is set there
    instance variables are defined by progress
     */
    public void setRightColor(int red, int green, int blue){
        newGreen = green;
        newRed = red;
        newBlue = blue;

    }

    /*
        Called in the flowerView class to draw the basic shape of the right petal aspect
        of the flower
         */
    public void drawMe(Canvas canvas) {
        newPaint1 = new Paint();
        newPaint1.setARGB(255,newRed,newGreen,newBlue);
        canvas.drawCircle(x, y, radius, newPaint1);  //main circle
    }

    /*
    External Citation
    Date: 2-17-19
    Problem: Before, I thought I could tap on the image and check if it touched a subclass of the
    SurfaceView, but that didn't work, so I used the optional code. I like it.
    Solution: I used the containsPoint method
     */
    public boolean containsPoint(int x, int y) {
        //Calculate the distance between this point and the center
        int xDist = Math.abs(x - this.x);
        int yDist = Math.abs(y - this.y);
        int dist = (int)Math.sqrt(xDist*xDist + yDist*yDist);  //Thanks, Pythagoras :)

        return (dist < this.radius + TAP_MARGIN);
    }//containsPoint

}//class CustomCircle

