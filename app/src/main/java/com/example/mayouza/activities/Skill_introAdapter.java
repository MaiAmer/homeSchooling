package com.example.mayouza.activities;

import android.content.Context;
import android.content.Intent;
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
    Context context;

    public Skill_introAdapter(Context context, ArrayList<Skill_introData> thedata) {
        this.thedata = thedata;
        this.context = context;
    }

    @NonNull
    @Override
    public Skill_introAdapter.skillHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        if (viewType == R.layout.skill_intro_data) {
            // Inflate the custom layout
            View view = inflater.inflate(R.layout.skill_intro_data, parent, false);

            // Return a new holder instance
            return new skillHolder(view);
        } else {
            View view = inflater.inflate(R.layout.skill_intro_button, parent, false);

            // Return a new holder instance
            return new skillHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull Skill_introAdapter.skillHolder holder, int position) {
        if (position == thedata.size()) {
            holder.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context, activity_lessons.class);
                    view.getContext().startActivity(i);
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

        public skillHolder(final View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.start_skill);
            txt1 = itemView.findViewById(R.id.skillTitle);
            txt2 = itemView.findViewById(R.id.skillDesc);

        }

    }
}
