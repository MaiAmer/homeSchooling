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

public class onclickDiscoverSkillAdapter extends
        RecyclerView.Adapter<onclickDiscoverSkillAdapter.onClickDiscoverHolder> {

    private ArrayList<onClickDiscoverSkillData> thedata;

    public onclickDiscoverSkillAdapter(ArrayList<onClickDiscoverSkillData> thedata) {
        this.thedata = thedata;
    }

    @NonNull
    @Override
    public onclickDiscoverSkillAdapter.onClickDiscoverHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.activity_onclick_discover_skills, parent, false);

        // Return a new holder instance
        onclickDiscoverSkillAdapter.onClickDiscoverHolder viewHolder = new onclickDiscoverSkillAdapter.onClickDiscoverHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull onclickDiscoverSkillAdapter.onClickDiscoverHolder holder, int position) {

        holder.txt.setText(thedata.get(position).theTitle);
        holder.img.setImageResource(thedata.get(position).img);
        holder.card.setId(thedata.get(position).cardID);
    }

    @Override
    public int getItemCount() {
        return thedata.size();
    }

    public class onClickDiscoverHolder extends RecyclerView.ViewHolder {
        TextView txt;
        ImageView img;
        CardView card;

        public onClickDiscoverHolder(final View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.onClickdiscoverSkillText);
            card = itemView.findViewById(R.id.onClickdiscoverSkillcard);
            img = itemView.findViewById(R.id.onClickdiscoverSkillImage);
            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(itemView.getContext(), Skill_intro.class);
                    v.getContext().startActivity(i);
                }
            });
        }

    }
}
