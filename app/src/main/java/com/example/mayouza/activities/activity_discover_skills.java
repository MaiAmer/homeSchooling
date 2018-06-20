package com.example.mayouza.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class activity_discover_skills extends AppCompatActivity {
    RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<discoverSkillData> thedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_skills);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.recycler_discover_skills);
        // use a linear layout manager

        recyclerView = findViewById(R.id.discoverSkillsRecycler);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        thedata = discoverSkillData.getSampleArrayList();
        // specify an adapter
        mAdapter = new discoverSkillAdapter(thedata);
        recyclerView.setAdapter(new discoverSkillAdapter(thedata));

    }
}
