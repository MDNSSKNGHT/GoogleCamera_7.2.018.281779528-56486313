package defpackage;

/* compiled from: PG */
/* renamed from: mjx  reason: default package */
/* loaded from: classes.dex */
public final class mjx {
    public final String a;
    private boolean b = false;

    public mjx(String str) {
        this.a = str;
    }

    public final synchronized boolean a() {
        return this.b;
    }

    public final synchronized void b() {
        if (!this.b) {
            System.loadLibrary(this.a);
            this.b = true;
        }
    }
}