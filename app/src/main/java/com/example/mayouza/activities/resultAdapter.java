package com.example.mayouza.activities;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class resultAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int CONGRATS = 0, SUGGESTED = 1;

    //add a constructor to the custom adapter so that it has a handle to the data that the RecyclerView displays.
    List<result_data> theData;

    resultAdapter(List<result_data> theData) {
        this.theData = theData;
    }

    public class congratsHolder extends RecyclerView.ViewHolder {
        CardView congratsCard;
        TextView congrats;
        TextView congrats_text;
        TextView suggest_skill;

        public congratsHolder(View itemView) {
            super(itemView);

            congratsCard = (CardView) itemView.findViewById(R.id.congrats_card);
            congrats = (TextView) itemView.findViewById(R.id.congrats);
            congrats_text = (TextView) itemView.findViewById(R.id.congrats_text);
            suggest_skill = (TextView) itemView.findViewById(R.id.suggested_text);

        }

        public CardView getCongratsCard() {
            return congratsCard;
        }

        public TextView getCongrats() {
            return congrats;
        }

        public TextView getCongrats_text() {
            return congrats_text;
        }

        public TextView getSuggest_skill() {
            return suggest_skill;
        }

        public void setCongrats(TextView congrats) {
            this.congrats = congrats;
        }

        public void setCongratsCard(CardView congratsCard) {
            this.congratsCard = congratsCard;
        }

        public void setCongrats_text(TextView congrats_text) {
            this.congrats_text = congrats_text;
        }

        public void setSuggest_skill(TextView suggest_skill) {
            this.suggest_skill = suggest_skill;
        }
    }

    public class suggesstHolder extends RecyclerView.ViewHolder {
        CardView suggesstCard;
        ImageView suggestCard_img;
        TextView suggestCard_title;
        TextView suggestcard_text;
        Button go_btn_id;

        public suggesstHolder(View itemView) {
            super(itemView);
            suggesstCard = (CardView) itemView.findViewById(R.id.suggested_Skills_Card);
            suggestCard_img = (ImageView) itemView.findViewById(R.id.suggestCard_image);
            suggestCard_img.setImageResource(R.drawable.image);
            suggestCard_title = (TextView) itemView.findViewById(R.id.suggestCard_title);
            suggestcard_text = (TextView) itemView.findViewById(R.id.suggestcard_text);
            go_btn_id = (Button) itemView.findViewById(R.id.go_btn);

        }

        public CardView getSuggesstCard() {
            return suggesstCard;
        }

        public ImageView getSuggestCard_img() {
            return suggestCard_img;
        }

        public Button getGo_btn_id() {
            return go_btn_id;
        }

        public TextView getSuggestcard_text() {
            return suggestcard_text;
        }

        public TextView getSuggestCard_title() {
            return suggestCard_title;
        }

        public void setGo_btn_id(Button go_btn_id) {
            this.go_btn_id = go_btn_id;
        }

        public void setSuggesstCard(CardView suggesstCard) {
            this.suggesstCard = suggesstCard;
        }

        public void setSuggestCard_img(ImageView suggestCard_img) {
            this.suggestCard_img = suggestCard_img;
        }

        public void setSuggestcard_text(TextView suggestcard_text) {
            this.suggestcard_text = suggestcard_text;
        }

        public void setSuggestCard_title(TextView suggestCard_title) {
            this.suggestCard_title = suggestCard_title;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case CONGRATS:
                View v1 = LayoutInflater.from(parent.getContext()).inflate
                        (R.layout.content_assessment_result, parent, false);
                return new congratsHolder(v1);
            case SUGGESTED:
                View v2 = LayoutInflater.from(parent.getContext()).inflate
                        (R.layout.content_assessment_result2, parent, false);
                return new suggesstHolder(v2);
            default:
                View v = LayoutInflater.from(parent.getContext()).inflate
                        (R.layout.content_assessment_result, parent, false);
                return new congratsHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case CONGRATS:
                congratsHolder v1 = (congratsHolder) holder;
                configureCongrates(v1, position);
                break;
            case SUGGESTED:
                if (holder instanceof suggesstHolder) {
                    suggesstHolder v2 = (suggesstHolder) holder;
                    configureSuggesst(v2, position);
                }
                break;
            default:
                congratsHolder v = (congratsHolder) holder;
                configureCongrates(v, position);
                break;
        }
    }

    private void configureCongrates(congratsHolder v1, int position) {
        result_data theseData = theData.get(position);
        if (theseData != null) {
            v1.getCongratsCard().setId(theseData.congratsCard);
            v1.getCongrats().setText(String.valueOf(theseData.congrats));
            v1.getCongrats_text().setText(String.valueOf(theseData.congrats_text));
            v1.getSuggest_skill().setText(String.valueOf(theseData.suggest_skill));
        }
    }

    private void configureSuggesst(suggesstHolder v2, int position) {
        result_data theseData = theData.get(position);
        if (theseData != null) {
            v2.getSuggesstCard().setId(theseData.card_id);
            v2.getSuggestCard_img().setImageResource(theseData.suggestCard_imgID);
            v2.getSuggestCard_title().setText(String.valueOf(theseData.suggestCard_title));
            v2.getSuggestcard_text().setText(String.valueOf(theseData.suggestcard_text));

        }
    }

    @Override
    public int getItemCount() {
        return theData.size();
    }

    //to tell the RecyclerView about the type of view to inflate based on the position.
    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return CONGRATS;
            case 1:
                return SUGGESTED;
            default: //to make card repeat
                return SUGGESTED;
        }
    }
}