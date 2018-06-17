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

    private ArrayList<discover_assessmnets_data> data;
    private LayoutInflater inflater;
    private ArrayList<String>titles;
    private ArrayList<String>desc;
    private ArrayList<Integer>imges;
    private ArrayList<Integer> btnId;
    Context context;
  /*
        these lines used if we used discover_assessment_data.java
       public interface ClickListener {

        void onGoToClicked(View itemView , int position);
    }
*/
  // Skill_introData is passed into the constructor
 /*   public discoverAssessmentsAdapter(Context context,ArrayList<discover_assessmnets_data> Skill_introData)
    {
        this.context=context;
        inflater = LayoutInflater.from(context);
        this.Skill_introData=Skill_introData;
    }
*/
  public discoverAssessmentsAdapter(Context context,ArrayList<String>titles
          ,ArrayList<String>desc,ArrayList<Integer>imgs,ArrayList<Integer>btns)
  {
      inflater = LayoutInflater.from(context);
      this.context=context;
      this.titles=titles;
      this.desc=desc;
      this.imges=imgs;
      this.btnId=btns;
  }

    // inflates the row layout from xml when needed
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_discover_assessments, parent, false);
        return new ViewHolder(view);
    }

    // binds the Skill_introData to the view
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

    /*    holder.title.setText(Skill_introData.get(position).getTitle());
        holder.desc.setText(Skill_introData.get(position).getDesc());
        holder.img.setImageResource(Skill_introData.get(position).getImgId());
        */

        holder.title.setText(titles.get(position));
        holder.desc.setText(desc.get(position));
        holder.img.setImageResource(imges.get(position));
        holder.goToBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( context, assessment_cat1.class);
                intent.putExtra("title",titles.get(position));
                intent.putExtra("img",imges.get(position));
                intent.putExtra("button",btnId.get(position));
                context.startActivity(intent);
            }
        });
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView desc;
        ImageView img;
        Button goToBtn;
      //  private ClickListener clickHandler;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.discoverTxt);
            desc = itemView.findViewById(R.id.discover_description);
            img = itemView.findViewById(R.id.discoverImg);
            goToBtn = itemView.findViewById(R.id.discoverGoTO);

        }
    }

}