package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

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

    /** This Method is used for Team A Score */
    public void displayTeamAScore(int score)
    {
        TextView socreView = (TextView) findViewById(R.id.score_a_team);
        socreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore(scoreTeamA);
    }
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore(scoreTeamA);
    }
    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayTeamAScore(scoreTeamA);
    }
    /** This Method is used for Team B Score */
    public void displayTeamBScore(int score)
    {
        TextView socreView = (TextView) findViewById(R.id.score_b_team);
        socreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayTeamBScore(scoreTeamB);
    }
    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore(scoreTeamB);
    }
    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayTeamBScore(scoreTeamB);
    }

    // This method is used to Reset All Scores
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }
}