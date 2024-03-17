package defpackage;

/* compiled from: PG */
/* renamed from: crc */
/* loaded from: classes.dex */
public final class crc implements rgg {
    private final rhd a;
    private final rhd b;

    public crc(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public final crb a() {
        return new crb(((dzs) this.a).a(), (mbe) this.b.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}