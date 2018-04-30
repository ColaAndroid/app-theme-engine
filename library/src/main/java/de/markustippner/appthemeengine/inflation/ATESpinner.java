package de.markustippner.appthemeengine.inflation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import de.markustippner.appthemeengine.ATEActivity;
import de.markustippner.appthemeengine.tagprocessors.ATEDefaultTags;

public class ATESpinner extends AppCompatSpinner implements ViewInterface {

    public ATESpinner(Context context) {
        super(context);
        init(context, null);
    }

    public ATESpinner(Context context, int mode) {
        super(context, mode);
        init(context, null);
    }

    public ATESpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null);
    }

    public ATESpinner(Context context, AttributeSet attrs, @Nullable ATEActivity keyContext) {
        super(context, attrs);
        init(context, keyContext);
    }

    public ATESpinner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, null);
    }

    private void init(Context context, @Nullable ATEActivity keyContext) {
        ATEDefaultTags.process(this);
        try {
            ATEViewUtil.init(keyContext, this, context);
        } catch (Throwable t) {
            throw new RuntimeException(t.getMessage(), t);
        }
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