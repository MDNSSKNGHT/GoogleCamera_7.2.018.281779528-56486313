package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: mzc  reason: default package */
/* loaded from: classes.dex */
public final class mzc {
    public final String a;
    public final int b;
    public final int c;
    private final Integer d;

    private mzc(Integer num, String str, int i) {
        this.d = num;
        this.a = str;
        this.b = i;
        this.c = Objects.hash(str, Integer.valueOf(i));
    }

    public final boolean a() {
        return this.d != null;
    }

    public final int hashCode() {
        return this.c;
    }

    public final int b() {
        Integer num = this.d;
        if (num == null) {
            String valueOf = String.valueOf(this.a);
            throw new UnsupportedOperationException(valueOf.length() == 0 ? new String("Attempted to access a camera id that is not supported on legacy camera API's: ") : "Attempted to access a camera id that is not supported on legacy camera API's: ".concat(valueOf));
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mzc a(String str, int i) {
        Integer num;
        try {
            num = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            num = null;
        }
        return new mzc(num, str, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            mzc mzcVar = (mzc) obj;
            return this.b == mzcVar.b && this.a.equals(mzcVar.a);
        }
        return true;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
