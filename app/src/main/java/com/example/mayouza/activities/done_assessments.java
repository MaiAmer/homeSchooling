package com.example.mayouza.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class done_assessments extends AppCompatActivity {

    RecyclerView doneRecycler;
    ArrayList<done_assessments_data> doneList ;
    done_assessments_adapter adapter;
    ArrayList<String> doneTitles = new ArrayList<>();
    ArrayList<Integer> doneImg = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // be aware that here we put the recycler xml file not the contents
        setContentView(R.layout.recycler_done_assessments);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.getSupportActionBar().setTitle("Done Assessments");

        doneImg.add(R.drawable.image);
        doneImg.add(R.drawable.image);
        doneImg.add(R.drawable.image);

        doneTitles.add("assessment 1");
        doneTitles.add("assessment 2");
        doneTitles.add("assessment 3");

        doneRecycler = findViewById(R.id.doneRecycler);
        adapter = new done_assessments_adapter(this, doneList, doneTitles, doneImg);
        doneRecycler.setAdapter(adapter);
        doneRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL ,false));

    }
/*
private ArrayList<done_assessments_data> populateList(){
    ArrayList<done_assessments_data> list = new ArrayList<>();
    for(int i = 0 ; i< 3 ; i++)
    {
        done_assessments_data model = new done_assessments_data();
        model.setDoneTitle(doneTitles[i]);
        model.setImgId(doneImg[i]);
        list.add(model);
    }
    return list;
}*/
}
