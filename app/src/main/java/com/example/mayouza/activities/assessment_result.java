package com.example.mayouza.activities;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

public class assessment_result extends AppCompatActivity {
    Boolean expand = false;
    ImageView expandIcon;
    TextView congrats_text;
    TextView skill_1;
    TextView skill_2;
    TextView skill_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assessment_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.getSupportActionBar().setHomeButtonEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Assessment Result");
        congrats_text = (TextView)findViewById(R.id.congrats_text);
        congrats_text.setText(String.valueOf(R.string.congrats_text));
        expandIcon =(ImageView)findViewById(R.id.congrats_expand);

        congrats_text.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if(expand) {
                    expand = false;
                    if (congrats_text.getLineCount() > 4) {
                        expandIcon.setVisibility(View.VISIBLE);
                        ObjectAnimator animation = ObjectAnimator.ofInt(congrats_text, "maxLines", 4);
                        animation.setDuration(0).start();
                    }
                }
            }
        });
        congrats_text.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                expand = true;
                ObjectAnimator animator = ObjectAnimator.ofInt(congrats_text, "maxLines", 20);
                animator.setDuration(100).start();
                congrats_text.setVisibility(View.VISIBLE);
                expandIcon.setImageResource(R.drawable.ic_expand_less);
            }
        });

         skill_1 = (TextView)findViewById(R.id.skill_1);
         skill_1.setText(String.valueOf(R.string.skill_1));

         skill_2 = (TextView)findViewById(R.id.skill_2);
         skill_2.setText(String.valueOf(R.string.skill_2));

         skill_3 = (TextView)findViewById(R.id.skill_3);
         skill_3.setText(String.valueOf(R.string.skill_3));


      /*  skill_1.setPaintFlags(skill_1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        skill_2.setPaintFlags(skill_2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        skill_3.setPaintFlags(skill_3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);*/

       /* skill_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_skill_1 = new Intent(getApplicationContext(), skill_1.class);
                startActivity(intent_skill_1);
            }
        });
        skill_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_skill_1 = new Intent(getApplicationContext(), skill_2.class);
                startActivity(intent_skill_1);
            }
        });
        skill_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_skill_1 = new Intent(getApplicationContext(), skill_3.class);
                startActivity(intent_skill_1);
            }
        });
        */
    }

}
