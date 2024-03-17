package defpackage;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

final class vr extends vi {
    public vr(AssetManager assets, DisplayMetrics metrics, Configuration config) {
        super(assets, metrics, config);
    }

    @Override
    public Drawable getDrawable(int i) {
        throw null;
    }
}