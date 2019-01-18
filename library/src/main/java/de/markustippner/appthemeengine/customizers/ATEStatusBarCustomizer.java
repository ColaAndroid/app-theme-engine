package de.markustippner.appthemeengine.customizers;

import android.support.annotation.ColorInt;
import de.markustippner.appthemeengine.Config;

public interface ATEStatusBarCustomizer {

    @ColorInt
    int getStatusBarColor();

    @Config.LightStatusBarMode
    int getLightStatusBarMode();
}
