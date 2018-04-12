package com.example.mayouza.activities;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class assessment_result extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<result_data> data ;
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

        recyclerView =(RecyclerView)findViewById(R.id.result_recycler);

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
