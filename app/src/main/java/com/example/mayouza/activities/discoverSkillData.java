package com.example.mayouza.activities;

import java.util.ArrayList;

public class discoverSkillData {
    public String titles;

    public discoverSkillData(String title) {
        this.titles = title;

    }


    public static ArrayList<discoverSkillData> getSampleArrayList() {
        ArrayList<discoverSkillData> items = new ArrayList<>();
        items.add(new discoverSkillData("title 1"));
        items.add(new discoverSkillData("title 2"));
        items.add(new discoverSkillData("title 3"));
        return items;
    }

}
