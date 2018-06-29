package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_lessons extends AppCompatActivity {

    CardView lesson1card;
    TextView lesssontitle1;

    CardView lesson2card;
    TextView lesssontitle2;

    CardView lesson3card;
    TextView lesssontitle3;

    Button lessonsBtn;
    Button refrencesBtn;
    Button aboutSkillsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lessons);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lesson1card = findViewById(R.id.lesson1Card);
        lesssontitle1 = findViewById(R.id.lessonTitle1);


        lesson2card = findViewById(R.id.lesson2Card);
        lesssontitle2 = findViewById(R.id.lessonTitle2);


        lesson3card = findViewById(R.id.lesson3Card);
        lesssontitle3 = findViewById(R.id.lessonTitle3);

        lesssontitle1.setText("lesson 1");
        lesssontitle2.setText("lesson 2");
        lesssontitle3.setText("lesson 3");

        lessonsBtn = findViewById(R.id.lessonsbtn);
        refrencesBtn = findViewById(R.id.refrencebtn);
        aboutSkillsBtn = findViewById(R.id.aboutBTN);

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
        lesson1card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_lesson1.class);
                startActivity(i);
            }
        });

        lesson2card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_lesson1.class);
                startActivity(i);
            }
        });
        lesson3card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_lesson1.class);
                startActivity(i);
            }
        });

    }
}
