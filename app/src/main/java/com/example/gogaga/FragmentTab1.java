package com.example.gogaga;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class FragmentTab1 extends Fragment {
    CircleAlarmTimerView circleAlarmTimerView;
    Button b1,b2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
    private void initView() {
        b1=b1.findViewById(R.id.men);
        b2=b2.findViewById(R.id.women);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        circleAlarmTimerView = circleAlarmTimerView.findViewById(R.id.circletimerview);
        circleAlarmTimerView.setOnTimeChangedListener(new CircleAlarmTimerView.OnTimeChangedListener() {

            @Override
            public void start(String starting) {


            }

            @Override
            public void end(String ending) {
            }
        });
    }

}