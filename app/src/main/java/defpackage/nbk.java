package defpackage;

import java.util.regex.Pattern;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: nbk  reason: default package */
/* loaded from: classes.dex */
public final class nbk {
    private static final Pattern c = Pattern.compile("^[A-Za-z_][A-Za-z0-9_]*$");
    public final String a;
    public final Class b;

    public nbk(String str, Class cls) {
        qdu.c(c.matcher(str).matches());
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof nbk) {
                nbk nbkVar = (nbk) obj;
                if (this.b == nbkVar.b && this.a.equals(nbkVar.a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public static nbk b(String str) {
        return new nbk(str, Integer.class);
    }

    public static nbk a(String str) {
        return new nbk(str, String.class);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}