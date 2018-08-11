package com.example.android.practiseset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForA(View view){
        scoreA+=3;
        scoreDisplay();
    }
    public void addThreeForB(View view){
        scoreB+=3;
        scoreDisplay();
    }
    public void addTwoForA(View view){
        scoreA+=2;
        scoreDisplay();
    }
    public void addTwoForB(View view){
        scoreB+=2;
        scoreDisplay();
    }
    public void freeThrowForA(View view){
        scoreA+=1;
        scoreDisplay();
    }
    public void freeThrowForB(View view){
        scoreB+=1;
        scoreDisplay();
    }
    public void scoreDisplay(){
        TextView scoreTextA=(TextView)findViewById(R.id.team_a_score);
        scoreTextA.setText(""+scoreA);
        TextView scoreTextB=(TextView)findViewById(R.id.team_b_score);
        scoreTextB.setText(""+scoreB);
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        scoreDisplay();
    }
}
