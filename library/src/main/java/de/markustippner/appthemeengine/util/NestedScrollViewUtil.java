package de.markustippner.appthemeengine.util;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

public final class NestedScrollViewUtil {

    // External class is used after checking if NestedScrollView is on the class path. Avoids compile errors.
    public static boolean isNestedScrollView(View view) {
        return view instanceof NestedScrollView;
    }

    private NestedScrollViewUtil() {
    }
}
