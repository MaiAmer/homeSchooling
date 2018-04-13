package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;



public class discover_assessment extends FragmentActivity
        implements ViewPager.OnPageChangeListener{

    private static final int NUMBER_OF_PAGES = 3;
    //private RadioGroup radioGroup;
    ViewPager pager;
    private static final int CAT_1 = 0;
    private static final int CAT_2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_assessment);

        pager = (ViewPager) findViewById(R.id.discoverViewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pager.addOnPageChangeListener(this);

    }


     // When the current page is scrolled
    @Override
    public void onPageScrolled(int position, float v, int i) {

    }

    //When a new page becomes selected

    @Override
    public void onPageSelected(int position) {
        switch(position) {
            case CAT_1:

                Intent intent = new Intent(getApplicationContext(), assessment_cat1.class);
                startActivity(intent);
                break;
            case CAT_2:
                Intent intent2 = new Intent(getApplicationContext(), assessment_cat1.class);
                startActivity(intent2);
                break;
            default:
                Intent intent0 = new Intent(getApplicationContext(), assessment_cat1.class);
                startActivity(intent0);
        }
    }

    // When the pager is automatically setting to the current page
    @Override
    public void onPageScrollStateChanged(int position) {

        switch (position) {
            case CAT_1: // show 1 category fragment
                  discover_fragment.newInstance(String.valueOf(R.string.DiscoverAsssessment_categoryName1),
                        String.valueOf(R.string.about_assessment),R.drawable.image);
            case CAT_2: //show second category fragment
                  discover_fragment2.newInstance(String.valueOf(R.string.DiscoverAsssessment_categoryName2),
                        String.valueOf(R.string.about_assessment),R.drawable.image);
            default: // default first one
                  discover_fragment_default.newInstance(String.valueOf(R.string.DiscoverAsssessment_categoryName1),
                        String.valueOf(R.string.about_assessment),R.drawable.image);
        }
    }

     // Custom PagerAdapter class

    private class MyPagerAdapter extends FragmentPagerAdapter{

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        //Return fragment based on the position....

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case CAT_1: // show 1 category fragment
                    return  discover_fragment.newInstance(String.valueOf(R.string.DiscoverAsssessment_categoryName1),
                            String.valueOf(R.string.about_assessment),R.drawable.image);
                case CAT_2: //show second category fragment
                    return  discover_fragment2.newInstance(String.valueOf(R.string.DiscoverAsssessment_categoryName2),
                            String.valueOf(R.string.about_assessment),R.drawable.image);
                    default: // default first one
                        return  discover_fragment_default.newInstance(String.valueOf(R.string.DiscoverAsssessment_categoryName1),
                                String.valueOf(R.string.about_assessment),R.drawable.image);
            }
        }

        //Return the number of pages.
        @Override
        public int getCount() {
            return NUMBER_OF_PAGES;
        }


    }


}