package de.andacaydin.bidirectionalviewpagerlibrary;

import android.support.v4.app.Fragment;

/**
 * Created by andacaydin on 05.05.14.
 */
public abstract class BiDirectionalFragment extends Fragment{

    public abstract Class getLeftFragment();
    public abstract Class getRightFragment();
    public abstract Class getTopFragment();
    public abstract Class getBottomFragment();

    public BiDirectionalFragment(){

    }

}
