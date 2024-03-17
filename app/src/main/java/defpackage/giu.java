package defpackage;

/* compiled from: PG */
/* renamed from: giu  reason: default package */
/* loaded from: classes.dex */
public final class giu implements glx {
    public final ihi a;
    public final hyx b;
    public final /* synthetic */ giv c;

    public giu(giv givVar, ihi ihiVar) {
        this.c = givVar;
        this.a = ihiVar;
        this.b = new hyz(ihiVar);
        ihiVar.C().a(this.b);
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.glx
    public final void a(neb nebVar, qpp qppVar) {
        throw new RuntimeException("Should not call RawModeImageSaver.addFullSizeImage()");
    }
}