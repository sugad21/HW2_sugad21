package com.example.sugad21.hw2_sugad21;

import android.util.EventLog;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class ListenController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    private SeekBar nRedBar = null;
    private SeekBar nGreenBar = null;
    private SeekBar nBlueBar = null;
    private FlowerView fView = null;
    private Flower prevFlower = null;
    private TextView currentLocation = null;
    private int redColor;
    private int greenColor;
    private int blueColor;
    private String selectedObject;






    /*
    Default constructor is meant handle elements from the MainActivity class
     */

    public ListenController(SeekBar oRedBar, SeekBar oGreenBar, SeekBar oBlueBar,FlowerView oldFView,TextView newLocation){
        nRedBar = oRedBar;
        nGreenBar = oGreenBar;
        nBlueBar = oBlueBar;
        fView = oldFView;
        currentLocation = newLocation;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event){
        int xCoord = (int)event.getX();
        int yCoord = (int)event.getY();

        if(prevFlower.getLeftPetal().containsPoint(xCoord,yCoord)){
            currentLocation.setText("Left Petal");

            return true;
        }
        else if(prevFlower.getRightPetal().containsPoint(xCoord,yCoord)){
            currentLocation.setText("Right Petal");

            return true;
        }
        else if(prevFlower.getBottomPetal().containsPoint(xCoord,yCoord)){
            currentLocation.setText("Bottom Petal");

            return true;
        }
        else if(prevFlower.getCenterFlower().containsPoint(xCoord,yCoord)){
            currentLocation.setText("Center Petal");

            return true;
        }
        else if(prevFlower.getTopPetal().containsPoint(xCoord,yCoord)){
            currentLocation.setText("Top Petal");
            return true;
        }
        else if(prevFlower.getFlowerStem().containsPoint(xCoord,yCoord)){
            currentLocation.setText(" Flower Stem");

            return true;
        }

        return false;
    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if(seekBar == nRedBar || seekBar == nGreenBar || seekBar == nBlueBar){
            blueColor = nBlueBar.getProgress();
            greenColor = nGreenBar.getProgress();
            redColor = nRedBar.getProgress();
            prevFlower = new Flower();


            if(currentLocation.getText() == "Left Petal"){
                prevFlower = new Flower(redColor,greenColor,blueColor);




            }
            else if(currentLocation.getText() == "Right Petal"){
                prevFlower = new Flower(redColor,greenColor,blueColor);

            }
            else if(currentLocation.getText() == "Bottom Petal"){
                prevFlower = new Flower(redColor,greenColor,blueColor);




            }
            else if(currentLocation.getText() == "Top Petal"){
                prevFlower = new Flower(redColor,greenColor,blueColor);




            }
            else if(currentLocation.getText() == "Center Petal"){
                prevFlower = new Flower(redColor,greenColor,blueColor);

            }
            else if(currentLocation.getText() == "Flower Stem"){
                prevFlower = new Flower(redColor,greenColor,blueColor);


            }
        }
        prevFlower.getFlower();
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
