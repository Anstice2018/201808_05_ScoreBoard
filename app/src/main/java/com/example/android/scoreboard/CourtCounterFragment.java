package com.example.android.scoreboard;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment
            implements View.OnClickListener{    //實現外包商介面

    private TextView m_tv_TeamName;
    private TextView m_tv_TeamScore;
    private Button m_btn_3Points;
    private Button m_btn_2Points;
    private Button m_btn_FreeThrow;

    private int mScore;


    //getter
    //MainActivity 無法存取 計分板片段的私有成員，片段須提供 getter
    public TextView get_score(){
        return m_tv_TeamScore;
    }


    public CourtCounterFragment() {
        // Required empty public constructor (無參數建構子是必須的，不可刪除）
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment (產生 Fragment 回傳給 Activity)
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }

    @Override
    public void onStart(){  //Fragment 畫面建立後執行
        super.onStart();

        m_tv_TeamName = getView().findViewById(R.id.tv_TeamName);
        m_tv_TeamScore = getView().findViewById(R.id.tv_TeamScore);
        m_btn_3Points = getView().findViewById(R.id.btn_3Points);
        m_btn_2Points = getView().findViewById(R.id.btn_2Points);
        m_btn_FreeThrow = getView().findViewById(R.id.btn_FreeThrow);

        //View.OnClickListener 外包商; 由片段來實現
        m_btn_3Points.setOnClickListener(this);
        m_btn_2Points.setOnClickListener(this);
        m_btn_FreeThrow.setOnClickListener(this);
    }

    @Override
    public void onClick (View view){
        //      String scorestr = m_tv_TeamScore.getText().toString();
        //     int scoreint = Integer.parseInt(scorestr);
        //     m_tv_TeamScore.setText(String.valueOf(scoreint+3));

        switch (view.getId()){
            case R.id.btn_3Points:
                mScore += 3;
                break;
            case R.id.btn_2Points:
                mScore +=2;
                break;
            case R.id.btn_FreeThrow:
                mScore += 1;
                break;
        }
        m_tv_TeamScore.setText(String.valueOf(mScore));

    }

}
