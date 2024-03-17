package defpackage;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: gtb  reason: default package */
/* loaded from: classes.dex */
public final class gtb {
    public final mzu a;
    public final mjs b;
    public final Rect c;
    private final mzu d;

    private /* synthetic */ gtb(mzu mzuVar, mzu mzuVar2, mjs mjsVar, Rect rect) {
        this.a = mzuVar;
        this.d = mzuVar2;
        this.b = mjsVar;
        this.c = rect;
    }

    public final mjs a() {
        return this.d.b;
    }

    public static gtb a(myo myoVar, mjs mjsVar, int i) throws gsz {
        gta gtaVar = new gta(myoVar, mjsVar, i);
        List<mjs> a = gtaVar.a.a(gtaVar.c);
        if (!a.isEmpty()) {
            mjs mjsVar2 = gtaVar.b;
            qdu.d(!a.isEmpty());
            mjs mjsVar3 = null;
            long j = Long.MAX_VALUE;
            for (mjs mjsVar4 : a) {
                long b = mjsVar4.b();
                if (mjsVar4.a >= mjsVar2.a && mjsVar4.b >= mjsVar2.b && b < j) {
                    mjsVar3 = mjsVar4;
                    j = b;
                }
            }
            if (mjsVar3 == null) {
                mjsVar3 = fpp.a(a);
            }
            return new gtb(new mzu(gtaVar.c, mjsVar3), new mzu(gtaVar.c, fpp.a(a)), gtaVar.b, mix.a(gtaVar.b).a(new Rect(0, 0, mjsVar3.a, mjsVar3.b)));
        }
        int i2 = gtaVar.c;
        StringBuilder sb = new StringBuilder(50);
        sb.append("No picture sizes supported for format: ");
        sb.append(i2);
        throw new gsz(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gtb) {
                gtb gtbVar = (gtb) obj;
                if (this.b.equals(gtbVar.b) && this.d.equals(gtbVar.d) && this.a.equals(gtbVar.a) && this.c.equals(gtbVar.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, this.a, this.c});
    }

    public final String toString() {
        pjy a = qdu.a("PictureSizeCalculator.Configuration");
        a.a("desired size", this.b);
        a.a("large image reader", this.a);
        a.a("full-size image reader", this.d);
        a.a("crop", this.c);
        return a.toString();
    }
}