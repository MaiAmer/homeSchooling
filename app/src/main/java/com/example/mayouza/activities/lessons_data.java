package com.example.mayouza.activities;

import java.util.ArrayList;

public class lessons_data {
    public String titles;

    public lessons_data(String title) {
        this.titles = title;

    }


    public static ArrayList<lessons_data> getSampleArrayList() {
        ArrayList<lessons_data> items = new ArrayList<>();
        items.add(new lessons_data("lesson 1"));
        items.add(new lessons_data("lesson 2"));
        items.add(new lessons_data("lesson 3"));
        return items;
    }
}