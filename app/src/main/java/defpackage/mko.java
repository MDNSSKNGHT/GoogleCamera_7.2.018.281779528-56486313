package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: mko  reason: default package */
/* loaded from: classes.dex */
public final class mko {
    public RectF a;
    public int b;
    public mjo c;
    public boolean d;
    public Matrix e;
    public Rect f;
    public mjs g;

    public final boolean a(Rect rect) {
        Rect rect2 = this.f;
        if (rect2 == null || !rect.equals(rect2) || this.e == null) {
            String valueOf = String.valueOf(rect);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Setting crop region to ");
            sb.append(valueOf);
            sb.toString();
            this.f = rect;
            a();
            return true;
        }
        return false;
    }

    public final Matrix b() {
        return (Matrix) qdu.d(this.e);
    }

    public final void a() {
        int width;
        int width2;
        Rect rect = this.f;
        if (rect != null && this.g != null && this.c != null && this.a != null) {
            Matrix matrix = new Matrix();
            this.e = matrix;
            matrix.postTranslate(-rect.centerX(), -rect.centerY());
            if (rect.width() / rect.height() > this.g.c()) {
                width = (int) (rect.height() * this.g.c());
                width2 = rect.height();
            } else {
                width = rect.width();
                width2 = (int) (rect.width() / this.g.c());
            }
            this.e.postRotate(this.b - this.c.a());
            if (this.c != mjo.CLOCKWISE_0 && this.c != mjo.CLOCKWISE_180) {
                this.e.postScale(1.0f, this.d ? -1.0f : 1.0f);
            } else {
                this.e.postScale(this.d ? -1.0f : 1.0f, 1.0f);
            }
            RectF rectF = new RectF(0.0f, 0.0f, width, width2);
            this.e.mapRect(rectF);
            this.e.postScale(this.a.width() / rectF.width(), this.a.height() / rectF.height());
            this.e.postTranslate(this.a.width() / 2.0f, this.a.height() / 2.0f);
        }
    }
}