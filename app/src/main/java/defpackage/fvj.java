package defpackage;

/* compiled from: PG */
/* renamed from: fvj  reason: default package */
/* loaded from: classes.dex */
final class fvj implements mjw {
    private boolean a = true;
    private final /* synthetic */ fvl b;

    public fvj(fvl fvlVar) {
        this.b = fvlVar;
    }

    @Override // defpackage.mjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        meo meoVar;
        ilv ilvVar = (ilv) obj;
        synchronized (this.b.f) {
            ilv ilvVar2 = ilv.FPS_AUTO;
            int ordinal = ilvVar.ordinal();
            if (ordinal == 0) {
                meoVar = meo.FPS_AUTO;
            } else if (ordinal == 1) {
                meoVar = meo.FPS_30;
            } else if (ordinal != 2) {
                String valueOf = String.valueOf(ilvVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Unsupported FPS option ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                meoVar = meo.FPS_60;
            }
            if (this.a) {
                this.a = false;
                this.b.c.a(meoVar);
                return;
            }
            fvl fvlVar = this.b;
            if (meoVar != fvlVar.c.c) {
                String str = fvl.a;
                String valueOf2 = String.valueOf(fvlVar.c.c);
                String valueOf3 = String.valueOf(meoVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 22 + String.valueOf(valueOf3).length());
                sb2.append("changeCaptureRate ");
                sb2.append(valueOf2);
                sb2.append(" -> ");
                sb2.append(valueOf3);
                sb2.toString();
                liu.b(str);
                fvlVar.c.a(meoVar);
                fvlVar.b.a(klw.VIDEO).a(meoVar);
                ((khu) fvlVar.d).a().e.a(klw.VIDEO, new fvi(fvlVar, meoVar));
            } else {
                String str2 = fvl.a;
                String valueOf4 = String.valueOf(meoVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 67);
                sb3.append("changeCaptureRate() do nothing since captureRate [");
                sb3.append(valueOf4);
                sb3.append("] does not change");
                liu.a(str2, sb3.toString());
            }
        }
    }
}
