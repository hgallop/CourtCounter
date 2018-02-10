package com.example.android.courtcounter;

import android.view.Display;
import android.view.View;
import android.widget.TextView;

/**
 * Created by doyou on 2/10/2018.
 */

public class Team {
    private String Name;
    private int Score;

    private TextView DisplayName;
    private TextView DisplayScore;

    public Team(String name, int score, TextView displayName, TextView displayScore) {
        Name = name;
        Score = score;
        DisplayName = displayName;
        DisplayScore = displayScore;
    }

    //mutator
    public void setName(String name){
        Name = name;
    }

    //accessor
    public String getName(){
        return Name;
    }

    public void setScore(int score){
        Score = score;
    }

    public int getScore(){
        return Score;
    }

    public void setDisplayName(TextView view){
        DisplayName = view;
    }

    public TextView getDisplayName(){
        return DisplayName;
    }

    public void setDisplayScore(TextView view){
        DisplayScore = view;
    }

    public TextView getDisplayScore(TextView view){
        return DisplayScore;
    }

    public void scoreDisplay(int score) {
        DisplayScore.setText(String.valueOf(score));
    }

    public void nameDisplay(String name){
        DisplayName.setText(name);
    }

    public void threePoints(View view) {
        Score += 3;
        scoreDisplay(Score);
    }

    public void twoPoints(View view) {
        Score += 2;
        scoreDisplay(Score);
    }

    public void onePoint(View view) {
        Score += 1;
        scoreDisplay(Score);
    }

}
