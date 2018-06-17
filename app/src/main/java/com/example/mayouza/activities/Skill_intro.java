package com.example.mayouza.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class Skill_intro extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btn;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Skill_introData> thedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skill_intro_data);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.recycler_skill_intro);
        // use a linear layout manager

        recyclerView = findViewById(R.id.skill_intro_recycler);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        thedata = Skill_introData.getSampleArrayList();
        // specify an adapter
        mAdapter = new Skill_introAdapter(thedata);
        recyclerView.setAdapter(new Skill_introAdapter(thedata));
        btn = findViewById(R.id.start_skill);

    }

}