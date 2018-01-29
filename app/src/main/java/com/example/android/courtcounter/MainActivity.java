package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePoints(View view) {
        int score = 3;
        displayForTeamA(score);
    }

    public void twoPoints(View view) {
        int score = 2;
        displayForTeamA(score);
    }

    public void onePoint(View view) {
        int score = 1;
        displayForTeamA(score);
    }
}
