package com.example.android.courtcounter;

import android.view.Display;
import android.view.View;
import android.widget.TextView;

/**
 * Created by doyou on 2/10/2018.
 */

public class Team {

    private final int THREE_POINTS = 3;
    private final int TWO_POINTS = 2;
    private final int ONE_POINT = 1;

    private String teamName;
    private int score;

    public TextView nameView;
    public TextView scoreView;

    public Team(String teamName, int score, TextView nameView, TextView scoreView) {
        this.teamName = teamName;
        this.score = score;
        this.nameView= nameView;
        this.scoreView = scoreView;
    }

    //mutator
    public void setName(String name){
        teamName = name;
    }

    //accessor
    public String getName(){
        return teamName;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public void scoreDisplay(int score) {
        scoreView.setText(String.valueOf(score));
    }

    public void nameDisplay(String name){
        nameView.setText(name);
    }

    public void threePoints(View view) {
        score += THREE_POINTS;
        scoreDisplay(score);
    }

    public void twoPoints(View view) {
        score += TWO_POINTS;
        scoreDisplay(score);
    }

    public void onePoint(View view) {
        score += ONE_POINT;
        scoreDisplay(score);
    }

}
