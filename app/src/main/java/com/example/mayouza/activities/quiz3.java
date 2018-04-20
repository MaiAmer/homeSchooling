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


public class quiz3 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quiz1_cat1, container, false);
        TextView Qtitle = v.findViewById(R.id.section_label);
        Qtitle.setText(getResources().getString(R.string.assessment_Q));

        TextView q1_header = v.findViewById(R.id.q1_header);
        q1_header.setText(getResources().getString(R.string.q1_header));

        RadioGroup group = v.findViewById(R.id.answers_group);
        RadioButton r1 = v.findViewById(R.id.answer1);
        r1.setText(getResources().getString(R.string.q1_header));
        RadioButton r2 = v.findViewById(R.id.answer2);
        r2.setText(getResources().getString(R.string.q1_header));
        RadioButton r3 = v.findViewById(R.id.answer3);
        r3.setText(getResources().getString(R.string.q1_header));

        Button prev = v.findViewById(R.id.previous);
        Button next = v.findViewById(R.id.submit_answer);


        return v;
    }


}