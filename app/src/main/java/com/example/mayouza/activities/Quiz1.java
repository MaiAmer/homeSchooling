package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class Quiz1 extends AppCompatActivity {

    int currentCount = 1, totalCount = 3;

    TextView quizTitle;
    TextView quizCounter;
    TextView totalNum;
    TextView sign;
    Button nextBtn;
    Button prevBtn;
    RadioButton choice1;
    RadioButton choice2;
    RadioButton choice3;

    String[] quizTitles = new String[]{"title 1", "title 2", "title 3"};
    String[] radiogroup1 = {"choice 1", "choice 2", "choice 3",};
    String[] radiogroup2 = {"choice 1", "choice 2", "choice 3",};
    String[] radiogroup3 = {"choice 1", "choice 2", "choice 3",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        quizTitle = findViewById(R.id.quizTitle);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        quizCounter = findViewById(R.id.quizCounter);
        totalNum = findViewById(R.id.totalQuizNum);
        nextBtn = findViewById(R.id.nextBtn);
        prevBtn = findViewById(R.id.prevBtn);
        sign = findViewById(R.id.sign);

        sign.setText("/");
        quizTitle.setText(quizTitles[0]);
        choice1.setText(radiogroup1[0]);
        choice2.setText(radiogroup1[1]);
        choice3.setText(radiogroup1[2]);
        quizCounter.setText(valueOf(currentCount));
        totalNum.setText(valueOf(totalCount));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount++;
                counterMethod(currentCount);
                if (currentCount > quizTitles.length) {
                    Toast toast = Toast.makeText(getApplicationContext(), "you have finished this assessment"
                            , Toast.LENGTH_SHORT);
                    toast.show();
                    quizCounter.setText(valueOf(quizTitles.length));
                }
            }

        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount--;
                counterMethod(currentCount);
                if (currentCount < quizTitles.length) {
                    Toast toast = Toast.makeText(getApplicationContext(), "this is the first quiz in the assessment"
                            , Toast.LENGTH_SHORT);
                    toast.show();
                    quizCounter.setText("1");
                }
            }
        });
    }

    void counterMethod(int currentCount) {
        if (currentCount == 1) {
            quizTitle.setText(quizTitles[0]);
            choice1.setText(radiogroup1[0]);
            choice2.setText(radiogroup1[1]);
            choice3.setText(radiogroup1[2]);
            quizCounter.setText(valueOf(currentCount));
        }
        if (currentCount == 2) {
            quizTitle.setText(quizTitles[1]);
            choice1.setText(radiogroup2[0]);
            choice2.setText(radiogroup2[1]);
            choice3.setText(radiogroup2[2]);
            quizCounter.setText(valueOf(currentCount));
        }
        if (currentCount == 3) {
            quizTitle.setText(quizTitles[2]);
            choice1.setText(radiogroup3[0]);
            choice2.setText(radiogroup3[1]);
            choice3.setText(radiogroup3[2]);
        }
        quizCounter.setText(valueOf(currentCount));
    }
}

