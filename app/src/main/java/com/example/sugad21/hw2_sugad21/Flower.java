package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;


public class Flower{
    public static final int TAP_MARGIN = 10;
    protected int red;
    protected int green;
    protected int blue;
    protected String myName = "name";
    private LeftPetal leftPetal = null;
    private BottomPetal bottomPetal = null;
    private RightPetal rightPetal = null;
    private TopPetal topPetal = null;
    private FlowerStem newStem = null;
    private CenterFlower centerFlower = null;
    Paint newPaint = new Paint();

    public Flower(String name, int newRed, int newGreen, int newBlue){
        this.myName = name;
        setColor(newRed,newGreen,newBlue);
        red = newRed;
        green = newGreen;
        blue = newBlue;
    }

    public void setColor(int red, int green, int blue){
        newPaint.setARGB(255,red,green,blue);
    }

    public LeftPetal getLeftPetal(){
        return leftPetal = new LeftPetal(myName,red,green,blue,0,200,50);
    }
    public RightPetal getRightPetal(){
        return rightPetal = new RightPetal(myName,red,green,blue,100,300,50);
    }
    public TopPetal getTopPetal(){
        return topPetal = new TopPetal(myName,red,green,blue,200,400,50);
    }
    public BottomPetal getBottomPetal(){
        return bottomPetal = new BottomPetal(myName,red,green,blue,300,500,50);
    }
    public CenterFlower getCenterFlower(){
        return centerFlower = new CenterFlower(myName,red,green,blue,400,600,50);
    }
    public FlowerStem getFlowerStem(){
        return newStem = new FlowerStem(myName,red,green,blue,300,300,300,300);
    }





    public void drawFlower(Canvas canvas){
        getLeftPetal().drawMe(canvas);
        getBottomPetal().drawMe(canvas);
        getCenterFlower().drawMe(canvas);
        getTopPetal().drawMe(canvas);
        getFlowerStem().drawMe(canvas);
        getRightPetal().drawMe(canvas);
    }
}
