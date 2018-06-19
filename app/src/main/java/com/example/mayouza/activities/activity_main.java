package com.example.mayouza.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView discoverSkills = findViewById(R.id.done_assessments);
        TextView currentSkills = findViewById(R.id.discover_assessments);
        TextView assessments = findViewById(R.id.overAll_Report);
        TextView about = findViewById(R.id.howToDo_assessment);

        discoverSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), done_assessments.class);
                startActivity(intent);
            }
        });

        currentSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), discover_assessments_main.class);
                startActivity(intent);
            }
        });

        assessments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), main_assessments.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), how_to.class);
                startActivity(intent);
            }
        });
    }
}
