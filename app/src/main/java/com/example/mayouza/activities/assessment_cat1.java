package com.example.mayouza.activities;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class assessment_cat1 extends AppCompatActivity {

    Button startBtn;
    ImageView img;
    TextView expandableTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assessment_cat1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        img = (ImageView)  findViewById(R.id.firstAssesImg);
        img.setImageResource(R.drawable.image);

        expandableTxt = (TextView) findViewById(R.id.txtAboutAssessment);
        expandableTxt.setText(getResources().getString(R.string.text_about_Assessment));

         startBtn = (Button)findViewById(R.id.startAssessment);
        /* startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), start_assessment_cat1.class);
                startActivity(intent);
            }
        }); */
    }


}
