package com.example.android.scoreboard;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment {

    private TextView name;
    private TextView score;


    //getter
    //MainActivity 無法存取 計分板片段的私有成員，片段須提供 getter
    public TextView get_score(){
        return score;
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

        name = getView().findViewById(R.id.tv_TeamName);
        score = getView().findViewById(R.id.tv_TeamScore);
    }


}
