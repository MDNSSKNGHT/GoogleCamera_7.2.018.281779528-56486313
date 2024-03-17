package defpackage;

import android.hardware.camera2.params.Face;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: dqd  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dqd implements mjw {
    private final dqe a;

    public dqd(dqe dqeVar) {
        this.a = dqeVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        Face[] faceArr;
        dqe dqeVar = this.a;
        gmt gmtVar = (gmt) obj;
        HashMap hashMap = new HashMap();
        for (Face face : gmtVar.a) {
            hashMap.put(Integer.valueOf(face.getId()), Long.valueOf(((Long) qdu.d(Long.valueOf(dqeVar.b.containsKey(Integer.valueOf(face.getId())) ? ((Long) dqeVar.b.get(Integer.valueOf(face.getId()))).longValue() : 0L))).longValue() + gmtVar.c));
        }
        dqeVar.b = hashMap;
    }
}
