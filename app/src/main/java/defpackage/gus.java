package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: gus  reason: default package */
/* loaded from: classes.dex */
final class gus extends gut {
    private final guv a;
    private final prx b;
    private final int c;
    private final int d;
    private final prr e;

    public gus(guv guvVar, prx prxVar, int i, int i2, prr prrVar) {
        if (guvVar == null) {
            throw new NullPointerException("Null category");
        }
        this.a = guvVar;
        if (prxVar == null) {
            throw new NullPointerException("Null menuOptionToDrawable");
        }
        this.b = prxVar;
        this.c = i;
        this.d = i2;
        if (prrVar == null) {
            throw new NullPointerException("Null optionSpecs");
        }
        this.e = prrVar;
    }

    @Override // defpackage.gut
    public final guv a() {
        return this.a;
    }

    @Override // defpackage.gut
    public final prx b() {
        return this.b;
    }

    @Override // defpackage.gut
    public final int c() {
        return this.c;
    }

    @Override // defpackage.gut
    public final int d() {
        return this.d;
    }

    @Override // defpackage.gut
    public final prr e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gut) {
                gut gutVar = (gut) obj;
                if (this.a.equals(gutVar.a()) && this.b.equals(gutVar.b()) && this.c == gutVar.c() && this.d == gutVar.d() && qdu.a((List) this.e, (Object) gutVar.e())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 127 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ImmutableCategorySpec{category=");
        sb.append(valueOf);
        sb.append(", menuOptionToDrawable=");
        sb.append(valueOf2);
        sb.append(", contentLabel=");
        sb.append(i);
        sb.append(", contentDescription=");
        sb.append(i2);
        sb.append(", optionSpecs=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}