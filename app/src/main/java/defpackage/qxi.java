package defpackage;

/* compiled from: PG */
/* renamed from: qxi */
/* loaded from: classes2.dex */
public final class qxi extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;

    public qxi() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final qvi a() {
        return new qvi(getMessage());
    }
}