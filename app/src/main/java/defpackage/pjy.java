package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: pjy  reason: default package */
/* loaded from: classes.dex */
public final class pjy {
    private final String a;
    private final pjx b;
    private pjx c;

    public /* synthetic */ pjy(String str) {
        pjx pjxVar = new pjx((byte) 0);
        this.b = pjxVar;
        this.c = pjxVar;
        this.a = (String) qdu.d(str);
    }

    public final void a(String str, int i) {
        a(str, String.valueOf(i));
    }

    public final void a(String str, long j) {
        a(str, String.valueOf(j));
    }

    private final pjx a() {
        pjx pjxVar = new pjx((byte) 0);
        this.c.c = pjxVar;
        this.c = pjxVar;
        return pjxVar;
    }

    public final void a(Object obj) {
        a().b = obj;
    }

    public final void a(String str, Object obj) {
        pjx a = a();
        a.b = obj;
        a.a = (String) qdu.d(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        pjx pjxVar = this.b.c;
        String str = "";
        while (pjxVar != null) {
            Object obj = pjxVar.b;
            sb.append(str);
            String str2 = pjxVar.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            pjxVar = pjxVar.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}