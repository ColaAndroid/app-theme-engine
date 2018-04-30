package de.markustippner.appthemeengine.inflation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import de.markustippner.appthemeengine.ATE;
import de.markustippner.appthemeengine.ATEActivity;
import de.markustippner.appthemeengine.tagprocessors.ATEDefaultTags;
import de.markustippner.appthemeengine.tagprocessors.TextColorTagProcessor;
import de.markustippner.appthemeengine.tagprocessors.TintTagProcessor;

public class ATESwitch extends SwitchCompat implements ViewInterface {

    public ATESwitch(Context context) {
        super(context);
        init(context, null);
    }

    public ATESwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null);
    }

    public ATESwitch(Context context, AttributeSet attrs, @Nullable ATEActivity keyContext) {
        super(context, attrs);
        init(context, keyContext);
    }

    private void init(Context context, @Nullable ATEActivity keyContext) {
        ATEDefaultTags.process(this);
        try {
            ATEViewUtil.init(keyContext, this, context);
        } catch (Throwable t) {
            throw new RuntimeException(t.getMessage(), t);
        }
    }

    public void setKey(String key) {
        ATE.themeView(getContext(), this, key);
    }

    @Override
    public boolean isShown() {
        return getParent() != null && getVisibility() == View.VISIBLE;
    }

    @Override
    public boolean setsStatusBarColor() {
        return false;
    }

    @Override
    public boolean setsToolbarColor() {
        return false;
    }
}
