package com.hfad.something;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fa) {
        super(fa);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new StatsFragment();
            case 1:
                return new SignSymptomFragment();
            default:
                return new StatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2; // Number of pages for a ViewPager
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "STATISTICS";
            case 1:
                return "SIGNS & SYMPTOMS";
            default:
                return null;
        }
    }
}