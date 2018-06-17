package com.example.mayouza.activities;

import java.util.ArrayList;

public class Skill_introData {
    public String title;
    public String desc;
    public int btn;

    public Skill_introData(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public Skill_introData(int btn) {
        this.btn = btn;
    }

    public static ArrayList<Skill_introData> getSampleArrayList() {
        ArrayList<Skill_introData> items = new ArrayList<>();
        items.add(new Skill_introData("title 1", " desc 1"));
        items.add(new Skill_introData("title 2", " desc 2"));
        items.add(new Skill_introData("title 3", " desc 3"));
        // items.add(new Skill_introData(R.id.start_skill));
        return items;
    }

}
