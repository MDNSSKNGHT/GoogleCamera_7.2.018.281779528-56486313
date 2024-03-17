package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: bdb  reason: default package */
/* loaded from: classes.dex */
public class bdb extends mrx {
    private final gdl a;
    private final gej b;
    private final beo c;
    private final boolean d;

    public bdb(gdl gdlVar, gej gejVar, beo beoVar, boolean z) {
        super((byte) 0);
        this.a = gdlVar;
        this.b = gejVar;
        this.c = beoVar;
        this.d = z;
    }

    protected boolean b(ndr ndrVar) {
        return false;
    }

    private final pjz c(ndr ndrVar) {
        pix pixVar;
        pjz pjzVar;
        pjz b;
        if (!this.d) {
            MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AF_REGIONS);
            if (meteringRectangleArr == null || meteringRectangleArr.length <= 0) {
                return pix.a;
            }
            MeteringRectangle meteringRectangle = meteringRectangleArr[0];
            return !meteringRectangle.getRect().isEmpty() ? pjz.b(ben.a(-2, meteringRectangle.getRect())) : pix.a;
        }
        beo beoVar = this.c;
        beoVar.b++;
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AF_REGIONS);
        if (meteringRectangleArr2 == null || meteringRectangleArr2.length == 0) {
            pixVar = pix.a;
        } else {
            Rect rect = meteringRectangleArr2[0].getRect();
            Face[] faceArr = (Face[]) ndrVar.a(CaptureResult.STATISTICS_FACES);
            if (faceArr != null) {
                pixVar = pix.a;
                for (Face face : faceArr) {
                    Rect bounds = face.getBounds();
                    if (Math.abs(rect.centerX() - bounds.centerX()) < 100 && Math.abs(rect.centerY() - bounds.centerY()) < 100) {
                        Rect bounds2 = face.getBounds();
                        if (bounds2.width() * bounds2.height() > 0) {
                            pixVar = (pix) pjz.b(face);
                        }
                    }
                }
            } else {
                pixVar = pix.a;
            }
        }
        if (pixVar.a()) {
            beoVar.a = ((Face) pixVar.b()).getId();
        }
        Face[] faceArr2 = (Face[]) ndrVar.a(CaptureResult.STATISTICS_FACES);
        if (faceArr2 != null && faceArr2.length > 0) {
            for (Face face2 : faceArr2) {
                if (beoVar.a == face2.getId()) {
                    b = pjz.b(ben.a(face2.getId(), new Rect(face2.getBounds())));
                    break;
                }
            }
        }
        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AF_REGIONS);
        if (meteringRectangleArr3 == null || meteringRectangleArr3.length == 0) {
            pjzVar = pix.a;
        } else {
            Face[] faceArr3 = (Face[]) ndrVar.a(CaptureResult.STATISTICS_FACES);
            if (faceArr3 == null || faceArr3.length == 0) {
                Rect rect2 = (Rect) ndrVar.a(CaptureResult.SCALER_CROP_REGION);
                Rect rect3 = meteringRectangleArr3[0].getRect();
                if (Math.abs(rect2.centerX() - rect3.centerX()) < 100 && Math.abs(rect3.centerY() - rect2.centerY()) < 100) {
                    pjzVar = pjz.b(new Rect(rect3.centerX() - 50, rect3.centerY() - 50, rect3.centerX() + 50, rect3.centerY() + 50));
                }
            }
            pjzVar = pix.a;
        }
        b = pjzVar.a() ? pjz.b(ben.a(-2, (Rect) pjzVar.b())) : pix.a;
        if (b.a()) {
            ben benVar = (ben) b.b();
            benVar.c();
            if (benVar.a() == beoVar.c) {
                return b;
            }
            if (beoVar.b > 15) {
                beoVar.b = 0;
                beoVar.c = benVar.a();
                return b;
            }
        }
        return pix.a;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        Rect rect;
        pix b;
        int i;
        if (ndrVar.a(CaptureResult.CONTROL_AF_MODE) != null) {
            int intValue = ((Integer) qdu.d((Integer) ndrVar.a(CaptureResult.CONTROL_AF_MODE))).intValue();
            ibi ibiVar = (ibi) ibi.d.get(Integer.valueOf(intValue));
            if (ibiVar == null) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("unknown metadata value: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
            ibi ibiVar2 = (ibi) qdu.d(ibiVar);
            ibj ibjVar = (ibj) qdu.d(ibj.a(((Integer) qdu.d((Integer) ndrVar.a(CaptureResult.CONTROL_AF_STATE))).intValue()));
            Float f = (Float) qdu.d((Float) ndrVar.a(CaptureResult.LENS_FOCUS_DISTANCE));
            boolean b2 = b(ndrVar);
            pjz c = c(ndrVar);
            if (c.a() && (rect = (Rect) ndrVar.a(CaptureResult.SCALER_CROP_REGION)) != null) {
                gej gejVar = this.b;
                Rect b3 = ((ben) c.b()).b();
                PointF pointF = new PointF(b3.exactCenterX(), b3.exactCenterY());
                PointF b4 = gejVar.a.b(new PointF((pointF.x - rect.left) / rect.width(), (pointF.y - rect.top) / rect.height()));
                gdi gdiVar = new gdi((byte) 0);
                gdiVar.a(false);
                gdiVar.b = -1;
                if (b4 == null) {
                    throw new NullPointerException("Null normalizedCenterPoint");
                }
                gdiVar.a = b4;
                gdiVar.a(((ben) c.b()).c());
                String str = gdiVar.a == null ? " normalizedCenterPoint" : "";
                if (gdiVar.b == null) {
                    str = str.concat(" confidenceScore");
                }
                if (gdiVar.c == null) {
                    str = String.valueOf(str).concat(" isFace");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                b = (pix) pjz.b(new gea(gdiVar.a, gdiVar.b.intValue(), gdiVar.c.booleanValue()));
            } else {
                b = pix.a;
            }
            pjz c2 = c(ndrVar);
            if (c2.a()) {
                Rect b5 = ((ben) c2.b()).b();
                i = (int) (Math.max(b5.width(), b5.height()) * (!this.d ? 1.0f : 1.3f));
            } else {
                i = 0;
            }
            this.a.a(new gdk(ibiVar2, ibjVar, f.floatValue(), b2, b, i));
        }
    }
}
