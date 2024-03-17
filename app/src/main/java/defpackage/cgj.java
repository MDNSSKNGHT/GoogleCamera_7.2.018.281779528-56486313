package defpackage;

import android.media.AudioRouting;

/* compiled from: PG */
/* renamed from: cgj  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class cgj implements AudioRouting.OnRoutingChangedListener {
    private final cgk a;

    public cgj(cgk cgkVar) {
        this.a = cgkVar;
    }

    @Override // android.media.AudioRouting.OnRoutingChangedListener
    public final void onRoutingChanged(AudioRouting audioRouting) {
        cgk cgkVar = this.a;
        String a = cgh.a(audioRouting.getRoutedDevice());
        String a2 = cgh.a(audioRouting.getPreferredDevice());
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 55 + String.valueOf(a2).length());
        sb.append("onRoutingChanged, routed device = ");
        sb.append(a);
        sb.append(", preferred device = ");
        sb.append(a2);
        sb.toString();
        cgkVar.b(audioRouting);
    }
}