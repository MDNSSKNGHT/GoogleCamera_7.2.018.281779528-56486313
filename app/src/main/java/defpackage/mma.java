package defpackage;

import android.hardware.camera2.CameraManager;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mma  reason: default package */
/* loaded from: classes.dex */
public final class mma implements mks {
    public mlx b;
    private final mkp d;
    private final mky e;
    private final mln f;
    private final mmf g;
    private final Executor h;
    private final mkn i;
    private final mkg j;
    private mba k;
    public final Object a = new Object();
    public final List<mlx> c = new ArrayList<>();

    public mma(mky mkyVar, mkp mkpVar, mln mlnVar, Executor executor, mmf mmfVar, mkn mknVar, mkg mkgVar) {
        this.e = mkyVar;
        this.d = mkpVar;
        this.f = mlnVar;
        this.g = mmfVar;
        this.h = executor;
        this.i = mknVar;
        this.j = mkgVar.a("VirtualCameraMgr");
    }

    @Override // defpackage.mks
    public void a() {
        synchronized (this.a) {
            mlx mlxVar = this.b;
            if (mlxVar != null) {
                this.c.add(mlxVar);
                this.b = null;
            }
            for (mlx mlxVar2 : this.c) {
                mlxVar2.c();
            }
        }
    }

    @Override // defpackage.mks
    public void b() {
        mba mbaVar;
        prr a;
        synchronized (this.a) {
            mlx mlxVar = this.b;
            if (mlxVar != null) {
                this.c.add(mlxVar);
                this.b = null;
            }
            mbaVar = this.k;
            this.k = null;
        }
        if (mbaVar != null) {
            mbaVar.close();
        }
        do {
            synchronized (this.a) {
                a = prr.a(this.c);
            }
            for (mlx mlxVar2 : (List<mlx>) a) {
                try {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    mlxVar2.c();
                    mkx mkxVar = mlxVar2.c;
                    synchronized (mkxVar.g) {
                        if (mkxVar.k) {
                            mkxVar.j.await(1500L, timeUnit);
                        }
                    }
                    mlxVar2.b.b.await(1500L, timeUnit);
                } catch (InterruptedException e) {
                    this.j.c("Warning: Failed to synchronously close " +
                            mlxVar2 +
                            ".", e);
                }
            }
        } while (!a.isEmpty());
    }

    public static String a(int i) {
        switch (i) {
            case -3:
                return "App is not holding a camera wakelock";
            case -2:
                return "Camera was disconnected";
            case -1:
                return "App closed the camera device";
            case 0:
            default:
                return "Unknown failure reason (" + i + ")";
            case 1:
                return "Camera is in use (1)";
            case 2:
                return "Maximum cameras in use (2)";
            case 3:
                return "Camera is disabled (3)";
            case 4:
                return "Camera encountered a fatal error (4)";
            case 5:
                return "Camera service encountered a fatal error (5)";
        }
    }

    @Override // defpackage.mks
    public void a(mzc mzcVar) {
        a(mzcVar, null);
    }

    @Override // defpackage.mks
    public void a(mzc mzcVar, mkr mkrVar) {
        boolean a;
        synchronized (this.a) {
            mlx mlxVar = this.b;
            if (mlxVar != null) {
                if (!mlxVar.a.equals(mzcVar)) {
                    this.c.add(mlxVar);
                    mlxVar.c();
                    this.b = null;
                } else {
                    mlxVar.a(mkrVar);
                    return;
                }
            }
            mln mlnVar = this.f;
            synchronized (mlnVar.a) {
                a = mlnVar.b.a();
            }
            if (!a) {
                mky mkyVar = this.e;
                String str = mzcVar.a;
                neg negVar = (neg) mky.a(mkyVar.f.get(), 6);
                mlx mlxVar2 = new mlx(mzcVar, this, new mkx((Handler) mky.a(mkyVar.a.get(), 1), (Executor) mky.a(mkyVar.b.get(), 2), (CameraManager) mky.a(mkyVar.c.get(), 3), (mla) mky.a(mkyVar.d.get(), 4), (mkn) mky.a(mkyVar.e.get(), 5), (String) mky.a(str, 7)), this.g, this.h, this.j, this.i);
                mba mbaVar = this.k;
                if (mbaVar == null || mbaVar.a()) {
                    mbaVar = this.f.b();
                    this.k = mbaVar;
                }
                mbaVar.a(new mlr(mlxVar2));
                synchronized (mlxVar2) {
                    if (!mlxVar2.g && !mlxVar2.e && !mlxVar2.f) {
                        mlxVar2.g = true;
                        mlxVar2.d.b(mlxVar2 + " Opening");
                        mlxVar2.b.a(mlxVar2);
                        mkx mkxVar = mlxVar2.c;
                        synchronized (mkxVar.g) {
                            if (!mkxVar.k && !mkxVar.l) {
                                mkxVar.k = true;
                                mkxVar.d.execute(new mkt(mkxVar));
                            }
                        }
                    }
                }
                mlxVar2.a(mkrVar);
                this.b = mlxVar2;
                this.d.a(mzcVar);
                return;
            }
            if (mkrVar != null) {
                this.h.execute(new mlq(mkrVar));
            }
        }
    }
}
