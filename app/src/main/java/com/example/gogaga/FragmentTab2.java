package com.example.gogaga;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class FragmentTab2 extends Fragment {
    Switch aSwitch1, aSwitch2;
    CardView cardView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
    private void onClick(){
        cardView=cardView.findViewById(R.id.alerts);
        aSwitch1=aSwitch1.findViewById(R.id.sound);
        aSwitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch1.isChecked()) {
                    int greenColorValue = Color.parseColor("#00ff00");
                    cardView.setBackgroundColor(greenColorValue);
                }
            }
        });
    }
}