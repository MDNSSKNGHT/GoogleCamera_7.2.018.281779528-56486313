package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mzu  reason: default package */
/* loaded from: classes.dex */
public final class mzu {
    public final int a;
    public final mjs b;

    public mzu(int i, mjs mjsVar) {
        this.a = i;
        this.b = mjsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mzu)) {
            return false;
        }
        mzu mzuVar = (mzu) obj;
        return mzuVar.a == this.a && mzuVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        pjy a = qdu.a("ImageReaderFormat");
        a.a("ImageFormat", oxk.a(this.a));
        a.a("Size", this.b);
        return a.toString();
    }
}