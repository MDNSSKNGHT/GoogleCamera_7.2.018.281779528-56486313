package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: opm  reason: default package */
/* loaded from: classes.dex */
public final class opm extends ops {
    public opm(opr oprVar, String str, Integer num) {
        super(oprVar, str, num);
    }

    @Override // defpackage.ops
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24 + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}