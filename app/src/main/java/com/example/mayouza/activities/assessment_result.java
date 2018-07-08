package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class assessment_result extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<result_data> data ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_assessment_result);

        this.getSupportActionBar().setHomeButtonEnabled(true);

        recyclerView =findViewById(R.id.result_recycler);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        data=result_data.initializeData(4);
        // specify an adapter
        mAdapter = new resultAdapter(data);
        // Bind adapter to recycler view object
        recyclerView.setAdapter(new resultAdapter(data));

        /* to make text underlined
        skill_1.setPaintFlags(skill_1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        skill_2.setPaintFlags(skill_2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        skill_3.setPaintFlags(skill_3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
          */


    }
}
