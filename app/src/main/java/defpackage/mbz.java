package defpackage;

/* compiled from: PG */
/* renamed from: mbz  reason: default package */
/* loaded from: classes.dex */
final class mbz implements mby {
    @Override // defpackage.mby
    public final void a(mjq mjqVar) {
        mjqVar.close();
    }

    @Override // defpackage.mby
    public final void a(Iterable iterable, String str) {
        for (Object o : iterable) {
            ((mjq) o).close();
        }
    }
}