package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: opn  reason: default package */
/* loaded from: classes.dex */
final class opn extends ops {
    public opn(opr oprVar, String str, Boolean bool) {
        super(oprVar, str, bool);
    }

    @Override // defpackage.ops
    public /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (lzo.b.matcher(str).matches()) {
                return true;
            }
            if (lzo.c.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.b() + ": " + obj);
        return null;
    }
}