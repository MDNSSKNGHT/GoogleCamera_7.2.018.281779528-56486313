package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: gsc  reason: default package */
/* loaded from: classes.dex */
public final class gsc extends mdu {
    private final boolean a;
    private final boolean b;

    private static ggg a(grl grlVar, boolean z) {
        if (!grlVar.a && !grlVar.b) {
            return grlVar.d ? ggg.HDR_PLUS : ggg.NORMAL;
        }
        boolean z2 = grlVar.d;
        return z ? z2 ? ggg.HDR_PLUS_WITH_TORCH : ggg.NORMAL_WITH_FLASH : z2 ? ggg.HDR_PLUS : ggg.NORMAL;
    }

    public gsc(geq geqVar, grh grhVar, mcs mcsVar, mcs mcsVar2, mcs mcsVar3, dsv dsvVar) {
        super(mdg.c(grhVar, mcsVar, mcsVar2, mcsVar3, dsvVar.a));
        this.a = geqVar.f();
        this.b = geqVar.N() == mzg.FRONT;
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ggg a;
        List list = (List) obj;
        grl grlVar = new grl(this.a, this.b, ((gri) list.get(0)).e, ((grj) list.get(1)).e, ((Boolean) list.get(2)).booleanValue(), ((Boolean) list.get(3)).booleanValue());
        dsu dsuVar = (dsu) list.get(4);
        dsu dsuVar2 = dsu.ON;
        int ordinal = dsuVar.ordinal();
        if (ordinal == 0) {
            a = a(grlVar, true);
        } else if (ordinal == 1) {
            a = a(grlVar, false);
        } else if (ordinal != 2) {
            String valueOf = String.valueOf(dsuVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
            sb.append("Should be unreachable for valid Enums. FlashRecommendation=");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        } else {
            a = a(grlVar, grlVar.c);
        }
        if (a == ggg.NORMAL_WITH_FLASH) {
            qdu.d(grlVar.a);
        } else if (a == ggg.HDR_PLUS || a == ggg.HDR_PLUS_ZSL || a == ggg.HDR_PLUS_WITH_TORCH) {
            qdu.d(grlVar.d);
        }
        qdu.d(a != ggg.HDR_PLUS_ZSL);
        int i = grlVar.e;
        if (i == 1) {
            int i2 = grlVar.f;
            if (i2 != 1) {
                if (i2 == 3) {
                    return ggg.HDR_PLUS;
                }
                if (grlVar.d) {
                    return ggg.HDR_PLUS_ZSL;
                }
            }
            return ggg.NORMAL;
        } else if (i == 3) {
            int i3 = grlVar.f;
            return (i3 != 1 && (i3 == 3 || grlVar.d)) ? ggg.HDR_PLUS_WITH_TORCH : ggg.NORMAL_WITH_FLASH;
        } else {
            if (i == 2) {
                int i4 = grlVar.f;
                if (i4 == 1) {
                    return (grlVar.a && grlVar.c) ? ggg.NORMAL_WITH_FLASH : ggg.NORMAL;
                }
                if (i4 == 3) {
                    if (a == ggg.HDR_PLUS || a == ggg.NORMAL) {
                        return ggg.HDR_PLUS;
                    }
                } else if (!grlVar.d) {
                    return a;
                } else {
                    if (a != ggg.HDR_PLUS_WITH_TORCH && a != ggg.NORMAL_WITH_FLASH) {
                        if (a == ggg.HDR_PLUS || a == ggg.NORMAL) {
                            return ggg.HDR_PLUS_ZSL;
                        }
                    }
                }
                return ggg.HDR_PLUS_WITH_TORCH;
            }
            throw new IllegalStateException("Unknown flash setting, or impossible combination!!");
        }
    }
}