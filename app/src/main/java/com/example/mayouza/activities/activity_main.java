package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView discoverSkills = findViewById(R.id.main_discover_skills);
        TextView currentSkills = findViewById(R.id.main_current_skills);
        TextView assessments = findViewById(R.id.main_assessments);
        TextView about = findViewById(R.id.main_about_app);

        discoverSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_discover_skills.class);
                startActivity(intent);
            }
        });

        currentSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), current_skills.class);
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
                Intent intent = new Intent(getApplicationContext(), activity_about_app.class);
                startActivity(intent);
            }
        });
    }
}
