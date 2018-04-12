package Fragments_Functionality;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mostafayehya on 26/03/18.
 */


    public class CategoryAdapter extends FragmentPagerAdapter {

        public CategoryAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new DiscoverSkillsFragment();
                case 1:
                    return new CurrentSkillsFragment();

                default:
                    return new DiscoverSkillsFragment();

            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Discover";
                case 1:
                    return "Enrolled";
                case 2:
                    return "Assessments";
                default:
                    return "Discover";
            }
        }
}
