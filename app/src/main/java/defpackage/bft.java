package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bft  reason: default package */
/* loaded from: classes.dex */
public final class bft implements bfm, eyy, exi, eyv, exj {
    private static final String h = liu.a("PermissionsChecker");
    private qqg B;
    public final Activity a;
    public final bgd b;
    public final Resources c;
    public final bew d;
    private final KeyguardManager i;
    private final imb j;
    private final bfv k;
    private final mbe l;
    private final cjn m;
    private final Executor n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public int e = 0;
    private boolean A = false;
    public AlertDialog f = null;
    public final DialogInterface.OnClickListener g = new bfn(this);
    private int t = 0;

    private boolean d() {
        return this.m == cjn.ENG || this.m == cjn.FISHFOOD;
    }

    @Override // defpackage.bfm
    public boolean a() {
        return this.A;
    }

    public bft(Activity activity, bgd bgdVar, imb imbVar, KeyguardManager keyguardManager, bfv bfvVar, Resources resources, bew bewVar, mbe mbeVar, Executor executor, cjn cjnVar) {
        this.a = activity;
        this.b = bgdVar;
        this.j = imbVar;
        this.i = keyguardManager;
        this.k = bfvVar;
        this.c = resources;
        this.d = bewVar;
        this.l = mbeVar;
        this.n = executor;
        this.m = cjnVar;
    }

    @Override // defpackage.bfm
    public qpp b() {
        int i = 0;
        this.A = false;
        AlertDialog alertDialog = this.f;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f.dismiss();
        }
        this.t = 0;
        liu.d(h);
        if (this.B == null) {
            this.B = qqg.f();
        }
        this.u = a("android.permission.CAMERA");
        this.v = a("android.permission.RECORD_AUDIO");
        this.w = a("android.permission.READ_EXTERNAL_STORAGE");
        this.x = a("android.permission.WRITE_EXTERNAL_STORAGE");
        this.y = a("android.permission.READ_PHONE_STATE");
        if (!e()) {
            this.z = false;
            this.t += 2;
        } else {
            this.z = true;
        }
        if (!this.u || !this.w || !this.x || !this.v || ((!this.y && d()) || !this.z)) {
            if (this.i.isKeyguardLocked()) {
                if (this.u && this.v && this.w && this.x && (this.y || !d())) {
                    qqg qqgVar = this.B;
                    if (qqgVar != null) {
                        qqgVar.b(true);
                        this.B = null;
                    }
                    return rgk.b(true);
                }
                a(2131951922, true);
                this.A = true;
                return this.B;
            }
            this.A = true;
            if (this.e == 0) {
                String[] strArr = new String[this.t];
                if (!this.u) {
                    strArr[0] = "android.permission.CAMERA";
                    i = 1;
                }
                if (!this.v) {
                    strArr[i] = "android.permission.RECORD_AUDIO";
                    this.o = i;
                    i++;
                }
                if (!this.w) {
                    strArr[i] = "android.permission.READ_EXTERNAL_STORAGE";
                    this.p = i;
                    i++;
                }
                if (!this.x) {
                    strArr[i] = "android.permission.WRITE_EXTERNAL_STORAGE";
                    this.p = i;
                    i++;
                }
                if (!this.y && d()) {
                    strArr[i] = "android.permission.READ_PHONE_STATE";
                    this.q = i;
                    i++;
                }
                if (!this.z && !e()) {
                    strArr[i] = "android.permission.ACCESS_COARSE_LOCATION";
                    this.r = i;
                    int i2 = i + 1;
                    strArr[i2] = "android.permission.ACCESS_FINE_LOCATION";
                    this.s = i2;
                }
                this.e++;
                this.k.a(strArr);
            }
            return this.B;
        }
        return rgk.b(true);
    }

    private boolean a(String str) {
        if (this.a.checkSelfPermission(str) != PackageManager.PERMISSION_GRANTED) {
            this.t++;
            return false;
        }
        return true;
    }

    private static boolean a(int[] iArr, int i) {
        return iArr[i] == 0;
    }

    public void c() {
        qdu.d(this.B);
        this.B.b(false);
        this.b.a("Required camera permissions were not granted.");
    }

    private boolean e() {
        return this.j.a("default_scope", "pref_has_seen_permissions_dialogs") && (this.a.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == PackageManager.PERMISSION_GRANTED) == (this.a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == PackageManager.PERMISSION_GRANTED);
    }

    @Override // defpackage.exi
    public void a(int i, String[] strArr, int[] iArr) {
        int length;
        qdu.d(strArr);
        qdu.d(iArr);
        if (i == 1) {
            this.e--;
            int length2 = strArr.length;
            if (length2 == 0 || (length = iArr.length) == 0) {
                if (mbe.b()) {
                    this.n.execute(new bfo(this));
                    return;
                }
                return;
            }
            qdu.d(length2 == length);
            if (!this.u) {
                this.u = a(iArr, 0);
            }
            if (!this.v) {
                this.v = a(iArr, this.o);
            }
            if (!this.w) {
                this.w = a(iArr, this.p);
            }
            if (!this.x) {
                this.x = a(iArr, this.p);
            }
            if (!this.y && d()) {
                this.y = a(iArr, this.q);
            }
            if (!e() && !this.z) {
                this.j.a("default_scope", "pref_has_seen_permissions_dialogs", true);
                boolean z = a(iArr, this.s) && a(iArr, this.r);
                this.z = z;
                this.j.a("default_scope", "pref_camera_recordlocation_key", z);
            }
            if (!this.u || !this.v || !this.w || !this.x) {
                a(2131951923, false);
                return;
            }
            qdu.d(this.B);
            this.B.b(true);
        }
    }

    @Override // defpackage.exj
    public void a(Bundle bundle) {
        if (bundle != null) {
            this.e += bundle.getInt("PermissionsCheckerImpl.permissionsRequestCount", 0);
        }
    }

    @Override // defpackage.eyv
    public void b(Bundle bundle) {
        bundle.putInt("PermissionsCheckerImpl.permissionsRequestCount", this.e);
    }

    private void a(int i, boolean z) {
        this.l.execute(new bfp(this, i, z));
    }
}
