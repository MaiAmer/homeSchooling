package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class how_to extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        TextView textIntro = findViewById(R.id.intro_text);
        textIntro.setText(R.string.intro_text);

        TextView textFacts = findViewById(R.id.facts_text);
        textFacts.setText(R.string.facts_text);

    }
}
