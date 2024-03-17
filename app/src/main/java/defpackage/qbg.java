package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: qbg  reason: default package */
/* loaded from: classes.dex */
final class qbg implements Serializable {
    public static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final String c;

    public /* synthetic */ qbg(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new qbh(this.a, this.b, this.c);
    }
}
