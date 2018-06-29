package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_refrences extends AppCompatActivity {
    Button lessonsBtn;
    Button refrencesBtn;
    Button aboutSkillsBtn;
    CardView refrenceCard;
    CardView coursesCard;
    TextView refrenceTitle;
    TextView coursesTitle;
    TextView refrences;
    TextView courses;
    String refrencesOfSkill;
    String refrenceCourses;
    //  String[] refrencesList = new String[]{"refrence 1" , "refrence 2" , "refrence 3"};
    // String[] coursessList = new String[]{"course 1" , "course 2" , "course 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrences);
        // use a linear layout manager
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.getSupportActionBar().setTitle("Refrences");

        lessonsBtn = findViewById(R.id.lessonsbtn);
        refrencesBtn = findViewById(R.id.refrencebtn);
        aboutSkillsBtn = findViewById(R.id.aboutBTN);
        coursesCard = findViewById(R.id.courseCard);
        refrenceCard = findViewById(R.id.refrenceCard);
        refrenceTitle = findViewById(R.id.refTitle);
        coursesTitle = findViewById(R.id.courseTitle);
        courses = findViewById(R.id.courses);
        refrences = findViewById(R.id.refrencesTxt);

        lessonsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_lessons.class);
                startActivity(i);
            }
        });
        refrencesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_refrences.class);
                startActivity(i);
            }
        });
        aboutSkillsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_about_skill.class);
                startActivity(i);
            }
        });
        courses.setText(refrenceCourses);
        refrences.setText(refrencesOfSkill);


    }
}
