package com.example.android.scoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA;
    private int scoreB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
    public void click3Points (View view){
        LinearLayout ll = (LinearLayout)view.getParent();
        TextView score = ll.findViewById(R.id.tv_TeamScore);
        scoreA += 3;
        score.setText(String.valueOf(scoreA));
    }
    public void click2PointsA (View view){
        LinearLayout ll = (LinearLayout)view.getParent();
        TextView score = ll.findViewById(R.id.tv_TeamScore);
        scoreA += 2;
        score.setText(String.valueOf(scoreA));
    }
    public void clickFreeA (View view){
        LinearLayout ll = (LinearLayout)view.getParent();
        TextView score = ll.findViewById(R.id.tv_TeamScore);
        scoreA += 1;
        score.setText(String.valueOf(scoreA));
    }
    **/

    /**
    public void click3Points(View view){
        CourtCounterFragment a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.frag_TeamA);
        // MainActivity 透過片段getter 取得 私有TextView
        TextView score = a.get_score();
        scoreA += 3;
        score.setText(String.valueOf(scoreA));

    }

    public void click2Points(View view){
        CourtCounterFragment a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.frag_TeamA);
        TextView score = a.get_score();
        scoreA += 2;
        score.setText(String.valueOf(scoreA));
    }

    public void clickFree(View view){
        CourtCounterFragment a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.frag_TeamA);
        TextView score = a.get_score();
        scoreA += 1;
        score.setText(String.valueOf(scoreA));
    }
    **/

}
