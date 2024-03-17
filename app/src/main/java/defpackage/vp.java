package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;

public final class vp extends ContextWrapper {
    public vp(Context base) {
        super(base);
    }

    public static Context a(Context context) {
        return context;
    }

    @Override
    public AssetManager getAssets() {
        throw null;
    }

    @Override
    public Resources getResources() {
        throw null;
    }

    @Override
    public Resources.Theme getTheme() {
        throw null;
    }

    @Override
    public void setTheme(int i) {
        throw null;
    }
}