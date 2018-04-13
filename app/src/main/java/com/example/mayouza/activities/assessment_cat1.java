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
    ImageView expandBtn;
    Boolean expand = false;
    TextView expandableTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assessment_cat1);

       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        getSupportActionBar().setHomeButtonEnabled(true);
*/
        expandableTxt = (TextView) findViewById(R.id.txtAboutAssessment);
        expandBtn=(ImageView)findViewById(R.id.expand_about_Assessment) ;
      /*  expandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    expand = true;
                    ObjectAnimator animator = ObjectAnimator.ofInt(expandableTxt, "maxLines", 20);
                    animator.setDuration(100).start();
                    expandableTxt.setVisibility(View.VISIBLE);
                    expandBtn.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_expand_more_black_24dp, null));
            }

        });
         startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), start_assessment_cat1.class);
                startActivity(intent);
            }
        }); */
    }


}
