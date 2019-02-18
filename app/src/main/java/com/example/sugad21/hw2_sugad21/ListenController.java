package com.example.sugad21.hw2_sugad21;

import android.util.EventLog;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;

public class ListenController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    private SeekBar nRedBar = null;
    private SeekBar nGreenBar = null;
    private SeekBar nBlueBar = null;
    private FlowerView fView = null;
    private Flower prevFlower = null;
    private int redColor;
    private int greenColor;
    private int blueColor;
    private String selectedObject;






    /*
    Default constructor is meant handle elements from the MainActivity class
     */

    public ListenController(SeekBar oRedBar, SeekBar oGreenBar, SeekBar oBlueBar,FlowerView oldFView){
        nRedBar = oRedBar;
        nGreenBar = oGreenBar;
        nBlueBar = oBlueBar;
        fView = oldFView;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event){
        int xCoord = (int)event.getX();
        int yCoord = (int)event.getY();

        if(prevFlower.getLeftPetal().containsPoint(xCoord,yCoord)){
            selectedObject = "Left Petal";
            return true;
        }
        else if(prevFlower.getRightPetal().containsPoint(xCoord,yCoord)){
            selectedObject = "Right Petal";
            return true;
        }
        else if(prevFlower.getBottomPetal().containsPoint(xCoord,yCoord)){
            selectedObject = "Bottom Petal";
            return true;
        }
        else if(prevFlower.getCenterFlower().containsPoint(xCoord,yCoord)){
            selectedObject = "Center of Flower";
            return true;
        }
        else if(prevFlower.getTopPetal().containsPoint(xCoord,yCoord)){
            selectedObject = "Top petal";
            return true;
        }
        else if(prevFlower.getFlowerStem().containsPoint(xCoord,yCoord)){
            selectedObject = "Flower Stem";
            return true;
        }
        return false;
    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if(seekBar == nRedBar){
            redColor = nRedBar.getProgress();
            String p = Integer.toString(redColor);

            Log.i(selectedObject,"redColor");
        }
        else if(seekBar == nGreenBar){
            greenColor = nGreenBar.getProgress();
            String b = Integer.toString(greenColor);
            Log.i(b,"blueColor");
        }
        else if(seekBar == nBlueBar){
            blueColor = nBlueBar.getProgress();
            String a = Integer.toString(blueColor);
            Log.i(a,"greenColor");
        }
        prevFlower = new Flower(selectedObject,redColor,greenColor,blueColor);

        fView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    /*
    Do Nothing
     */
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        /*
        Do Nothing
         */
    }
}
