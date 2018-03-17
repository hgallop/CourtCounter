package com.example.android.courtcounter;

/**
 * Create Team class
 */

public class Team {

    //create constants for scoring
    private final static int THREE_POINTS = 3;
    private final static int TWO_POINTS = 2;
    private final static int ONE_POINT = 1;

    //create variables for object
    private String mTeamName;
    private int mScore;

    //constructor for Team object
    Team(String teamName, int score) {
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
    void setScore(int score){
        mScore = score;
    }

    //accessor. allows score to be accessed.
    int getScore(){
        return mScore;
    }

    //moethod for scoring three points
    void threePoints() {
        mScore += THREE_POINTS;
    }

    //method for scoring two points.
    void twoPoints() {
        mScore += TWO_POINTS;
    }

    //method for scoring one point.
    void onePoint() {
        mScore += ONE_POINT;
    }

}
