package com.akram.tourguideapp;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CultureFragment();
            case 1:
                return new ParksFragment();
            case 2:
                return new MonumentsFragment();
            case 3:
                return new ShoppingFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_culture);
            case 1:
                return mContext.getString(R.string.category_parks);
            case 2:
                return mContext.getString(R.string.category_monuments);
            case 3:
                return mContext.getString(R.string.category_shopping);
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}
