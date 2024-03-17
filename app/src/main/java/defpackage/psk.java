package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: psk  reason: default package */
/* loaded from: classes.dex */
final class psk implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    public psk(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return psl.a(this.a);
    }
}