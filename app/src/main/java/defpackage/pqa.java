package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: pqa  reason: default package */
/* loaded from: classes.dex */
final class pqa implements Serializable {
    public static final long serialVersionUID = 0;
    private final ppz a;

    public /* synthetic */ pqa(ppz ppzVar) {
        this.a = ppzVar;
    }

    private Object readResolve() {
        return new pqb(this.a);
    }
}