package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.ListPreference;
import android.preference.SwitchPreference;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: erw  reason: default package */
/* loaded from: classes.dex */
public final class erw {
    private static final String j = liu.a("CamSetActHelper");
    public final imm a;
    public final cqw b;
    public final ixi c;
    public final grk d;
    public final Set e;
    public final dke f;
    public final fad g;
    public final mdl h;
    private final gco k;
    private final cin l;
    private final mbe m;
    private final Set n;
    private final Set o;
    private final boolean p;
    private final met q;
    private final mdl r;
    private final mdl s;
    private List<String> t = null;
    public List<mjq> i = null;
    private pue u = null;

    public erw(gco gcoVar, cin cinVar, imm immVar, cqw cqwVar, ixi ixiVar, mbe mbeVar, grk grkVar, Set set, Set set2, Set set3, mdl mdlVar, fad fadVar, mdl mdlVar2, mdl mdlVar3, dke dkeVar, boolean z, met metVar) {
        this.k = gcoVar;
        this.l = cinVar;
        this.a = immVar;
        this.b = cqwVar;
        this.c = ixiVar;
        this.m = mbeVar;
        this.d = grkVar;
        this.n = set;
        this.o = set2;
        this.r = mdlVar;
        this.g = fadVar;
        this.h = mdlVar2;
        this.e = set3;
        this.s = mdlVar3;
        this.f = dkeVar;
        this.p = z;
        this.q = metVar;
    }

    public List<String> a() {
        return qdu.c(this.t, "Call initialize before getting keysToRemove");
    }

    public pue b() {
        return qdu.c(this.u, "Call initialize before getting preferencesToAdd");
    }

    @SuppressLint("ResourceType")
    public void a(Context context) {
        mzg[] values;
        boolean z = false;
        for (mzg mzgVar : mzg.values()) {
            if (this.k.a(mzgVar)) {
                z = z || this.k.a(this.k.b(mzgVar)).z();
            }
        }
        this.t = new ArrayList<>(10);
        this.i = new ArrayList<>(10);
        if (this.l.d(cjc.b) || this.l.d(ciu.B)) {
            this.t.add("pref_camera_hdrplus_option_available_key");
        } else {
            this.i.add(this.r.a(new erv(this), this.m));
        }
        if (!this.l.c(cjb.t)) {
            this.t.add("pref_camera_raw_output_option_available_key");
        }
        if (!this.l.b(ciw.b) && !this.l.c(cix.b)) {
            this.t.add("pref_camera_enable_iris");
        }
        if (!this.l.c(cih.a)) {
            this.t.add("pref_camera_coach_key");
        }
        ciq ciqVar = cif.a;
        this.l.c();
        if (!this.l.c(cit.al)) {
            this.t.add("pref_camera_selfie_mirror_key");
        }
        this.l.f();
        this.t.add("pref_category_developer");
        if (!z) {
            this.t.add("pref_video_stabilization_key");
        }
        if (!this.l.c(cig.j) || !this.q.a()) {
            this.t.add("pref_video_hevc_setting_key");
        }
        if (!this.k.d()) {
            this.s.a(true);
            this.t.add("pref_camera_sounds_key");
        }
        this.l.e();
        this.t.add("pref_category_custom_hotkeys");
        if (!this.l.c(cit.aq)) {
            this.l.d();
            this.t.add("pref_camera_dynamic_depth_enabled_key");
        }
        if (!this.l.c(cik.a)) {
            this.t.add("pref_category_frequent_faces");
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
            this.t.add("pref_camera_recordlocation_key");
        }
        if (!this.p) {
            this.t.add("pref_category_social_share");
        }
        this.u = pqy.l();
        pwx ar = ((pvi) this.n).ar();
        while (ar.hasNext()) {
            ipk ipkVar = (ipk) ar.next();
            if (ipkVar.a().get(0).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(ipkVar.c());
                listPreference.setEntries(ipkVar.f());
                listPreference.setEntryValues(ipkVar.e());
                listPreference.setKey(ipkVar.b());
                listPreference.setDefaultValue(ipkVar.g());
                listPreference.setIcon(ipkVar.h());
                listPreference.setSummary(ipkVar.d());
                listPreference.setLayoutResource(2131624105);
                listPreference.setOrder(3);
                this.u.a("pref_category_resolution_camera", listPreference);
            }
        }
        pwx ar2 = ((pvi) this.o).ar();
        while (ar2.hasNext()) {
            ipl iplVar = (ipl) ar2.next();
            if (iplVar.a().get(0).equals("Advanced")) {
                SwitchPreference switchPreference = new SwitchPreference(context);
                switchPreference.setTitle(iplVar.c());
                switchPreference.setSummary(iplVar.d());
                switchPreference.setKey(iplVar.b());
                switchPreference.setDefaultValue(iplVar.e());
                ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(context);
                managedSwitchPreference.setDefaultValue(true);
                managedSwitchPreference.setKey(switchPreference.getKey());
                managedSwitchPreference.setSummary(switchPreference.getSummary());
                managedSwitchPreference.setTitle(switchPreference.getTitle());
                managedSwitchPreference.setIcon(switchPreference.getIcon());
                managedSwitchPreference.setOnPreferenceChangeListener(switchPreference.getOnPreferenceChangeListener());
                managedSwitchPreference.setOrder(switchPreference.getOrder());
                managedSwitchPreference.setLayoutResource(2131624105);
                this.u.a("pref_category_advanced", managedSwitchPreference);
            }
        }
        String sb = "Keys to remove from CameraSettings: " + this.t;
        liu.f(j);
    }
}
