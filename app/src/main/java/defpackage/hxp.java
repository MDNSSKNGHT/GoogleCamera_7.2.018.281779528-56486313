package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hxp  reason: default package */
/* loaded from: classes.dex */
public interface hxp {
    void addFinishedCallback(miz mizVar);

    hxo getSession();

    String getUsageStatsName();

    void process(Context context);

    void removeFinishedCallback(miz mizVar);

    void resume();

    void suspend();
}