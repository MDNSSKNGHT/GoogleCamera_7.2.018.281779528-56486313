package defpackage;

import android.os.PowerManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jeu  reason: default package */
/* loaded from: classes.dex */
final class jeu {
    public final PowerManager a;

    public jeu(PowerManager powerManager) {
        this.a = powerManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Executor executor, PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener) {
        this.a.addThermalStatusListener(executor, onThermalStatusChangedListener);
    }
}