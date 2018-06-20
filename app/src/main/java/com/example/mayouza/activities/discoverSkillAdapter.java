package com.example.mayouza.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;

public class discoverSkillAdapter extends
        RecyclerView.Adapter<discoverSkillAdapter.discoverHolder> {

    private ArrayList<discoverSkillData> thedata;

    public discoverSkillAdapter(ArrayList<discoverSkillData> thedata) {
        this.thedata = thedata;

    }

    @NonNull
    @Override
    public discoverSkillAdapter.discoverHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.activity_discover_skills, parent, false);

        // Return a new holder instance
        discoverSkillAdapter.discoverHolder viewHolder = new discoverSkillAdapter.discoverHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull discoverSkillAdapter.discoverHolder holder, int position) {

        holder.txt.setText(thedata.get(position).titles);
    }

    @Override
    public int getItemCount() {
        return thedata.size();
    }

    public class discoverHolder extends RecyclerView.ViewHolder {
        TextView txt;

        public discoverHolder(final View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.skillTitles);
            txt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(itemView.getContext(), activity_onclick_discover_skills.class);
                    v.getContext().startActivity(i);
                }
            });
        }
    }

}
