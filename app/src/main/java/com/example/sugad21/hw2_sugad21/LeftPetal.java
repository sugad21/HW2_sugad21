package com.example.sugad21.hw2_sugad21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.view.View;

public class LeftPetal extends Flower {

    /** these variables define the location and radius of a circle */
    private int x;
    private int y;
    private int radius;
    private int red;
    private int green;
    private int blue;

    /** the circle's dimensions must be defined at construction */
    public LeftPetal(String name, int newRed, int newGreen, int newBlue, int x, int y, int radius)
    {
        super(name,newRed,newGreen,newBlue);

        this.x = x;
        this.y = y;
        this.radius = radius;
        this.red = newRed;
        this.green = newGreen;
        this.blue = newBlue;
    }



    public void drawMe(Canvas canvas) {
        canvas.drawCircle(x, y, radius, newPaint);  //main circle
        //canvas.drawCircle(x, y, radius, outlinePaint);  //outline around circle
    }


    /** for ease of calculation, just draw a box around the circle and see if the point is in that */

    public boolean containsPoint(int x, int y) {
        //Calculate the distance between this point and the center
        int xDist = Math.abs(x - this.x);
        int yDist = Math.abs(y - this.y);
        int dist = (int)Math.sqrt(xDist*xDist + yDist*yDist);  //Thanks, Pythagoras :)

        return (dist < this.radius + TAP_MARGIN);
    }//contaisPoint


    /** I knew that middle school geometry class would pay off someday */

    public int getSize() {
        return (int)(Math.PI * this.radius * this.radius);
    }

/*
    @Override
    public void drawHighlight(Canvas canvas) {
        canvas.drawCircle(x, y, radius, highlightPaint);
        //canvas.drawCircle(x, y, radius, outlinePaint);  //keep outline so it stands out
    }
    */

}//class CustomCircle







