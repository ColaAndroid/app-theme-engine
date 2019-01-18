package de.markustippner.appthemeengine.customizers;

import android.support.annotation.ColorInt;
import de.markustippner.appthemeengine.Config;

public interface ATEToolbarCustomizer {

    @Config.LightToolbarMode
    int getLightToolbarMode();

    @ColorInt
    int getToolbarColor();
}
