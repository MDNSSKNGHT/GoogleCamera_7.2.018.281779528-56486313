package defpackage;

import j$.util.function.Supplier;

/* compiled from: PG */
/* renamed from: kdn  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class kdn implements Supplier {
    private final ked a;

    public kdn(ked kedVar) {
        this.a = kedVar;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        String valueOf = String.valueOf(this.a.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Could not find longest duration among animators ");
        sb.append(valueOf);
        return new IllegalStateException(sb.toString());
    }
}