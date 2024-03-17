package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* renamed from: mbd  reason: default package */
/* loaded from: classes.dex */
final class mbd extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return Boolean.valueOf(Looper.getMainLooper().isCurrentThread());
    }
}