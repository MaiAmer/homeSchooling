package com.example.mayouza.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class activity_lessons extends AppCompatActivity {

    RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<lessons_data> thedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.recycler_discover_skills);
        // use a linear layout manager

        recyclerView = findViewById(R.id.recyclerLessons);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        thedata = lessons_data.getSampleArrayList();
        // specify an adapter
        mAdapter = new lessonsAdapter(thedata);
        recyclerView.setAdapter(new lessonsAdapter(thedata));

    }
}
