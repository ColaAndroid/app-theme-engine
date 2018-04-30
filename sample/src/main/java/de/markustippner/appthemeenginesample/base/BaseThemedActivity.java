package de.markustippner.appthemeenginesample.base;

import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import de.markustippner.appthemeengine.ATEActivity;

public class BaseThemedActivity extends ATEActivity {

    @Nullable
    @Override
    public final String getATEKey() {
        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", false) ?
                "dark_theme" : "light_theme";
    }
}
