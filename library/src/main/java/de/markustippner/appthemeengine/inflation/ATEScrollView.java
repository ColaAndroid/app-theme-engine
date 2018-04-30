package de.markustippner.appthemeengine.inflation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ScrollView;
import de.markustippner.appthemeengine.ATEActivity;
import de.markustippner.appthemeengine.tagprocessors.ATEDefaultTags;

class ATEScrollView extends ScrollView implements ViewInterface {

    public ATEScrollView(Context context) {
        super(context);
        init(context, null);
    }

    public ATEScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null);
    }

    public ATEScrollView(Context context, AttributeSet attrs, @Nullable ATEActivity keyContext) {
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

    @Override
    public boolean setsStatusBarColor() {
        return false;
    }

    @Override
    public boolean setsToolbarColor() {
        return false;
    }
}