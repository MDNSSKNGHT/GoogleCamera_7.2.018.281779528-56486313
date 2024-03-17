package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: oep  reason: default package */
/* loaded from: classes.dex */
public final class oep extends oeq {
    private final AutoCloseable b;

    public oep(oes oesVar, AutoCloseable autoCloseable) {
        super(oesVar);
        this.b = autoCloseable;
    }

    @Override // defpackage.oeq, defpackage.oes
    public final void a(int i) {
        try {
            this.b.close();
        } catch (Exception e) {
            Log.w("CloseOnStopListener", "Exception while trying to close object.", e);
        }
        super.a(i);
    }
}