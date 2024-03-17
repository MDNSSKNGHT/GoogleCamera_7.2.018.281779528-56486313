package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: prs  reason: default package */
/* loaded from: classes.dex */
final class prs extends pwx {
    private final /* synthetic */ pwx a;

    public prs(pwx pwxVar) {
        this.a = pwxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getKey();
    }
}