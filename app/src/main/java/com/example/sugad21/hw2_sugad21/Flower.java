package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;


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
    Paint newPaint;

    public Flower(int newRed, int newGreen, int newBlue){
        String l = Integer.toString(newRed);
        Log.i(l,"this is red222 int");


        setColor(newRed,newGreen,newBlue);
        red = newRed;
        green = newGreen;
        blue = newBlue;
    }

    public Flower(){
        getFlower();
    }

    public int getRed1(){
        return red;
    }
    public int getGreen2(){
        return green;
    }
    public int getBlue2(){
        return blue;
    }

    public void setColor(int red, int green, int blue){
        newPaint = new Paint();
        newPaint.setARGB(255,red,green,blue);

    }

    public void setFlower(Flower thisOne){

    }

    public LeftPetal getLeftPetal(){
        String l = Integer.toString(red);
        Log.i(l,"this is red int");
        return leftPetal = new LeftPetal(getRed1(),getGreen2(),getBlue2(),300,600,200);
    }
    public RightPetal getRightPetal(){
        return rightPetal = new RightPetal(getRed1(),getGreen2(),getBlue2(),900,600,200);
    }
    public TopPetal getTopPetal(){
        return topPetal = new TopPetal(getRed1(),getGreen2(),getBlue2(),600,300,200);
    }
    public BottomPetal getBottomPetal(){
        return bottomPetal = new BottomPetal(getRed1(),getGreen2(),getBlue2(),600,900,200);
    }
    public CenterFlower getCenterFlower(){
        return centerFlower = new CenterFlower(getRed1(),getGreen2(),getBlue2(),600,600,100);
    }
    public FlowerStem getFlowerStem(){
        return newStem = new FlowerStem(getRed1(),getGreen2(),getBlue2(),500,900,700,1500);
    }
    public Flower getFlower(){
        return new Flower(getRed1(),getGreen2(),getBlue2());
    }
    public void setLeftPetal(LeftPetal newLeftPetal){
        leftPetal = newLeftPetal;
    }
    public void setRightPetal(RightPetal newRightPetal){
        rightPetal= newRightPetal;
    }
    public void setTopPetal(TopPetal newTopPetal){
        topPetal = newTopPetal;
    }
    public void setBottomPetal(BottomPetal newBottomPetal){
        bottomPetal = newBottomPetal;
    }public void setCenterFlower(CenterFlower newCenterFlower){
        centerFlower = newCenterFlower;
    }public void setFlowerStem(FlowerStem newFlowerStem){
        newStem = newFlowerStem;
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
