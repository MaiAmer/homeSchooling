package com.example.mayouza.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class aboutAppAdapter extends
        RecyclerView.Adapter<aboutAppAdapter.aboutAppHolder> {

    private ArrayList<about_app_data> thedata;

    public aboutAppAdapter(ArrayList<about_app_data> thedata) {
        this.thedata = thedata;

    }

    @NonNull
    @Override
    public aboutAppAdapter.aboutAppHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.activity_about_app, parent, false);

        // Return a new holder instance
        aboutAppAdapter.aboutAppHolder viewHolder = new aboutAppAdapter.aboutAppHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull aboutAppAdapter.aboutAppHolder holder, int position) {

        holder.aboutTitle.setText(thedata.get(position).aboutTitle);
        holder.TeamMembers.setText(thedata.get(position).TeamMembers);
        holder.aboutTxt.setText(thedata.get(position).aboutTxt);
        holder.member1.setText(thedata.get(position).member1);
        holder.member2.setText(thedata.get(position).member2);
        holder.member3.setText(thedata.get(position).member3);
        holder.member4.setText(thedata.get(position).member4);
        holder.img1.setImageResource(thedata.get(position).img1);
        holder.img2.setImageResource(thedata.get(position).img2);
        holder.img3.setImageResource(thedata.get(position).img3);
        holder.img4.setImageResource(thedata.get(position).img4);

    }

    @Override
    public int getItemCount() {
        return thedata.size();
    }

    public class aboutAppHolder extends RecyclerView.ViewHolder {

        TextView aboutTitle;
        TextView TeamMembers;
        TextView aboutTxt;
        TextView member1;
        TextView member2;
        TextView member3;
        TextView member4;
        ImageView img1;
        ImageView img2;
        ImageView img3;
        ImageView img4;

        public aboutAppHolder(final View itemView) {
            super(itemView);
            aboutTitle = itemView.findViewById(R.id.titleAboutApp);
            aboutTxt = itemView.findViewById(R.id.aboutApp);
            TeamMembers = itemView.findViewById(R.id.teamTitle);
            member1 = itemView.findViewById(R.id.member1);
            member2 = itemView.findViewById(R.id.member2);
            member3 = itemView.findViewById(R.id.member3);
            member4 = itemView.findViewById(R.id.member4);
            img1 = itemView.findViewById(R.id.avatar1);
            img2 = itemView.findViewById(R.id.avatar2);
            img3 = itemView.findViewById(R.id.avatar3);
            img4 = itemView.findViewById(R.id.avatar4);

        }
    }


}
