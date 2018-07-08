package com.example.mayouza.activities;

import java.util.ArrayList;

public class about_app_data {

    String aboutTitle;
    String TeamMembers;
    String aboutTxt;
    String member1;
    String member2;
    String member3;
    String member4;
    int img1;
    int img2;
    int img3;
    int img4;

    public about_app_data(String aboutTitle,
                          String TeamMembers,
                          String aboutTxt,
                          String member1,
                          String member2,
                          String member3,
                          String member4,
                          int img1,
                          int img2,
                          int img3,
                          int img4) {
        this.aboutTitle = aboutTitle;
        this.TeamMembers = TeamMembers;
        this.aboutTxt = aboutTxt;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
        this.member4 = member4;

    }

    public static ArrayList<about_app_data> getSampleArrayList() {
        ArrayList<about_app_data> items = new ArrayList<>();
        items.add(new about_app_data("About Our App ", "Team Members"
                , "we are a group of students want to encourage self and home learning and help parents " +
                "to know about this kind of learning and improve themselves too", "Eng/ Mostafa yehya",
                "Eng/Asmaa Ahmed", "Eng Mai Amer", "Eng/Alaa Ebrahim", R.drawable.boy,
                R.drawable.girl, R.drawable.girl, R.drawable.boy));
        return items;
    }
}