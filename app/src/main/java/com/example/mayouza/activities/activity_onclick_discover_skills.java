package com.example.mayouza.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class activity_onclick_discover_skills extends AppCompatActivity {
    RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<onClickDiscoverSkillData> thedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclick_discover_skills);
        setContentView(R.layout.activity_discover_skills);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.recycler_onclick_discover_skills);
        // use a linear layout manager

        recyclerView = findViewById(R.id.onclick_discoverSkills);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        thedata = onClickDiscoverSkillData.getSampleArrayList();
        // specify an adapter
        mAdapter = new onclickDiscoverSkillAdapter(thedata);
        recyclerView.setAdapter(new onclickDiscoverSkillAdapter(thedata));

    }
}
