package de.markustippner.appthemeengine.tagprocessors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import de.markustippner.appthemeengine.util.TypefaceHelper;

public class FontTagProcessor extends TagProcessor {

    public static final String PREFIX = "font";

    @Override
    public boolean isTypeSupported(@NonNull View view) {
        return view instanceof TextView;
    }

    @Override
    public void process(@NonNull Context context, @Nullable String key, @NonNull View view, @NonNull String suffix) {
        final TextView tv = (TextView) view;
        tv.setTypeface(TypefaceHelper.get(context, suffix));
    }
}