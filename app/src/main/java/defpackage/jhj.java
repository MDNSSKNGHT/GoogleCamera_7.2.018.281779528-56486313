package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.SizeF;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;

/* compiled from: PG */
/* renamed from: jhj  reason: default package */
/* loaded from: classes.dex */
final class jhj extends oro {
    private final /* synthetic */ mnh a;
    private final /* synthetic */ jhl b;

    public jhj(jhl jhlVar, mnh mnhVar) {
        this.b = jhlVar;
        this.a = mnhVar;
    }

    @Override // defpackage.oro
    public final void c() {
        jkm jkmVar;
        if (!this.b.c.get() || this.a.c() == null) {
            return;
        }
        if (this.b.w.a()) {
            ndn ndnVar = (ndn) qdu.d(this.a.c());
            jhl jhlVar = this.b;
            myo myoVar = jhlVar.D;
            if (jhlVar.i.f()) {
                String str = (String) qdu.d((String) ndnVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID));
                ndnVar = knj.a(str, (ndr) ndnVar);
                myoVar = this.b.E.a(str);
                mch mchVar = new mch((Float) this.b.q.a());
                if (this.b.E.b(str)) {
                    mchVar.a(Float.valueOf(Math.max(1.0f, ((Float) mchVar.c).floatValue() / 1.615f)));
                }
                jhl jhlVar2 = this.b;
                jhlVar2.K = new gtl(mchVar, myoVar, mix.a(jhlVar2.f.b()));
            }
            jkw jkwVar = new jkw((byte) 0);
            ndn ndnVar2 = (ndn) qdu.d(ndnVar);
            if (ndnVar2 == null) {
                throw new NullPointerException("Null metadata");
            }
            jkwVar.a = ndnVar2;
            jkwVar.e = Integer.valueOf(this.b.b.e(cit.S));
            jkwVar.d = Boolean.valueOf(this.b.b.d(cit.R));
            Rect e = myoVar.e();
            if (e != null) {
                jkwVar.b = e;
                SizeF sizeF = (SizeF) myoVar.b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                if (sizeF != null) {
                    jkwVar.c = sizeF;
                    jkwVar.f = Float.valueOf(((Float) this.b.q.a()).floatValue());
                    Rect rect = ((gtk) this.b.K.a()).a;
                    if (rect != null) {
                        jkwVar.g = rect;
                        String str2 = jkwVar.a == null ? " metadata" : "";
                        if (jkwVar.b == null) {
                            str2 = str2.concat(" sensorInfoActiveArraySize");
                        }
                        if (jkwVar.c == null) {
                            str2 = String.valueOf(str2).concat(" sensorInfoPhysicalSize");
                        }
                        if (jkwVar.d == null) {
                            str2 = String.valueOf(str2).concat(" supportOis");
                        }
                        if (jkwVar.e == null) {
                            str2 = String.valueOf(str2).concat(" oisApiVersion");
                        }
                        if (jkwVar.f == null) {
                            str2 = String.valueOf(str2).concat(" digitalZoomRatio");
                        }
                        if (jkwVar.g == null) {
                            str2 = String.valueOf(str2).concat(" cropRegion");
                        }
                        if (!str2.isEmpty()) {
                            String valueOf = String.valueOf(str2);
                            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                        }
                        jkmVar = new jkm(jkwVar.a, jkwVar.b, jkwVar.c, jkwVar.d.booleanValue(), jkwVar.e.intValue(), jkwVar.f.floatValue(), jkwVar.g);
                    } else {
                        throw new NullPointerException("Null cropRegion");
                    }
                } else {
                    throw new NullPointerException("Null sensorInfoPhysicalSize");
                }
            } else {
                throw new NullPointerException("Null sensorInfoActiveArraySize");
            }
        } else {
            jkmVar = null;
        }
        jgo jgoVar = this.b.t;
        ndr ndrVar = (ndr) qdu.d(this.a.c());
        cin cinVar = jgoVar.h;
        cio cioVar = cjm.a;
        cinVar.b();
        jhl jhlVar3 = this.b;
        jfz jfzVar = jhlVar3.k;
        mnh mnhVar = this.a;
        pjz c = pjz.c(jkmVar);
        jfzVar.x.b();
        neb a = mnhVar.a((mos) qdu.d(jhlVar3.M));
        if (a == null) {
            liu.b(jfz.a, "onImageAvailable() imageProxy is null");
            mnhVar.close();
            return;
        }
        boolean z = jfzVar.w.b() && jfzVar.c.get();
        if (c.a()) {
            jfzVar.w.a(jfzVar.r.get(), mnhVar, a, (jkx) c.b(), jfzVar.a(jfzVar.r.get(), jfzVar.J.e, jfzVar.f.a(), false, (pjz) pix.a) && z, pjz.b(z));
        } else {
            int c2 = a.c();
            int d = a.d();
            int rowStride = ((nea) a.e().get(0)).getRowStride();
            int rowStride2 = ((nea) a.e().get(2)).getRowStride();
            ((nea) a.e().get(0)).getBuffer().position(0);
            ((nea) a.e().get(2)).getBuffer().position(0);
            FrameUtilNative.convertNV21ToNV12(((nea) a.e().get(0)).getBuffer(), rowStride, ((nea) a.e().get(2)).getBuffer(), rowStride2, c2, d);
            jfzVar.a(jfzVar.r.get(), mnhVar, a, pix.a, pix.a);
        }
        if (z) {
            if (!jfzVar.e.get()) {
                jfzVar.r.incrementAndGet();
            } else {
                jfzVar.e.set(false);
            }
        }
        jfzVar.p.incrementAndGet();
    }

    @Override // defpackage.oro
    public final void a(ndr ndrVar) {
        if (ndrVar != null) {
            jhl jhlVar = this.b;
            if (jhlVar.y) {
                jhlVar.s.a(ndrVar);
                float[] fArr = (float[]) ndrVar.a(lao.g);
                if (fArr != null) {
                    this.b.u.k.a(fArr);
                }
            }
        }
    }
}
