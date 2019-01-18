package de.markustippner.appthemeengine.prefs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.afollestad.materialdialogs.prefs.MaterialEditTextPreference;
import de.markustippner.appthemeengine.ATE;
import de.markustippner.appthemeengine.Config;
import de.markustippner.appthemeengine.R;

public class ATEEditTextPreference extends MaterialEditTextPreference {

    public ATEEditTextPreference(Context context) {
        super(context);
        init(context, null);
    }

    public ATEEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ATEEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public ATEEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private String mKey;

    private void init(Context context, AttributeSet attrs) {
        setLayoutResource(R.layout.ate_preference_custom);

        if (attrs != null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ATEEditTextPreference, 0, 0);
            try {
                mKey = a.getString(R.styleable.ATEEditTextPreference_ateKey_pref_editText);
            } finally {
                a.recycle();
            }
        }

        if (!Config.usingMaterialDialogs(context, mKey)) {
            ATE.config(context, mKey)
                    .usingMaterialDialogs(true)
                    .commit();
        }
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        ATE.apply(view, mKey);
    }
}
