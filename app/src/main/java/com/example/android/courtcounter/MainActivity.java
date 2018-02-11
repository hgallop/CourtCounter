package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //creates keys for save and restore state methods.
    static private final String SCORE_TEAM_A = "scoreTeamA";
    static private final String SCORE_TEAM_B = "scoreTeamB";
    static private final String NAME_A = "nameA";
    static private final String Name_B = "nameB";

    //creates variables for views
    TextView scoreAView;
    TextView scoreBView;
    TextView aTeamNameView;
    TextView bTeamNameView;

    //creates variable for objects
    Team teamA;
    Team teamB;

    //creates variables for team names
    String teamAName;
    String teamBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes all views in one call
        scoreAView = findViewById(R.id.team_a_score);
        scoreBView = findViewById(R.id.team_b_score);
        aTeamNameView = findViewById(R.id.a_team);
        bTeamNameView = findViewById(R.id.b_team);

        //gets string resource for names. initializes name variables.
        teamAName = getResources().getString(R.string.teama);
        teamBName = getResources().getString(R.string.teamb);

        //creates Team objects.
        teamA = new Team(teamAName, 0);
        teamB = new Team(teamBName, 0);

        //diplays initial values
        nameDisplayA(teamA.getName());
        nameDisplayb(teamB.getName());
        scoreDisplayA(teamA.getScore());
        scoreDisplayB(teamB.getScore());
    }

    /** Saves app data on screen rotation*/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_TEAM_A, teamA.getScore());
        outState.putInt(SCORE_TEAM_B, teamB.getScore());
        outState.putString(NAME_A, teamA.getName());
        outState.putString(Name_B, teamB.getName());
    }

    /** Restores app data on screen rotation */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        teamA.setScore(savedInstanceState.getInt(SCORE_TEAM_A));
        teamB.setScore(savedInstanceState.getInt(SCORE_TEAM_B));
        teamA.setName(savedInstanceState.getString(NAME_A));
        teamB.setName(savedInstanceState.getString(Name_B));
    }

    //displays score for team a
    public void scoreDisplayA(int score) {
        scoreAView.setText(String.valueOf(score));
    }

    //displays score for team b
    public void scoreDisplayB(int score) {
        scoreBView.setText(String.valueOf(score));
    }

    //displays name for team a
    public void nameDisplayA(String name){
        aTeamNameView.setText(name);
    }

    //displays name for team b
    public void nameDisplayb(String name){
        bTeamNameView.setText(name);
    }

    /**
     * Resets both scores to 0
     */
    public void resetAll(View view) {
        int restart = 0;
        teamA.setScore(restart);
        teamB.setScore(restart);
        scoreDisplayA(teamA.getScore());
        scoreDisplayB(teamB.getScore());
    }

    /**
     * Calculates update for three point score. Displays updated score.
     */
    public void threePointsA(View view) {
        teamA.threePoints();
        scoreDisplayA(teamA.getScore());
    }

    public void threePointsB(View view) {
        teamB.threePoints();
        scoreDisplayB(teamB.getScore());
    }


    /**
     * Calculates update for two point score. Displays updated score.
     */
    public void twoPointsA(View view) {
        teamA.twoPoints();
        scoreDisplayA(teamA.getScore());
    }

    public void twoPointsB(View view) {
        teamB.twoPoints();
        scoreDisplayB(teamB.getScore());
    }


    /**
     * Calculates update for one point score. Displays updated score.
     */
    public void onePointA(View view) {
        teamA.onePoint();
        scoreDisplayA(teamA.getScore());
    }

    public void onePointB(View view) {
        teamB.onePoint();
        scoreDisplayB(teamB.getScore());
    }
}
