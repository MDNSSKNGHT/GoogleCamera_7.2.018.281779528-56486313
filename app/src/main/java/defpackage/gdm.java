package defpackage;

/* compiled from: PG */
/* renamed from: gdm  reason: default package */
/* loaded from: classes.dex */
public final class gdm implements gdl {
    public final mch a = new mch(new gdo(gdk.a(), gdk.a()));
    private gdk b = gdk.a();
    private final boolean c;

    public gdm(boolean z) {
        this.c = z;
    }

    @Override // defpackage.gdl
    public final mcs a() {
        return this.a;
    }

    @Override // defpackage.mjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        gdk gdkVar = (gdk) obj;
        if (gdkVar.equals(this.b) && !this.c) {
            return;
        }
        this.a.a(new gdo(this.b, gdkVar));
        this.b = gdkVar;
    }
}