package com.bignerdranch.android.sunset;

import android.support.v4.app.Fragment;

/**
 * Created by TMiller on 8/29/2016.
 */
public class SunsetActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}
