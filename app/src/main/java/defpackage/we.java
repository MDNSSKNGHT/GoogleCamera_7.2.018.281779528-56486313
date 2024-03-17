package defpackage;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public final class we extends Resources {
    public we(AssetManager assets, DisplayMetrics metrics, Configuration config) {
        super(assets, metrics, config);
    }

    @Override
    public Drawable getDrawable(int i) {
        throw null;
    }
}