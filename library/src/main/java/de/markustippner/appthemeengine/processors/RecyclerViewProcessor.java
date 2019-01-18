package de.markustippner.appthemeengine.processors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import de.markustippner.appthemeengine.Config;
import de.markustippner.appthemeengine.util.EdgeGlowUtil;

public class RecyclerViewProcessor implements Processor<RecyclerView, Void> {

    @Override
    public void process(@NonNull Context context, @Nullable String key, @Nullable RecyclerView target, @Nullable Void extra) {
        if (target == null) return;
        EdgeGlowUtil.setEdgeGlowColor(target, Config.accentColor(context, key), null);
    }
}
