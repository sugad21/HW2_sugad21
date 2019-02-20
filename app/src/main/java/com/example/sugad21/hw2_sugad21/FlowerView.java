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

public class FlowerView extends SurfaceView {
    private Flower fObject;
    private Canvas c = null;
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

        fObject = new Flower();
        setWillNotDraw(false);
    }





    @Override
    protected void onDraw(Canvas canvas) {
        if(c == null){
            c = canvas;
        }

        fObject.drawFlower(canvas);

    }


}
