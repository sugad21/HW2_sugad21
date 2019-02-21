package com.example.sugad21.hw2_sugad21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;
/*
Author: Dylan Suga
Date: 2-20-19
 */
public class FlowerView extends SurfaceView {

    private LeftPetal leftPetal;
    private BottomPetal bottomPetal;
    private RightPetal rightPetal;
    private TopPetal topPetal;
    private FlowerStem newStem;
    private CenterFlower centerFlower;


    /*
    Default constructors of SurfaceView that are already implemented.
     */
    public FlowerView(Context context) {
        super(context);
        init();
    }

    public FlowerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FlowerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /*
    new petals have to be declared in order to return a non-null object
     */
    private void init() {
       leftPetal = new LeftPetal();
       bottomPetal = new BottomPetal();
       rightPetal = new RightPetal();
       topPetal = new TopPetal();
       newStem = new FlowerStem();
       centerFlower = new CenterFlower();
        setWillNotDraw(false);
    }

    /*
    getters so I can return the current state of a petal
    to the listenerControl methods
     */
    public LeftPetal getLeftPetal(){
        return leftPetal;
    }
    public RightPetal getRightPetal(){
        return rightPetal;
    }
    public TopPetal getTopPetal(){
        return topPetal;
    }
    public BottomPetal getBottomPetal(){
        return bottomPetal;
    }
    public CenterFlower getCenterFlower(){
        return centerFlower;
    }
    public FlowerStem getFlowerStem(){
        return newStem;
    }

    /*
    Draw all the methods that use Canvas
    onto the surface view
     */
    @Override
    public void onDraw(Canvas canvas){
        leftPetal.drawMe(canvas);
        rightPetal.drawMe(canvas);
        newStem.drawMe(canvas);
        centerFlower.drawMe(canvas);
        topPetal.drawMe(canvas);
        bottomPetal.drawMe(canvas);

    }


}
