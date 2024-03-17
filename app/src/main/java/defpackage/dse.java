package defpackage;

import android.util.DisplayMetrics;
import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.FinalImageCallback;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.PdImageCallback;
import com.google.googlex.gcam.PlanarRawImageCallback;
import com.google.googlex.gcam.PostviewCallback;
import com.google.googlex.gcam.RawImageCallback;
import com.google.googlex.gcam.ShotStatusCallback;
import com.google.googlex.gcam.clientallocator.UniqueBitmapClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueHardwareBufferInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueRawClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueYuvClientAllocator;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dse  reason: default package */
/* loaded from: classes.dex */
public final class dse {
    public static final String a = liu.a("HdrPlusShot");
    public final gnq c;
    public final ShotStatusCallback g;
    public final PostviewCallback h;
    public final PdImageCallback i;
    public final RawImageCallback j;
    public final PlanarRawImageCallback k;
    public final FinalImageCallback l;
    public final ClientInterleavedU8Allocator m;
    public final UniqueYuvClientAllocator n;
    public final ClientInterleavedU8Allocator o;
    public final dss s;
    public mjq t;
    public int u = 1;
    public int b = GcamModule.getKInvalidShotId();
    public final HdrPlusInterface f = new HdrPlusInterface();
    public final UniqueYuvClientAllocator p = new UniqueYuvClientAllocator();
    public final UniqueRawClientAllocator q = new UniqueRawClientAllocator();
    public final UniqueInterleavedU16ClientAllocator r = new UniqueInterleavedU16ClientAllocator();
    public final List d = new ArrayList();
    public final List e = new ArrayList();

    public dse(dss dssVar, DisplayMetrics displayMetrics, gnq gnqVar, int i, izm izmVar, cjn cjnVar, crb crbVar) {
        this.s = dssVar;
        this.c = gnqVar;
        this.g = new dry(this, cjnVar, crbVar, i, dssVar, izmVar, gnqVar);
        if (dssVar.c().a()) {
            this.m = new UniqueBitmapClientAllocator(displayMetrics);
            this.n = null;
        } else if (dssVar.d().a()) {
            this.m = null;
            this.n = new UniqueYuvClientAllocator();
        } else if (dssVar.e().a()) {
            this.m = new UniqueHardwareBufferInterleavedU8ClientAllocator(288L, 32L);
            this.n = null;
        } else {
            this.m = null;
            this.n = null;
        }
        if (dssVar.j().a()) {
            this.o = new UniqueInterleavedU8ClientAllocator();
        } else if (dssVar.k().a()) {
            this.o = new UniqueHardwareBufferInterleavedU8ClientAllocator(290L, 34L);
        } else {
            this.o = null;
        }
        this.h = new drz(this, dssVar);
        this.i = new dsa(this, dssVar);
        this.k = new dsb(this, dssVar);
        this.j = new dsc(this, dssVar);
        this.l = new dsd(this, dssVar);
    }

    public final int a() {
        qdu.b(this.b != GcamModule.getKInvalidShotId(), "setShotId() has not been called on this Shot.");
        return this.b;
    }
}