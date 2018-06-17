package com.example.mayouza.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Skill_introAdapter extends
        RecyclerView.Adapter<Skill_introAdapter.skillHolder> {

    private ArrayList<Skill_introData> thedata;

    public Skill_introAdapter(ArrayList<Skill_introData> thedata) {
        this.thedata = thedata;
    }

    @NonNull
    @Override
    public Skill_introAdapter.skillHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        if (viewType == R.layout.skill_intro_data) {
            // Inflate the custom layout
            View view = inflater.inflate(R.layout.skill_intro_data, parent, false);

            // Return a new holder instance
            skillHolder viewHolder = new skillHolder(view);
            return viewHolder;
        } else {
            View view = inflater.inflate(R.layout.skill_intro_button, parent, false);

            // Return a new holder instance
            skillHolder viewHolder = new skillHolder(view);
            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull Skill_introAdapter.skillHolder holder, int position) {
        if (position == thedata.size()) {
            holder.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO
                }
            });
        } else {
            holder.txt1.setText(thedata.get(position).title);
            holder.txt2.setText(thedata.get(position).desc);

        }
    }

    @Override
    public int getItemViewType(int position) {
        return (position == thedata.size()) ? R.layout.skill_intro_button : R.layout.skill_intro_data;
    }

    @Override
    public int getItemCount() {
        return thedata.size() + 1;
    }

    public class skillHolder extends RecyclerView.ViewHolder {
        TextView txt1;
        TextView txt2;
        Button btn;

        public skillHolder(View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.start_skill);
            txt1 = itemView.findViewById(R.id.skillTitle);
            txt2 = itemView.findViewById(R.id.skillDesc);
        }

    }
}
