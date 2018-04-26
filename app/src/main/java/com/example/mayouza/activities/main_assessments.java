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


        TextView doneTxt = findViewById(R.id.done_assessments);
        TextView discoverTxt = findViewById(R.id.discover_assessments);
        TextView overAllTxt = findViewById(R.id.overAll_Report);
        TextView howToTxt = findViewById(R.id.howToDo_assessment);

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
                Intent intent = new Intent(getApplicationContext(), discover_assessments_main.class);
                startActivity(intent);
            }
        });

        overAllTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), report_assessment_main.class);
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