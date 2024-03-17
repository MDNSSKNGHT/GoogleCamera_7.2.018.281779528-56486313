package defpackage;

/* compiled from: PG */
/* renamed from: qaw  reason: default package */
/* loaded from: classes.dex */
abstract class qaw implements qbb {
    @Override // defpackage.qbb
    public final qba a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = length + length;
        qdu.a(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return a().a(charSequence).a();
    }
}
