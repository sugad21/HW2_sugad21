package com.example.sugad21.hw2_sugad21;

import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;

public class ListenController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    private SeekBar nRedBar = null;
    private SeekBar nGreenBar = null;
    private SeekBar nBlueBar = null;
    private FlowerView fView = null;
    private int redColor;
    private int greenColor;
    private int blueColor;






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
    public boolean onTouch(View v, MotionEvent event) {

        if(v.getClass().equals(fView.getFlower().getLeftPetal())){
            fView.getFlower().getLeftPetal().setLColor(redColor,greenColor,blueColor);
            return true;
        }
        else if(v.getClass().equals(fView.getFlower().getBottomPetal())){
            fView.getFlower().getRightPetal().setRColor(redColor,greenColor,blueColor);
            return true;
        }
        else if(v.getClass().equals(fView.getFlower().getCenterFlower())){
            fView.getFlower().getTopPetal().setTColor(redColor,greenColor,blueColor);
            return true;
        }
        else if(v.getClass().equals(fView.getFlower().getRightPetal())){
            fView.getFlower().getBottomPetal().setBColor(redColor,greenColor,blueColor);
            return true;
        }
        else if(v.getClass().equals(fView.getFlower().getTopPetal())){
            fView.getFlower().getCenterFlower().setCColor(redColor,greenColor,blueColor);
            return true;
        }
        else if(v.getClass().equals(fView.getFlower().getNewStem())){
            fView.getFlower().getNewStem().setSColor(redColor,greenColor,blueColor);
            return true;
        }
        return false;
    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if(seekBar == nRedBar){
            redColor = nRedBar.getProgress();
        }
        else if(seekBar == nGreenBar){
            greenColor = nGreenBar.getProgress();
        }
        else if(seekBar == nBlueBar){
            blueColor = nBlueBar.getProgress();
        }
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
