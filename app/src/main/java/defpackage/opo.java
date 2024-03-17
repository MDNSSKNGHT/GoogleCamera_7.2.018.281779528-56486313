package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: opo  reason: default package */
/* loaded from: classes.dex */
public final class opo extends ops {
    public opo(opr oprVar, String str, Double d) {
        super(oprVar, str, d);
    }

    @Override // defpackage.ops
    public /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Float) {
            return ((Float) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (NumberFormatException ignored) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.b() + ": " + obj);
        return null;
    }
}