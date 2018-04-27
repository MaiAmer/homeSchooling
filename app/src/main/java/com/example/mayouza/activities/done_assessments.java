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
    String[] doneTitles = new String[]{"assessment 1" , "assessment 2" , " assessment 3"};
    int[] doneImg = new int[]{R.drawable.image ,R.drawable.image ,R.drawable.image };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // be aware that here we put the recycler xml file not the contents
        setContentView(R.layout.recycler_done_assessments);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.getSupportActionBar().setTitle("Done Assessments");

        doneRecycler = findViewById(R.id.doneRecycler);
        doneList= populateList();
        adapter = new done_assessments_adapter(this , doneList);
        doneRecycler.setAdapter(adapter);
        doneRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL ,false));

    }
/*
    private void doneAssesProgress(View view) {
        progressBar = (ProgressBar) findViewById(R.id.done_progBar);
        int maxValue = progressBar.getMax();
        int progressValue = progressBar.getProgress();
        progressBar.isShown();
    }
*/
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
}
}
