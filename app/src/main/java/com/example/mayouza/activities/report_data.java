package com.example.mayouza.activities;

import java.util.ArrayList;


public class report_data {
    int nDone ;
    int nMastered;
    int nEnrolled;
    int skills_card;
    String skill_name;
    String percent;
    String effeciency;

    public report_data(int card , String name , String percent , String effeciency)
    {

        this.skills_card= card;
        this.skill_name =name;
        this.percent =percent;
        this.effeciency=effeciency;
    }
    public report_data(int nDone , int nEnrolled , int nMastered)
    {
        this.nEnrolled=nEnrolled;
        this.nMastered=nMastered;
        this.nDone=nDone;
    }

    public static ArrayList<report_data> initializeData(int num) {
        ArrayList<report_data> data = new ArrayList<>();

   // This method creates an ArrayList with the contents
            data.add(new report_data(1,2,3));
            data.add(new report_data(R.id.skillsCard, "skill number 1", "20%", "efficiency 20%" ));
            data.add(new report_data(R.id.skillsCard, "skill number 2", "30%", "efficiency 10%"));
            data.add(new report_data(R.id.skillsCard, "skill number 3", "90%", "efficiency 15%"));
        return data;
    }
}
