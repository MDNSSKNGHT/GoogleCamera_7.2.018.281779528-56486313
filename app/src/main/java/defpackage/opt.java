package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: opt  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class opt implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final opu a;

    public opt(opu opuVar) {
        this.a = opuVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        opu opuVar = this.a;
        synchronized (opuVar.a) {
            opuVar.b = null;
            ops.a();
        }
        synchronized (opuVar) {
            for (opc opcVar : opuVar.c) {
                opcVar.a();
            }
        }
    }
}