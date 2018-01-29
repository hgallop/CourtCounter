package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Calculates update for three point score. Displays updated score.
     */
    public void threePointsA(View view) {
        int score = 3;
        scoreTeamA = scoreTeamA + score;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsB(View view) {
        int score = 3;
        scoreTeamB = scoreTeamB + score;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Calculates update for two point score. Displays updated score.
     */
    public void twoPointsA(View view) {
        int score = 2;
        scoreTeamA = scoreTeamA + score;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsB(View view) {
        int score = 2;
        scoreTeamB = scoreTeamB + score;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Calculates update for one point score. Displays updated score.
     */
    public void onePointA(View view) {
        int score = 1;
        scoreTeamA = scoreTeamA + score;
        displayForTeamA(scoreTeamA);
    }

    public void onePointB(View view) {
        int score = 1;
        scoreTeamB = scoreTeamB + score;
        displayForTeamB(scoreTeamB);
    }
}
