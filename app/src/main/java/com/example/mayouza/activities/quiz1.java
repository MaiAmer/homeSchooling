package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class quiz1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quiz1_cat1, container, false);
        TextView Qtitle = (TextView) v.findViewById(R.id.section_label);
        Qtitle.setText(getResources().getString(R.string.assessment_Q));

        TextView q1_header = (TextView) v.findViewById(R.id.q1_header);
        q1_header.setText(getResources().getString(R.string.q1_header));

        RadioGroup group = (RadioGroup)v.findViewById(R.id.answers_group);
        RadioButton r1 = (RadioButton)v.findViewById(R.id.answer1);
        r1.setText("here is answer 1");
        RadioButton r2 = (RadioButton)v.findViewById(R.id.answer2);
        r2.setText("here is answer 2");
        RadioButton r3 = (RadioButton)v.findViewById(R.id.answer3);
        r3.setText("here is answer 3");

        Button prev = (Button)v.findViewById(R.id.previous);
        Button next = (Button)v.findViewById(R.id.submit_answer);


        return v;
    }


}