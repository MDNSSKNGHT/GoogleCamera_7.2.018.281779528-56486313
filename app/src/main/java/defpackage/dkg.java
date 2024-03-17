package defpackage;

/* compiled from: PG */
/* renamed from: dkg  reason: default package */
/* loaded from: classes.dex */
public final class dkg {
    private final koe a;

    public dkg(koe koeVar) {
        this.a = koeVar;
    }

    public final boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.a.a("2.13");
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(98);
        sb.append("Photos version is checked and gallery will be supported ");
        sb.append(a);
        sb.append(", which costs ");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        sb.append(" ms");
        sb.toString();
        liu.b("PhotosOemApiDet");
        return a;
    }
}
