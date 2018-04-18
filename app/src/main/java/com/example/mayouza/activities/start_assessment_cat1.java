package com.example.mayouza.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class start_assessment_cat1 extends AppCompatActivity {

    ViewPager pager;

    private sectionsPagerAdapter sectionPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_assessment);

        sectionPagerAdapter = new sectionsPagerAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.discoverViewPager);
        pager.setAdapter(sectionPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(pager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_discover_assessment, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }


}
// Custom PagerAdapter class

class sectionsPagerAdapter extends FragmentPagerAdapter{

    public sectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Return fragment based on the position....

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // show 1 category fragment
                quiz1 frag1 = new quiz1();
                return frag1;
            case 1: //show second category fragment
                quiz2 frag2 = new quiz2();
                return frag2;
            default: // default first one
                quiz3 frag_default = new quiz3();
                return frag_default;
        }
    }

    //Return the number of pages.
    @Override
    public int getCount() {
        return 3;
    }


}

