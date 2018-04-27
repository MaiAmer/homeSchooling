package com.example.mayouza.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class done_assessments_adapter extends RecyclerView.Adapter<done_assessments_adapter.doneViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<done_assessments_data> doneArrayList;
    private Context context;

    public done_assessments_adapter(Context context , ArrayList<done_assessments_data> doneArrayList){
        this.context=context;
        this.doneArrayList=doneArrayList;
        inflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public done_assessments_adapter.doneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.done_assessments ,parent ,false);
        return new doneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull done_assessments_adapter.doneViewHolder holder, int position) {
        holder.doneTitle.setText(doneArrayList.get(position).getDoneTitle());
    }

    @Override
    public int getItemCount() {
        return doneArrayList.size();
    }
    public class doneViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView doneTitle;
        CardView doneCard;
        public doneViewHolder(View itemView) {
            super(itemView);
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
