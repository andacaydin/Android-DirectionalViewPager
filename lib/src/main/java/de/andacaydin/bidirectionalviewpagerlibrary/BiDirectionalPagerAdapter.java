package de.andacaydin.bidirectionalviewpagerlibrary;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

import de.andacaydin.bidirectionalviewpagerlibrary.googlecode.FragmentStatePagerAdapter;

public class BiDirectionalPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Class> classes;
    private Context context;

    public BiDirectionalPagerAdapter(FragmentManager fm, ArrayList<Class> classes, Context context) {
        super(fm);
        this.classes = classes;
        this.context = context;
    }


    @Override
    public float getPageWidth(int position) {
        if (position == 3) {
            return (0.5f);
        } else return super.getPageWidth(position);
    }

    @Override
    public BiDirectionalFragment getItem(int index) {
       return  (BiDirectionalFragment) Fragment.instantiate(context,classes.get(index).getName());

    }


    @Override
    public int getCount() {
        return classes.size();
    }

    public int getItemPosition (Object object) { return POSITION_NONE; }
}