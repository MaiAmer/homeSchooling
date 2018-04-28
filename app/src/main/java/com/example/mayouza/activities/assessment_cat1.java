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
    TextView detailedDesc;
    TextView txtAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assessment_cat1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         startBtn = findViewById(R.id.startAssessment);

         txtAbout =  findViewById(R.id.aboutAssessment);
         txtAbout.setText(getResources().getString(R.string.about_assessment));


            String title = getIntent().getStringExtra("title");
            getSupportActionBar().setTitle(title);

            img = findViewById(R.id.firstAssesImg);
            int image = getIntent().getIntExtra("img" ,0);
            img.setImageResource(image);

            detailedDesc=findViewById(R.id.txtAboutAssessment);
            if(title.contentEquals(" assessment category 1"))
            detailedDesc.setText("this is detailed desc of cat 1 ");

            if(title.contentEquals(" assessment category 2"))
            detailedDesc.setText("this is detailed desc of cat 2 ");

            if(title.contentEquals(" assessment category 3"))
            detailedDesc.setText("this is detailed desc of cat 3");

            //TODo: add onClick listeners for buttons to open different quizzes

   /*        Integer buttonValue = getIntent().getIntExtra("buttons",0);
           if(buttonValue==1)
           {
            Intent intent = new Intent(getApplicationContext(),assessment_quiz1);
           }
*/
    }

}
