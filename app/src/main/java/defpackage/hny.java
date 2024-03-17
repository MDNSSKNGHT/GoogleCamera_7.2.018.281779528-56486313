package defpackage;

/* compiled from: PG */
/* renamed from: hny  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hny implements mjw {
    private final hnz a;
    private final mnu b;
    private final pjz c;
    private final pjz d;
    private final boolean e;
    private final mcs f;

    public hny(hnz hnzVar, mnu mnuVar, pjz pjzVar, pjz pjzVar2, boolean z, mcs mcsVar) {
        this.a = hnzVar;
        this.b = mnuVar;
        this.c = pjzVar;
        this.d = pjzVar2;
        this.e = z;
        this.f = mcsVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        hnz hnzVar = this.a;
        mnu mnuVar = this.b;
        pjz pjzVar = this.c;
        pjz pjzVar2 = this.d;
        boolean z = this.e;
        mcs mcsVar = this.f;
        String str = (String) obj;
        String str2 = hnz.a;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Setting FrameBuffer for camera ".concat(valueOf);
        } else {
            new String("Setting FrameBuffer for camera ");
        }
        liu.b(str2);
        synchronized (hnzVar) {
            if (hnzVar.h) {
                return;
            }
            hnzVar.g.b(hnzVar.i);
            if (hnzVar.b.equals(str)) {
                mnk mnkVar = hnzVar.f;
                if (mnkVar != null) {
                    mnkVar.close();
                    hnzVar.f = null;
                }
                if (hnzVar.e == null) {
                    hnzVar.e = mnuVar.a((mnz) pjzVar.b(), 1);
                }
                hnzVar.g = hnzVar.e;
            } else if (hnzVar.c.equals(str)) {
                hnzVar.f = mnuVar.a((mnz) pjzVar2.b(), 1);
                hnzVar.g = hnzVar.f;
                if (!z || ((Boolean) mcsVar.a()).booleanValue()) {
                    hnzVar.a(((Boolean) mcsVar.a()).booleanValue());
                }
            }
            hnzVar.g.a(hnzVar.i);
        }
    }
}