package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class FlowerStem extends Flower {


    /**
     * the position and size of the rectangle is stored here
     */
    protected Rect myRect;

    /**
     * the rectangles dimensions must be defined at construction
     */
    public FlowerStem(String name, int newRed, int newGreen, int newBlue,
                      int left, int top, int right, int bottom) {
        super(name, newRed, newGreen, newBlue);

        this.myRect = new Rect(left, top, right, bottom);
    }



    public void drawMe(Canvas canvas) {
        canvas.drawRect(myRect, newPaint);  //main rectangle
        //canvas.drawRect(myRect, outlinePaint);  //outline around rectangle
    }


    public boolean containsPoint(int x, int y) {

        //Want to check for a tap within a slightly larger rectangle
        int left = this.myRect.left - TAP_MARGIN;
        int top = this.myRect.top - TAP_MARGIN;
        int right = this.myRect.right + TAP_MARGIN;
        int bottom = this.myRect.bottom + TAP_MARGIN;
        Rect r = new Rect(left, top, right, bottom);

        return r.contains(x, y);
    }//contaisPoint



    public int getSize() {
        return this.myRect.width() * this.myRect.height();
    }
/*
    @Override
    public void drawHighlight(Canvas canvas) {
        canvas.drawRect(myRect, highlightPaint);
        canvas.drawRect(myRect, outlinePaint);  //keep outline so it stands out
    }
*/
}
