package defpackage;

/* compiled from: PG */
/* renamed from: pow  reason: default package */
/* loaded from: classes.dex */
public enum pow {
    OPEN,
    CLOSED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pow a(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
