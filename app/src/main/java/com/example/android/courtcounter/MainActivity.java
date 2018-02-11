package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String SCORE_TEAM_A = "scoreTeamA";
    public final String SCORE_TEAM_B = "scoreTeamB";
    public final String NAME_A = "nameA";
    public final String Name_B = "nameB";

    TextView scoreA;
    TextView scoreB;
    TextView aTeam;
    TextView bTeam;

    Team teamA;
    Team teamB;

    String nameA;
    String nameB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = findViewById(R.id.team_a_score);
        scoreB = findViewById(R.id.team_b_score);
        aTeam = findViewById(R.id.a_team);
        bTeam = findViewById(R.id.b_team);

        nameA = getResources().getString(R.string.teama);
        nameB = getResources().getString(R.string.teamb);

        teamA = new Team(nameA, 0, aTeam, scoreA);
        teamB = new Team(nameB, 0, bTeam, scoreB);

        teamA.nameDisplay(teamA.getName());
        teamB.nameDisplay(teamB.getName());
        teamA.scoreDisplay(teamA.getScore());
        teamB.scoreDisplay(teamB.getScore());
    }

    /** Saves app data between states */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_TEAM_A, teamA.getScore());
        outState.putInt(SCORE_TEAM_B, teamB.getScore());
        outState.putString(NAME_A, teamA.getName());
        outState.putString(Name_B, teamB.getName());
    }

    /** Restores app data on new state */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        teamA.setScore(savedInstanceState.getInt(SCORE_TEAM_A));
        teamB.setScore(savedInstanceState.getInt(SCORE_TEAM_B));
        teamA.setName(savedInstanceState.getString(NAME_A));
        teamB.setName(savedInstanceState.getString(Name_B));
    }

    /**
     * Resets both scores to 0
     */
    public void resetAll(View view) {
        int restart = 0;
        teamA.setScore(restart);
        teamB.setScore(restart);
        teamA.scoreDisplay(teamA.getScore());
        teamB.scoreDisplay(teamB.getScore());
    }

    /**
     * Calculates update for three point score. Displays updated score.
     */
    public void threePointsA(View view) { teamA.threePoints(view);
    }

    public void threePointsB(View view) {
        teamB.threePoints(view);
    }


    /**
     * Calculates update for two point score. Displays updated score.
     */
    public void twoPointsA(View view) {
        teamA.twoPoints(view);
    }

    public void twoPointsB(View view) {
        teamB.twoPoints(view);
    }


    /**
     * Calculates update for one point score. Displays updated score.
     */
    public void onePointA(View view) {
        teamA.onePoint(view);
    }

    public void onePointB(View view) {
        teamB.onePoint(view);
    }
}
