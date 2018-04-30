package de.markustippner.appthemeengine.util;

import android.support.design.widget.TabLayout;
import android.view.View;

public final class TabLayoutUtil {

    // External class is used after checking if TabLayout is on the class path. Avoids compile errors.
    public static boolean isTabLayout(View view) {
        return view instanceof TabLayout;
    }

    private TabLayoutUtil() {
    }
}