package defpackage;

/* compiled from: PG */
/* renamed from: mep  reason: default package */
/* loaded from: classes.dex */
public enum mep {
    MPEG_4(2, 0, nef.MPEG4),
    WEBM(9, 1, nef.WEBM),
    THREE_GPP(1, -1, nef.THREE_GPP);
    
    public final int c;
    public final int d;
    public final nef e;

    mep(int i, int i2, nef nefVar) {
        this.c = i;
        this.d = i2;
        this.e = nefVar;
    }

    public static boolean a(mfo mfoVar) {
        int e = mfoVar.e();
        return e == 2 || e == 1;
    }
}