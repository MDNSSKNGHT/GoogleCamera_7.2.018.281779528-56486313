package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: lzn  reason: default package */
/* loaded from: classes.dex */
final class lzn extends ContentObserver {
    public lzn() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        lzo.d.set(true);
    }
}