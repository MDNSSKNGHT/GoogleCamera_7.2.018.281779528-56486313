package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gha  reason: default package */
/* loaded from: classes.dex */
public final class gha {
    private final String a;

    public gha(String str) {
        qdu.d(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof gha) && this.a.equals(((gha) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a("name", this.a);
        return e.toString();
    }
}