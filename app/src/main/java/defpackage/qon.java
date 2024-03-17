package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: qon  reason: default package */
/* loaded from: classes2.dex */
public final class qon implements Callable {
    private final /* synthetic */ Object a;

    public qon(Object obj) {
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}