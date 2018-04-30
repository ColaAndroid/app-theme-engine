package de.markustippner.appthemeengine.util;

import android.support.v4.view.ViewPager;
import android.view.View;

public final class ViewPagerUtil {

    // External class is used after checking if ViewPager is on the class path. Avoids compile errors.
    public static boolean isViewPager(View view) {
        return view instanceof ViewPager;
    }

    private ViewPagerUtil() {
    }
}