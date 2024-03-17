package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: opg  reason: default package */
/* loaded from: classes.dex */
final class opg extends ContentObserver {
    public opg() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ops.a();
    }
}