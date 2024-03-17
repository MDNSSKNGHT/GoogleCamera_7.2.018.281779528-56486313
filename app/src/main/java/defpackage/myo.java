package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: myo  reason: default package */
/* loaded from: classes.dex */
public interface myo {
    public static final int[] a = new int[0];
    public static final float[] b = new float[0];
    public static final Size[] c = new Size[0];
    public static final byte[] d = new byte[0];

    byte[] A();

    boolean B();

    boolean C();

    boolean D();

    boolean E();

    Set F();

    Set<CaptureRequest.Key> G();

    Set<mzc> H();

    boolean I();

    List J();

    int K();

    mzc M();

    mzg N();

    long a(int i, mjs mjsVar);

    Object a(CameraCharacteristics.Key key);

    Object a(CameraCharacteristics.Key key, Object obj);

    List a(int i);

    Object b(CameraCharacteristics.Key key);

    List b(mjs mjsVar);

    List c();

    int d();

    Rect e();

    boolean f();

    boolean g();

    mzf h();

    List i();

    boolean j();

    int k();

    int l();

    float m();

    List n();

    List o();

    List p();

    float q();

    boolean r();

    boolean s();

    boolean t();

    boolean u();

    boolean v();

    List<mjs> w();

    List x();

    List y();

    boolean z();
}
