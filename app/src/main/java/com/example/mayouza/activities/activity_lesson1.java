package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class activity_lesson1 extends AppCompatActivity {

    int currentCount = 1, totalCount = 3;

    TextView lessonTitle;
    TextView lessonText;
    TextView lessonCounter;
    TextView totalNum;
    TextView sign;
    Button nextLessonBtn;
    Button prevLessonBtn;

    String[] lessonTitles = new String[]{"title 1", "title 2", "title 3"};
    String[] lessons = new String[]{"lesson 1", "lesson2", "lesson3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lessonTitle = findViewById(R.id.lessonTitle);
        lessonText = findViewById(R.id.lessonTxt);
        lessonCounter = findViewById(R.id.lessonCounter);
        totalNum = findViewById(R.id.totalLessonNum);
        nextLessonBtn = findViewById(R.id.nextLessonBtn);
        prevLessonBtn = findViewById(R.id.prevLessonBtn);
        sign = findViewById(R.id.lessonSign);

        sign.setText("/");
        lessonTitle.setText(lessonTitles[0]);
        lessonText.setText(lessons[0]);
        lessonCounter.setText(valueOf(currentCount));
        totalNum.setText(valueOf(totalCount));

        nextLessonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount++;
                counterMethod(currentCount);
                if (currentCount > lessonTitles.length) {
                    Toast toast = Toast.makeText(getApplicationContext(), "you have finished this lesson"
                            , Toast.LENGTH_SHORT);
                    toast.show();
                    lessonCounter.setText(valueOf(lessonTitles.length));

                }
            }

        });

        prevLessonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount--;
                counterMethod(currentCount);
                if (currentCount < lessonTitles.length) {
                    Toast toast = Toast.makeText(getApplicationContext(), "this is the first lesson "
                            , Toast.LENGTH_SHORT);
                    toast.show();
                    lessonCounter.setText("1");
                }
            }
        });
    }

    void counterMethod(int currentCount) {
        if (currentCount == 1) {
            lessonTitle.setText(lessonTitles[0]);
            lessonText.setText(lessons[0]);
            lessonCounter.setText(valueOf(currentCount));
        }
        if (currentCount == 2) {
            lessonTitle.setText(lessonTitles[1]);
            lessonText.setText(lessons[1]);
            lessonCounter.setText(valueOf(currentCount));
        }
        if (currentCount == 3) {
            lessonText.setText(lessons[2]);
            lessonTitle.setText(lessonTitles[2]);

        }
        lessonCounter.setText(valueOf(currentCount));
    }
}

