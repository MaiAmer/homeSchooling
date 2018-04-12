package com.example.mayouza.activities;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class reportAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int NUMBERS = 0, CARD = 1;
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access

    public static class reportViewHolder extends RecyclerView.ViewHolder
    {
        TextView enrolled;
        TextView mastered;
        TextView done;

        public reportViewHolder(View itemView)
        {
            super(itemView);
            enrolled= (TextView)itemView.findViewById(R.id.nEnrolled);
            mastered= (TextView)itemView.findViewById(R.id.nMastered);
            done= (TextView)itemView.findViewById(R.id.nDone);
        }

        public TextView getDone() {
            return done;
        }

        public TextView getEnrolled() {
            return enrolled;
        }

        public TextView getMastered() {
            return mastered;
        }

        public void setEnrolled(TextView enrolled) {
            this.enrolled = enrolled;
        }

        public void setDone(TextView done) {
            this.done = done;
        }

        public void setMastered(TextView mastered) {
            this.mastered = mastered;
        }
    }
    public static class reportViewHolder2 extends RecyclerView.ViewHolder
    {
        CardView skills_card ;
        TextView skill_name;
        TextView effeciency ;
        TextView percent;


        public reportViewHolder2(View itemView)
        {
            super(itemView);
            skill_name= (TextView)itemView.findViewById(R.id.nameOfSkill);
            effeciency= (TextView)itemView.findViewById(R.id.efficiencyPercent);
            percent= (TextView)itemView.findViewById(R.id.percentOfSkill);
            skills_card = (CardView)itemView.findViewById(R.id.skillsCard);

        }

        public TextView getEffeciency() {
            return effeciency;
        }

        public TextView getSkill_name() {
            return skill_name;
        }

        public TextView getPercent() {
            return percent;
        }

        public CardView getSkills_card() {
            return skills_card;
        }
    }


    //add a constructor to the custom adapter so that it has a handle to the data that the RecyclerView displays.
    List<report_data> theData;
    reportAdapter(List<report_data> theData){
        this.theData = theData;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case NUMBERS:
                 View v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_list, parent, false);
               return new reportViewHolder(v1);
            case CARD:
                View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_list2, parent, false);
              return new reportViewHolder2(v2) ;
              default: // numbers
                  v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_list, parent, false);
                  return new reportViewHolder(v1);
        }
    }
    //to tell the RecyclerView about the type of view to inflate based on the position.
    @Override
    public int getItemViewType(int position) {
        switch(position) {
            case 0:
                return NUMBERS;
            case 1:
                return  CARD;
            default: //to make card repeat
                return CARD;
        }
    }
    //to specify the contents of each item of the RecyclerView
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

     switch (holder.getItemViewType()) {
        case NUMBERS:
        reportViewHolder vh1 =(reportViewHolder) holder;
        configureViewHolder1(vh1, position);
        break;
        case CARD:
            // instance of to avoid java.lang.ClassCastException
            if(holder instanceof reportViewHolder2) {
                reportViewHolder2 vh2 = (reportViewHolder2) holder;
                configureViewHolder2(vh2,position);
            }
        break;
        default:
        reportViewHolder vh = (reportViewHolder) holder;
        configureViewHolder1(vh, position);
        break;
    }
    }

    @Override
    public int getItemCount() {
        return theData.size();
    }

    private void configureViewHolder1( reportViewHolder vh1, int position) {
        report_data theseData = theData.get(position);
        if (theseData != null) {
            vh1.getDone().setText(String.valueOf(theseData.nDone));
            vh1.getMastered().setText(String.valueOf(theseData.nMastered));
            vh1.getEnrolled().setText(String.valueOf(theseData.nEnrolled));
        }
    }
        private void configureViewHolder2( reportViewHolder2 vh2, int position) {
            report_data theseData =  theData.get(position);
            if (theseData != null)
            {
             vh2.getSkills_card().setId(theseData.skills_card);
             vh2.getSkill_name().setText(String.valueOf(theseData.skill_name));
             vh2.getPercent().setText(String.valueOf(theseData.percent));
             vh2.getEffeciency().setText(String.valueOf(theseData.effeciency));
            }
    }

}