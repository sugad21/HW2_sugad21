package com.example.sugad21.hw2_sugad21;

import android.graphics.Canvas;

public class Flower{

    private LeftPetal leftPetal = new LeftPetal();
    private BottomPetal bottomPetal = new BottomPetal();
    private RightPetal rightPetal = new RightPetal();
    private TopPetal topPetal = new TopPetal();
    private FlowerStem newStem = new FlowerStem();
    private CenterFlower centerFlower = new CenterFlower();

    public LeftPetal getLeftPetal() {
        return leftPetal;
    }

    public BottomPetal getBottomPetal() {
        return bottomPetal;
    }

    public FlowerStem getNewStem() {
        return newStem;
    }

    public RightPetal getRightPetal() {
        return rightPetal;
    }

    public TopPetal getTopPetal() {
        return topPetal;
    }

    public CenterFlower getCenterFlower() {
        return centerFlower;
    }


    public void drawFlower(Canvas canvas){
        leftPetal.drawLeftPetal(canvas);
        bottomPetal.drawBottomPetal(canvas);
        rightPetal.drawRightPetal(canvas);
        topPetal.drawTopPetal(canvas);
        newStem.drawFlowerStem(canvas);
        centerFlower.drawCenterFlower(canvas);
    }
}
