package defpackage;

/* compiled from: PG */
/* renamed from: gow  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gow implements mjw {
    private final mkg a;
    private final goq b;

    public gow(mkg mkgVar, goq goqVar) {
        this.a = mkgVar;
        this.b = goqVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        mkg mkgVar = this.a;
        goq goqVar = this.b;
        String valueOf = String.valueOf((Boolean) obj);
        String valueOf2 = String.valueOf(goqVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("ImageCaptureCommand: availability=");
        sb.append(valueOf);
        sb.append(" rootCommand=");
        sb.append(valueOf2);
        mkgVar.b(sb.toString());
    }
}