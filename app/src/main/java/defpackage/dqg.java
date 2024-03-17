package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.PostviewParams;

/* compiled from: PG */
/* renamed from: dqg  reason: default package */
/* loaded from: classes.dex */
public interface dqg {
    public static final knq a = new knq(100.0f);

    int a(ndn ndnVar);

    Bitmap a(neb nebVar, ndr ndrVar, grj grjVar, gri griVar, mjs mjsVar, Integer num, Integer num2);

    AeResults a(drg drgVar);

    BurstSpec a(dse dseVar, grj grjVar, neb nebVar, ndr ndrVar) throws mmh;

    FrameMetadata a(ndr ndrVar, GyroSampleVector gyroSampleVector);

    dop a();

    drg a(grj grjVar, neb nebVar, ndr ndrVar, mjs mjsVar);

    dse a(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar);

    dse a(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar, int i2, int i3, boolean z);

    void a(int i);

    void a(int i, grj grjVar, neb nebVar, ndr ndrVar);

    void a(dse dseVar, int i, ndr ndrVar, neb nebVar, neb nebVar2);

    void a(dse dseVar, BurstSpec burstSpec);

    boolean a(int i, long j, ndr ndrVar, neb nebVar, neb nebVar2, ndr ndrVar2, neb nebVar3);

    boolean a(dse dseVar);

    boolean a(ndr ndrVar);

    BurstSpec b(dse dseVar, grj grjVar, neb nebVar, ndr ndrVar) throws mmh;

    dse b(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar);

    void b(int i);

    void b(dse dseVar);

    boolean b(ndr ndrVar);

    boolean c(dse dseVar);

    void d(dse dseVar);
}