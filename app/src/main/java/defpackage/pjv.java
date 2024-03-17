package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: pjv  reason: default package */
/* loaded from: classes.dex */
final class pjv extends pjm implements Serializable {
    public static final long serialVersionUID = 0;
    private final Pattern a;

    public pjv(Pattern pattern) {
        this.a = (Pattern) qdu.d(pattern);
    }

    @Override // defpackage.pjm
    public final pjl a(CharSequence charSequence) {
        return new pjl(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}