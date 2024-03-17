package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: pla  reason: default package */
/* loaded from: classes.dex */
public final class pla implements Serializable, pkx {
    public static final long serialVersionUID = 0;
    private final Object a;

    public pla(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.pkx
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pla) {
            return qdu.e(this.a, ((pla) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}