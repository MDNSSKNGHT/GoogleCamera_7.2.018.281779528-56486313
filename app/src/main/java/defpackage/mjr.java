package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: mjr  reason: default package */
/* loaded from: classes.dex */
public final class mjr implements mjq {
    private final List a = new ArrayList();

    public final void a(mjq mjqVar) {
        this.a.add(mjqVar);
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((mjq) list.get(i)).close();
        }
        this.a.clear();
    }
}