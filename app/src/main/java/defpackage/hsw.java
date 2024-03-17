package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hsw  reason: default package */
/* loaded from: classes.dex */
public final class hsw implements ggw {
    public final List<mrx> a = new ArrayList();

    public hsw(hju hjuVar, mba mbaVar) {
        hsv hsvVar = new hsv(this);
        hjuVar.a(hsvVar);
        mbaVar.a(new hsu(hjuVar, hsvVar, (byte) 0, (byte) 0));
    }

    @Override // defpackage.ggw
    public final synchronized void a(mrx mrxVar) {
        this.a.add(mrxVar);
    }
}