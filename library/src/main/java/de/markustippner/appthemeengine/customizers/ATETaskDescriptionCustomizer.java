package de.markustippner.appthemeengine.customizers;

import android.graphics.Bitmap;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;

public interface ATETaskDescriptionCustomizer {

    @ColorInt
    int getTaskDescriptionColor();

    /**
     * Return null to use the default (app's launcher icon)
     */
    @Nullable
    Bitmap getTaskDescriptionIcon();
}
