package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class current_skills extends AppCompatActivity {

    TextView currentSkilltitle;
    TextView donetitle;
    TextView remaintitle;
    TextView remaining;
    TextView done;
    CardView currentSkillCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_skills);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        currentSkilltitle = findViewById(R.id.currentSkillName);
        donetitle = findViewById(R.id.doneLessons);
        remaintitle = findViewById(R.id.remainingTitle);
        remaining = findViewById(R.id.numOfRemainingLessons);
        done = findViewById(R.id.numOfDoneLessons);
        currentSkillCard = findViewById(R.id.cardCurrentSkill);


        donetitle.setText("Done Lessons :");
        remaintitle.setText("Remaining Lessons :");
        currentSkillCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_lessons.class);
                startActivity(i);
            }
        });

    }
}