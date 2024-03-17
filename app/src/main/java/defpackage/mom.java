package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: mom  reason: default package */
/* loaded from: classes.dex */
public final class mom {
    public final int a;
    public final prr b;
    private final prr c;

    public mom(int i) {
        this(i, prr.c(), prr.c());
    }

    private mom(int i, prr prrVar, prr prrVar2) {
        this.a = i;
        this.b = prrVar;
        this.c = prrVar2;
    }

    public mom(int i, List list) {
        this(i, prr.a((Collection) list), prr.c());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mom) {
            mom momVar = (mom) obj;
            if (this.a == momVar.a && Objects.equals(this.c, momVar.c) && Objects.equals(this.b, momVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.c, this.b);
    }
}