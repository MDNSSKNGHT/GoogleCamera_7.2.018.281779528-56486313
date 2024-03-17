package defpackage;

/* compiled from: PG */
/* renamed from: hsu  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hsu implements mjq {
    private final hju a;
    private final osu b;

    public hsu(hju hjuVar, osu osuVar, byte b, byte b2) {
        this.a = hjuVar;
        this.b = osuVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.b(this.b);
    }
}