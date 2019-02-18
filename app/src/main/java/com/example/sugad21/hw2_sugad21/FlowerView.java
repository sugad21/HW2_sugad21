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

public class FlowerView extends SurfaceView {
    private Flower fObject;

    private String name = "";

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





    @Override
    protected void onDraw(Canvas canvas) {
        fObject = new Flower(name,100,100,100);

        fObject.drawFlower(canvas);

    }


}
