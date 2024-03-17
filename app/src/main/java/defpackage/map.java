package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: map  reason: default package */
/* loaded from: classes.dex */
public final class map implements mjw {
    public final mjw a;
    private final Executor b;

    public map(mjw mjwVar, Executor executor) {
        this.a = mjwVar;
        this.b = executor;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        this.b.execute(new mao(this, obj));
    }
}
