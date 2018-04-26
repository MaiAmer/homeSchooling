package com.example.mayouza.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class discoverAssessmentsAdapter extends RecyclerView.Adapter<discoverAssessmentsAdapter.ViewHolder> {
    private int numOfCategories = 3;
    private ArrayList<discover_assessmnets_data> data;
    private LayoutInflater inflater;
    Context mContext;

    public interface ClickListener {

        void onGoToClicked(View itemView , int position);
    }

    // data is passed into the constructor
    public discoverAssessmentsAdapter(Context context,ArrayList<discover_assessmnets_data> data)
    {
        inflater = LayoutInflater.from(context);
        this.data=data;
    }

    // inflates the row layout from xml when needed
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_discover_assessments, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the view
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.title.setText(data.get(position).getTitle());
        holder.desc.setText(data.get(position).getDesc());
        holder.img.setImageResource(data.get(position).getImgId());

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return numOfCategories;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView desc;
        ImageView img;
        Button goToBtn;
        private ClickListener clickHandler;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.discoverTxt);
            desc = itemView.findViewById(R.id.discover_description);
            img = itemView.findViewById(R.id.discoverImg);
            goToBtn = itemView.findViewById(R.id.go_btn);
           goToBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                  clickHandler.onGoToClicked(view,position);
                }
            });
        }
    }

}