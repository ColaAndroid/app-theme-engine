package de.markustippner.appthemeenginesample.widgets;

import android.os.Bundle;
import de.markustippner.appthemeenginesample.R;
import de.markustippner.appthemeenginesample.base.BaseThemedActivity;

public class WidgetActivity extends BaseThemedActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        findViewById(R.id.seek_disabled).setEnabled(false);
    }
}
