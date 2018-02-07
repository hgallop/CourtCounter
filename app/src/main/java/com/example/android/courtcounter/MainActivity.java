package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreAdd;

    TextView scoreA;
    TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = findViewById(R.id.team_a_score);
        scoreB = findViewById(R.id.team_b_score);
    }

    /** Saves app data between states */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("scoreAdd", scoreAdd);
    }

    /** Restores app data on new state */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        scoreAdd = savedInstanceState.getInt("scoreAdd");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets both scores to 0
     */
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
        scoreA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreB.setText(String.valueOf(score));
    }

    /**
     * Calculates update for three point score. Displays updated score.
     */
    public void threePointsA(View view) {
        scoreAdd = 3;
        scoreTeamA += scoreAdd;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsB(View view) {
        scoreAdd = 3;
        scoreTeamB += scoreAdd;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Calculates update for two point score. Displays updated score.
     */
    public void twoPointsA(View view) {
        scoreAdd = 2;
        scoreTeamA += scoreAdd;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsB(View view) {
        scoreAdd = 2;
        scoreTeamB += scoreAdd;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Calculates update for one point score. Displays updated score.
     */
    public void onePointA(View view) {
        scoreAdd = 1;
        scoreTeamA += scoreAdd;
        displayForTeamA(scoreTeamA);
    }

    public void onePointB(View view) {
        scoreAdd = 1;
        scoreTeamB += scoreAdd;
        displayForTeamB(scoreTeamB);
    }
}
