package com.example.mayouza.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class done_assessments extends AppCompatActivity {
    CardView doneCard;
    private ProgressBar progressBar;
    private TextView doneTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done_assessments);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.getSupportActionBar().setTitle("Done Assessments");

        doneCard = (CardView) findViewById(R.id.done_card);
        doneCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(done_assessments.this, assessment_result.class);
                startActivity(intent);
            }
        });

        doneTxt = (TextView) findViewById(R.id.done_Text);
    }

    private void doneAssesProgress(View view) {
        progressBar = (ProgressBar) findViewById(R.id.done_progBar);
        int maxValue = progressBar.getMax();
        int progressValue = progressBar.getProgress();
        progressBar.isShown();
    }

}
