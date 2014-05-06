package de.andacaydin.bidirectionalfragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import de.andacaydin.bidirectionalviewpagerlibrary.BiDirectionalPagerAdapter;
import de.andacaydin.bidirectionalviewpagerlibrary.BiDirectionalViewPager;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up the pager
        final BiDirectionalViewPager pager = (BiDirectionalViewPager)findViewById(R.id.pager);

        ArrayList<Class> fragmentClasses = new ArrayList<Class>();

        fragmentClasses.add(TestFragment.class);
        fragmentClasses.add(TestFragment2.class);
        fragmentClasses.add(TestFragment3.class);
        fragmentClasses.add(TestFragment4.class);
        //Set up the pager
         BiDirectionalPagerAdapter pagerAdapter = new BiDirectionalPagerAdapter(getSupportFragmentManager(),fragmentClasses, this);

        pager.setAdapter(pagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
