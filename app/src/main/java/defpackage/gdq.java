package defpackage;

/* compiled from: PG */
/* renamed from: gdq  reason: default package */
/* loaded from: classes.dex */
final class gdq implements pjr {
    @Override // defpackage.pjr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        gdo gdoVar = (gdo) obj;
        boolean z = false;
        if (gdoVar.b.a == ibi.CONTINUOUS_PICTURE && gdoVar.b.b != ibj.FOCUSED_LOCKED && gdoVar.b.b != ibj.NOT_FOCUSED_LOCKED) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}