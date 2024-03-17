package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: puz  reason: default package */
/* loaded from: classes.dex */
final class puz implements Serializable {
    private final puu a;
    private final ppz b;

    public /* synthetic */ puz(puu puuVar, ppz ppzVar) {
        this.a = puuVar;
        this.b = ppzVar;
    }

    private Object readResolve() {
        return new pva(this.a, this.b);
    }
}