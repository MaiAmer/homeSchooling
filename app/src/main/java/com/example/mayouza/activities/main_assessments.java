package com.example.mayouza.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class main_assessments extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_assessments);


        final TextView doneTxt = (TextView) findViewById(R.id.done_assessments);
        TextView discoverTxt = (TextView) findViewById(R.id.discover_assessments);
        TextView overAllTxt = (TextView) findViewById(R.id.overAll_Report);
        TextView howToTxt = (TextView) findViewById(R.id.howToDo_assessment);

        doneTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), done_assessments.class);
                startActivity(intent);
            }
        });

        discoverTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), discoverAssessment.class);
                startActivity(intent);
            }
        });

        overAllTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), done_assessments.class);
                startActivity(intent);
            }
        });
        howToTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), how_to.class);
                startActivity(intent);
            }
        });
    }
}