package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class discover_assessments_main extends AppCompatActivity {
    private ArrayList<discover_assessmnets_data> ModelArrayList;
    private discoverAssessmentsAdapter adapter;

    private ArrayList<Integer> buttons = new ArrayList<>();
    private ArrayList<Integer> images = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<String> desc = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_discover_assessments);

        images.add(R.drawable.image);
        images.add(R.drawable.image);
        images.add(R.drawable.image);

        titles.add(" assessment category 1");
        titles.add(" assessment category 2");
        titles.add(" assessment category 3");

        desc.add("description of assessment category 1");
        desc.add("description of assessment category 2");
        desc.add("description of assessment category 3");

        buttons.add(1);
        buttons.add(2);
        buttons.add(3);

        // set up the RecyclerView
        RecyclerView discoverRecycler = findViewById(R.id.discoverRecycler);
      //  ModelArrayList = populateList();
        adapter = new discoverAssessmentsAdapter(this,titles ,desc ,images ,buttons);
        discoverRecycler.setAdapter(adapter);
        discoverRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,false));

    }
/*
    @Override
    public void onGoToClicked(View view , int position) {
        Intent intent = new Intent(getApplicationContext(), assessment_cat1.class);
        startActivity(intent);
    }
*/
   /* private ArrayList<discover_assessmnets_data> populateList()
    {
        ArrayList<discover_assessmnets_data>list = new ArrayList<>();
        for(int i = 0 ;i< 3 ; i++)
        {
            discover_assessmnets_data theData = new discover_assessmnets_data();
            theData.setTitle(titles[i]);
            theData.setDesc(desc[i]);
            theData.setImgId(images[i]);
            list.add(theData);
        }
        return list;
    } */
}
