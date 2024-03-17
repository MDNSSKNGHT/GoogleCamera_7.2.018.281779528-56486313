package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: blv  reason: default package */
/* loaded from: classes.dex */
public final class blv {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Executor b;
    public final Executor c;
    public final rhd d;
    public final rhd e;

    public blv(rhd rhdVar, rhd rhdVar2, Executor executor, Executor executor2) {
        this.b = executor;
        this.c = executor2;
        this.d = rhdVar;
        this.e = rhdVar2;
    }
}