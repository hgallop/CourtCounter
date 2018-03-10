package com.example.android.courtcounter;

import android.view.Display;
import android.view.View;
import android.widget.TextView;

/**
 * Created by doyou on 2/10/2018.
 */

public class Team {

    //create constants for scoring
    private final int THREE_POINTS = 3;
    private final int TWO_POINTS = 2;
    private final int ONE_POINT = 1;

    //create variables for object
    private String mTeamName;
    private int mScore;

    //constructor for Team object
    public Team(String teamName, int score) {
        mTeamName = teamName;
        mScore = score;
    }

    //mutator. allows name to be set.
    public void setName(String name){
        mTeamName = name;
    }

    //accessor. allows name to be accessed
    public String getName(){
        return mTeamName;
    }

    //mutator. allows score to be set.
    public void setScore(int score){
        mScore = score;
    }

    //accessor. allows score to be accessed.
    public int getScore(){
        return mScore;
    }

    //moethod for scoring three points
    public void threePoints() {
        mScore += THREE_POINTS;
    }

    //method for scoring two points.
    public void twoPoints() {
        mScore += TWO_POINTS;
    }

    //method for scoring one point.
    public void onePoint() {
        mScore += ONE_POINT;
    }

}
