package de.markustippner.appthemeengine.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;
import de.markustippner.appthemeengine.ATE;
import de.markustippner.appthemeengine.R;

@PreMadeView
public class ATEEditText extends EditText {

    public ATEEditText(Context context) {
        super(context);
        init(context, null);
    }

    public ATEEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ATEEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ATEEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        setTag("tint_accent_color,text_primary");
        String key = null;
        if (attrs != null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ATEEditText, 0, 0);
            try {
                key = a.getString(R.styleable.ATEEditText_ateKey_editText);
            } finally {
                a.recycle();
            }
        }
        ATE.apply(context, this, key);
    }
}
