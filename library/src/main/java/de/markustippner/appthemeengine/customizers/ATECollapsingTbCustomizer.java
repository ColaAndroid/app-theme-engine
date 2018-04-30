package de.markustippner.appthemeengine.customizers;

import android.support.annotation.ColorInt;

public interface ATECollapsingTbCustomizer {

    @ColorInt
    int getCollapsedTintColor();

    @ColorInt
    int getExpandedTintColor();
}
