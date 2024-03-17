package defpackage;

/* compiled from: PG */
/* renamed from: get  reason: default package */
/* loaded from: classes.dex */
final class get implements Runnable {
    private final /* synthetic */ Exception a;

    public get(Exception exc) {
        this.a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new RuntimeException(this.a);
    }
}