package com.example.sugad21.hw2_sugad21;


import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;
/*
Author: Dylan Suga
Date: 2-20-19
 */
public class ListenController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    private SeekBar nRedBar = null;
    private SeekBar nGreenBar = null;
    private SeekBar nBlueBar = null;
    private FlowerView fView = null;
    private TextView currentLocation = null;
    private int redColor;
    private int greenColor;
    private int blueColor;
    private TextView currentRed;
    private TextView currentGreen;
    private TextView currentBlue;






    /*
    Default constructor is meant handle elements from the MainActivity class
     */

    public ListenController(SeekBar oRedBar, SeekBar oGreenBar, SeekBar oBlueBar,FlowerView oldFView,TextView newLocation,TextView nrProgress,TextView ngProgress,TextView nbProgress){
        nRedBar = oRedBar;
        nGreenBar = oGreenBar;
        nBlueBar = oBlueBar;
        fView = oldFView;
        currentLocation = newLocation;
        currentBlue = nbProgress;
        currentGreen = ngProgress;
        currentRed = nrProgress;

    }

    /*
    On touch, the x and y coordinate of the users touched
    is saved in two ints, the containsPoint method from
    each petals class is called in separate if statements
    to check if it was in the dimensions of that shape
    returns true if in fact was touched and sets the text to
    the petal touched.
     */
    @Override
    public boolean onTouch(View v, MotionEvent event){
        int xCoord = (int)event.getX();
        int yCoord = (int)event.getY();

        if(fView.getLeftPetal().containsPoint(xCoord,yCoord)){

            currentLocation.setText("Left Petal");
            return true;
        }
        else if(fView.getRightPetal().containsPoint(xCoord,yCoord)){

            currentLocation.setText("Right Petal");
            return true;
        }
        else if(fView.getBottomPetal().containsPoint(xCoord,yCoord)){

            currentLocation.setText("Bottom Petal");
            return true;
        }
        else if(fView.getCenterFlower().containsPoint(xCoord,yCoord)){

            currentLocation.setText("Center Petal");
            return true;
        }
        else if(fView.getTopPetal().containsPoint(xCoord,yCoord)){

            currentLocation.setText("Top Petal");
            return true;
        }
        else if(fView.getFlowerStem().containsPoint(xCoord,yCoord)){

            currentLocation.setText("Flower Stem");
            return true;
        }
        fView.invalidate();
        return false;
    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        /*
        If one of the seekbars changed belongs to the ID of the red,green, or blue,
        then the progress of each is fetched and set to a string to display next to
        color. If the text being displayed is x, then it calls on the setColor of that
        x.class and sets color to the progresses. A new x petal is then called and drawn
        again with invalidate.
         */
        if(seekBar == nRedBar || seekBar == nGreenBar || seekBar == nBlueBar){
            blueColor = nBlueBar.getProgress();
            greenColor = nGreenBar.getProgress();
            redColor = nRedBar.getProgress();
            String blueC = Integer.toString(blueColor);
            String greenC = Integer.toString(greenColor);
            String redC = Integer.toString(redColor);
            currentRed.setText(redC);
            currentGreen.setText(greenC);
            currentBlue.setText(blueC);

            if(currentLocation.getText() == "Left Petal"){
                fView.getLeftPetal().setLeftPetalColor(redColor,greenColor,blueColor);
                fView.getLeftPetal();
            }
            else if(currentLocation.getText() == "Right Petal"){
                fView.getRightPetal().setRightColor(redColor,greenColor,blueColor);
                fView.getRightPetal();
            }
            else if(currentLocation.getText() == "Bottom Petal"){
                fView.getBottomPetal().setBottomColor(redColor,greenColor,blueColor);
                fView.getBottomPetal();
            }
            else if(currentLocation.getText() == "Top Petal"){
                fView.getTopPetal().setTopColor(redColor,greenColor,blueColor);
                fView.getTopPetal();
            }
            else if(currentLocation.getText() == "Center Petal"){
                fView.getCenterFlower().setCenterColor(redColor,greenColor,blueColor);
                fView.getCenterFlower();
            }
            else if(currentLocation.getText() == "Flower Stem"){
                fView.getFlowerStem().setStemColor(redColor,greenColor,blueColor);
                fView.getFlowerStem();
            }
        }


        /*
        External Citation:
        Problem: Didn't know how to update the drawing
        Source:https://stackoverflow.com/questions/7596370/what-is-the-difference-between-androids-invalidate-and-postinvalidate-metho
        Solution: Looked up how to use invalidate and postinvalidate.
         */
        fView.invalidate();
        fView.postInvalidate();

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
