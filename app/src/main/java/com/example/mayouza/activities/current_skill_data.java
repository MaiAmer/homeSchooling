package com.example.mayouza.activities;

import java.util.ArrayList;

public class current_skill_data {
    String currentSkilltitle;
    String donetitle;
    String remaintitle;
    String remaining;
    String done;
    int currentSkillCard;

    public current_skill_data(String currentskilltitle,
                              String donetitle,
                              String remaintitle,
                              String remaining,
                              String donel,
                              int currentSkillCard) {
        this.currentSkilltitle = currentskilltitle;
        this.donetitle = donetitle;
        this.remaining = remaining;
        this.done = donel;
        this.remaintitle = remaintitle;
        this.currentSkillCard = currentSkillCard;
    }

    public static ArrayList<current_skill_data> getSampleArrayList() {
        ArrayList<current_skill_data> items = new ArrayList<>();
        items.add(new current_skill_data("skill 1 ",
                "done lessons :", "remaining lessons :", "2", "1", R.id.cardCurrentSkill));
        items.add(new current_skill_data("skill 2 ",
                "done lessons :", "remaining lessons :", "1", "2", R.id.cardCurrentSkill));
        items.add(new current_skill_data("skill 1 ",
                "done lessons :", "remaining lessons :", "2", "1", R.id.cardCurrentSkill));
        items.add(new current_skill_data("skill 2 ",
                "done lessons :", "remaining lessons :", "2", "1", R.id.cardCurrentSkill));
        return items;
    }
}