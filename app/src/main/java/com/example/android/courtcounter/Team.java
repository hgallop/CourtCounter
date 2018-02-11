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
    private String teamName;
    private int score;

    //constructor for Team object
    public Team(String teamName, int score) {
        this.teamName = teamName;
        this.score = score;
    }

    //mutator. allows name to be set.
    public void setName(String name){
        teamName = name;
    }

    //accessor. allows name to be accessed
    public String getName(){
        return teamName;
    }

    //mutator. allows score to be set.
    public void setScore(int score){
        this.score = score;
    }

    //accessor. allows score to be accessed.
    public int getScore(){
        return score;
    }

    //moethod for scoring three points
    public void threePoints() {
        score += THREE_POINTS;
    }

    //method for scoring two points.
    public void twoPoints() {
        score += TWO_POINTS;
    }

    //method for scoring one point.
    public void onePoint() {
        score += ONE_POINT;
    }

}
