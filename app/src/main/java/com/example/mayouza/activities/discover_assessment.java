package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class discover_assessment extends AppCompatActivity {

    ViewPager pager;

    private sectionPagerAdapter sectionPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_assessment);

        sectionPagerAdapter = new sectionPagerAdapter(getSupportFragmentManager());

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

     class sectionPagerAdapter extends FragmentPagerAdapter{

        public sectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        //Return fragment based on the position....

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // show 1 category fragment
                    discover_fragment frag1 = new discover_fragment();
                    return frag1;
                case 1: //show second category fragment
                    discover_fragment2 frag2 = new discover_fragment2();
                    return frag2;
                default: // default first one
                    discover_fragment_default frag_default = new discover_fragment_default();
                    return frag_default;
            }
        }

        //Return the number of pages.
        @Override
        public int getCount() {
            return 3;
        }


    }

