package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_about_skill extends AppCompatActivity {
    TextView intoForSKill;
    TextView textaboutskill;
    TextView reqtitle;
    TextView ReqForSkill;
    TextView textDifficulties;
    TextView diffTitle;

    Button lessonsBtn;
    Button refrencesBtn;
    Button aboutSkillsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_skill);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lessonsBtn = findViewById(R.id.lessonsbtn);
        refrencesBtn = findViewById(R.id.refrencebtn);
        aboutSkillsBtn = findViewById(R.id.aboutBTN);
        intoForSKill = findViewById(R.id.intoForSKill);
        textaboutskill = findViewById(R.id.textaboutskill);
        reqtitle = findViewById(R.id.reqtitle);
        ReqForSkill = findViewById(R.id.ReqForSkill);
        textDifficulties = findViewById(R.id.textDifficulties);
        diffTitle = findViewById(R.id.diffTitle);

        intoForSKill.setText("Introduction About this skill");
        reqtitle.setText("Requirements for this skill");
        diffTitle.setText("Difficulties in this skill");

        textaboutskill.setText("here we have intro about this skill");
        ReqForSkill.setText("here we have write requirements");
        textDifficulties.setText("here we have write difficulties");

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

    }
}
