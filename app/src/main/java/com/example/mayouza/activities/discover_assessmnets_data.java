package com.example.mayouza.activities;

import java.util.ArrayList;

public class discover_assessmnets_data {

    String title;
    String desc;
    int imgId ;
    int btnId;

    public discover_assessmnets_data()
    {
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImgId() {
        return imgId;
    }

    public int getBtnId() {
        return btnId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setBtnId(int btnId) {
        this.btnId = btnId;
    }

   /* public static ArrayList<discover_assessmnets_data> createCategoriesList(int numContacts) {
        ArrayList<discover_assessmnets_data> discoverData = new ArrayList<discover_assessmnets_data>();

        for (int i = 1; i <= numContacts; i++) {
            discoverData.add(new discover_assessmnets_data("assessment category 1 " ,
                    "description assessment category 2", R.drawable.image , R.id.go_btn));
            discoverData.add(new discover_assessmnets_data("assessment category 2 " ,
                    " description assessment category 2", R.drawable.image , R.id.go_btn));
            discoverData.add(new discover_assessmnets_data("assessment category 3" ,
                    " description assessment category 3", R.drawable.image , R.id.go_btn));
        }
        return  discoverData;
    }
*/
}