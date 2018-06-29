package com.example.mayouza.activities;

import java.util.ArrayList;

public class result_data {
    int congratsCard;
    String congrats;
    String congrats_text;
    String suggest_skill;
    int suggestCard_imgID;
    String suggestCard_title;
    String suggestcard_text;
    int go_btn_id;
    int card_id;
    public result_data( int congratsCard,
                        String congrats,
                       String congrats_text,
                       String suggest_skill) {
        this.congrats = congrats;
        this.congrats_text = congrats_text;
        this.suggest_skill = suggest_skill;
        this.congratsCard=congratsCard;
    }

    public result_data( int cardId,
                       int suggestCard_imgID,
                       String suggestCard_title,
                       String suggestcard_text,
                       int go_btn_id) {
        this.suggestCard_imgID = suggestCard_imgID;
        this.suggestCard_title = suggestCard_title;
        this.suggestcard_text = suggestcard_text;
        this.go_btn_id = go_btn_id;
        this.card_id=cardId;
    }

    public static ArrayList<result_data> initializeData(int num) {
        ArrayList<result_data> data = new ArrayList<>();

        // This method creates an ArrayList with the contents
            data.add(new result_data(R.id.congrats_card,"Congratulations","here the text of the description",
                    "Suggested skills for you "));
            data.add(new result_data(R.id.suggested_Skills_Card,R.drawable.image,"first skill",
                    "description about the skill" ,R.id.go_btn));

            data.add(new result_data(R.id.suggested_Skills_Card,R.drawable.image,"second skill",
                    "description about the skill" ,R.id.go_btn));

            data.add(new result_data(R.id.suggested_Skills_Card,R.drawable.image,"third skill",
                    "description about the skill" ,R.id.go_btn));

        return data;
    }
}