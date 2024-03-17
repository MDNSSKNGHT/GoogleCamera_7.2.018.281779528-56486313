package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: mnw  reason: default package */
/* loaded from: classes.dex */
public final class mnw {
    public mom a;
    public mom b;
    public mom c;
    public mom d;
    private mzc e;
    private moh f;
    private mom g;
    private prm h;
    private prr i;
    private psj j;
    private psl k;
    private mmf l;
    private osu m;

    public mnw(byte b) {
    }

    public final psj b() {
        if (this.j == null) {
            this.j = psl.l();
        }
        return this.j;
    }

    public final void a(mzc mzcVar) {
        if (mzcVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.e = mzcVar;
    }

    public final void a(osu osuVar) {
        if (osuVar == null) {
            throw new NullPointerException("Null frameListener");
        }
        this.m = osuVar;
    }

    public final void a(moh mohVar) {
        if (mohVar == null) {
            throw new NullPointerException("Null operatingMode");
        }
        this.f = mohVar;
    }

    public final void a(mom momVar) {
        if (momVar == null) {
            throw new NullPointerException("Null repeatingCaptureTemplate");
        }
        this.g = momVar;
    }

    public mnw() {
    }

    public final void a(Set set) {
        b().b((Iterable) set);
    }

    public final void a(mou mouVar) {
        if (this.h == null) {
            this.h = prr.g();
        }
        this.h.c(mouVar);
    }

    public final mnx a() {
        pjz pjzVar;
        mmf mmfVar = this.l;
        if (mmfVar != null) {
            pjzVar = pjz.b(mmfVar);
        } else {
            pjzVar = pix.a;
        }
        if (!pjzVar.a()) {
            this.l = new mmg();
        }
        prm prmVar = this.h;
        if (prmVar != null) {
            this.i = prmVar.a();
        } else if (this.i == null) {
            this.i = prr.c();
        }
        psj psjVar = this.j;
        if (psjVar != null) {
            this.k = psjVar.a();
        } else if (this.k == null) {
            this.k = pvi.a;
        }
        String str = this.e == null ? " cameraId" : "";
        if (this.f == null) {
            str = str.concat(" operatingMode");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" template");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" captureTemplate");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" reprocessingTemplate");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" repeatingTemplate");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" repeatingCaptureTemplate");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" frameListener");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" fatalErrorHandler");
        }
        if (str.isEmpty()) {
            mnc mncVar = new mnc(this.e, this.f, this.a, this.b, this.c, this.d, this.g, this.m, this.i, this.k, this.l, (byte) 0, (byte) 0);
            int size = mncVar.b.size();
            if (mncVar.a == moh.HIGH_SPEED) {
                moh mohVar = moh.HIGH_SPEED;
                if (size > 2) {
                    throw new IllegalStateException(qdu.a("At most 2 surfaces are supported in %s, but we get %s", mohVar, Integer.valueOf(size)));
                }
                pwy d = mncVar.b.d();
                while (d.hasNext()) {
                    mou mouVar = (mou) d.next();
                    qdu.b(mouVar.a() == mov.SURFACE || mouVar.a() == mov.SURFACE_DEFERRED || mouVar.a() == mov.SURFACE_VIEW || mouVar.a() == mov.SURFACE_TEXTURE, "Streams in highspeed operating mode must be a viewfinder or MediaRecorder/MediaCodec surface.");
                }
            }
            qdu.b(size > 0, "At least one stream should be provided");
            return mncVar;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }
}