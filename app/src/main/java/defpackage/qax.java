package defpackage;

/* compiled from: PG */
/* renamed from: qax  reason: default package */
/* loaded from: classes.dex */
abstract class qax implements qbc {
    @Override // defpackage.qbc
    public qbc a(int i) {
        throw null;
    }

    public void a(char c) {
        throw null;
    }

    @Override // defpackage.qbc
    public final qbc a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
        return this;
    }
}
