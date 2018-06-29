package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
}
