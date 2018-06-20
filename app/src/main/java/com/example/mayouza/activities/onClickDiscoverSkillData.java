package com.example.mayouza.activities;

import java.util.ArrayList;

public class onClickDiscoverSkillData {

    public String theTitle;
    public int img;
    public int cardID;

    public onClickDiscoverSkillData(String title, int img, int cardID) {
        this.theTitle = title;
        this.cardID = cardID;
        this.img = img;
    }

    public static ArrayList<onClickDiscoverSkillData> getSampleArrayList() {
        ArrayList<onClickDiscoverSkillData> items = new ArrayList<>();
        items.add(new onClickDiscoverSkillData("title 1", R.drawable.image, R.id.onClickdiscoverSkillcard));
        items.add(new onClickDiscoverSkillData("title 2", R.drawable.image, R.id.onClickdiscoverSkillcard));
        items.add(new onClickDiscoverSkillData("title 3", R.drawable.image, R.id.onClickdiscoverSkillcard));
        // items.add(new Skill_introData(R.id.start_skill));
        return items;
    }

}
