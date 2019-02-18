package com.example.sugad21.hw2_sugad21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

public class FlowerView extends SurfaceView {
    private Flower newFlower;
    private String name = "";
    private int red = 0;
    private int green = 0;
    private int blue = 0;
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

    private void init() {

        setWillNotDraw(false);
    }

    public Flower getFlower() {
        newFlower = new Flower(name,red,green,blue);
        return newFlower;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        getFlower().drawFlower(canvas);

    }


}
