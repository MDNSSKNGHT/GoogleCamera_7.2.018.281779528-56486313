package defpackage;

/* compiled from: PG */
/* renamed from: kax  reason: default package */
/* loaded from: classes.dex */
final class kax implements qpe {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ kay f;

    public kax(kay kayVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f = kayVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kax.b():void");
    }

    private final void a() {
        this.f.e(klw.IMAX);
        this.f.e(klw.PHOTO_SPHERE);
        if (!this.a && this.b && !this.c) {
            this.f.e(klw.PHOTOBOOTH);
        }
        this.f.e(klw.SLOW_MOTION);
        this.f.e(klw.TIME_LAPSE);
        if (this.d) {
            this.f.e(klw.ORNAMENT);
        }
        if (this.c) {
            this.f.e(klw.TIARA);
        }
        if (this.e) {
            this.f.e(klw.MEASURE);
        }
    }

    @Override // defpackage.qpe
    public final void a(Throwable th) {
        String str = kay.a;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Failed to add Lens entry: ");
        sb.append(valueOf);
        liu.a(str, sb.toString());
        this.f.h.b("FinalizeMoreModes");
        a();
        b();
        this.f.h.a();
    }

    @Override // defpackage.qpe
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.f.h.b("FinalizeMoreModes");
        a();
        if (((Boolean) obj).booleanValue()) {
            this.f.e(klw.LENS);
        }
        b();
        this.f.h.a();
    }
}
