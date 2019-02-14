package com.example.sugad21.hw2_sugad21;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class FlowerView extends SurfaceView{
    private Flower newFlower;
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
        newFlower = new Flower();
        setWillNotDraw(false);
    }

    public Flower getFlower(){
        return newFlower;
    }

    @Override
    protected void onDraw(Canvas canvas){
      newFlower.drawFlower(canvas);
    }

}
