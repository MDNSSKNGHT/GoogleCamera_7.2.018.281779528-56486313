package defpackage;

/* compiled from: PG */
/* renamed from: rgh  reason: default package */
/* loaded from: classes2.dex */
public final class rgh implements rgg, rfv {
    private final Object a;

    static {
        new rgh(null);
    }

    @Override // defpackage.rhd
    public final Object get() {
        return this.a;
    }

    private rgh(Object obj) {
        this.a = obj;
    }

    public static rgg a(Object obj) {
        return new rgh(rgk.a(obj, "instance cannot be null"));
    }
}