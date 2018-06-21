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

public class lessonsAdapter extends
        RecyclerView.Adapter<lessonsAdapter.lessonHolder> {
    final int BUTTONS = 0;
    final int ITEMS = 1;
    private ArrayList<lessons_data> thedata;

    public lessonsAdapter(ArrayList<lessons_data> thedata) {
        this.thedata = thedata;

    }

    @NonNull
    @Override
    public lessonsAdapter.lessonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        if (viewType == ITEMS) {
            // Inflate the custom layout
            View view = inflater.inflate(R.layout.activity_lessons, parent, false);

            // Return a new holder instance
            lessonsAdapter.lessonHolder viewHolder = new lessonsAdapter.lessonHolder(view);
            return viewHolder;
        } else if (viewType == BUTTONS) {
            // Inflate the custom layout
            View view2 = inflater.inflate(R.layout.activity_lessons, parent, false);

            // Return a new holder instance
            lessonsAdapter.lessonHolder viewHolder2 = new lessonsAdapter.lessonHolder(view2);

            //TODO : add buttons and click listeners for them
            return viewHolder2;

        } else {  // Inflate the custom layout
            View view3 = inflater.inflate(R.layout.activity_lessons, parent, false);

            // Return a new holder instance
            lessonsAdapter.lessonHolder viewHolder3 = new lessonsAdapter.lessonHolder(view3);
            return viewHolder3;

        }
    }

    @Override
    public void onBindViewHolder(@NonNull lessonsAdapter.lessonHolder holder, int position) {

        holder.txt.setText(thedata.get(position).titles);
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return BUTTONS;
        else return ITEMS;
    }

    @Override
    public int getItemCount() {
        return thedata.size() + 1;
    }

    public class lessonHolder extends RecyclerView.ViewHolder {
        TextView txt;

        public lessonHolder(final View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.lessonTitle);
            txt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //          Intent i = new Intent(itemView.getContext(), activity_onclick_discover_skills.class);
                    //         v.getContext().startActivity(i);
                }
            });
        }
    }
}
