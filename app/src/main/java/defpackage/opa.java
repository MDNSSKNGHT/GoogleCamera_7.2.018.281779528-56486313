package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: opa  reason: default package */
/* loaded from: classes.dex */
final class opa extends ContentObserver {
    private final /* synthetic */ opb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opa(opb opbVar) {
        super(null);
        this.a = opbVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a();
    }
}