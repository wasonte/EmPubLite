package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.support.v13.app.FragmentStatePagerAdapter;

/**
 * Created by jorge.alcolea on 30/03/2016.
 */
public class ContentsAdapter extends FragmentStatePagerAdapter {

    public ContentsAdapter(Activity ctxt){
        super(ctxt.getFragmentManager());
    }

    @Override
    public Fragment getItem(int arg0){
        //TODO
        return null;
    }

    @Override
    public int getCount(){
        // TODO
        return 0;
    }
}
