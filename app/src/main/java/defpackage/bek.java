package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: bek  reason: default package */
/* loaded from: classes.dex */
final class bek extends ben {
    private final int a;
    private final Rect b;

    public bek(int i, Rect rect) {
        this.a = i;
        if (rect == null) {
            throw new NullPointerException("Null bounds");
        }
        this.b = rect;
    }

    @Override // defpackage.ben
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ben
    public final Rect b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ben) {
                ben benVar = (ben) obj;
                if (this.a == benVar.a() && this.b.equals(benVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("SmartAfRegion{id=");
        sb.append(i);
        sb.append(", bounds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}