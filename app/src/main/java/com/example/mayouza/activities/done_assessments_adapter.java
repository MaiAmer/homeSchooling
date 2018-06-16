package com.example.mayouza.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class done_assessments_adapter extends RecyclerView.Adapter<done_assessments_adapter.doneViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<done_assessments_data> doneArrayList;
    private ArrayList<String> doneTitles;
    private ArrayList<Integer> doneImg;
    private Context context;

    public done_assessments_adapter(Context context, ArrayList<done_assessments_data> doneArrayList,
                                    ArrayList<String> doneTitles,
                                    ArrayList<Integer> doneImg) {
        inflater = LayoutInflater.from(context);
        this.context=context;
        this.doneArrayList=doneArrayList;
        this.doneTitles = doneTitles;
        this.doneImg = doneImg;
    }

    @NonNull
    @Override
    public done_assessments_adapter.doneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.done_assessments ,parent ,false);
        return new doneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull done_assessments_adapter.doneViewHolder holder, int position) {
        holder.doneTitle.setText(doneTitles.get(position));
        holder.doneImage.setImageResource(doneImg.get(position));
    }

    @Override
    public int getItemCount() {
        return doneTitles.size();
    }
    public class doneViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView doneTitle;
        CardView doneCard;
        ImageView doneImage;
        public doneViewHolder(View itemView) {
            super(itemView);
            doneImage = itemView.findViewById(R.id.doneImage);
            doneTitle= itemView.findViewById(R.id.done_Text);
            doneCard= itemView.findViewById(R.id.done_card);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,assessment_result.class);
            context.startActivity(intent);
        }
    }

}
