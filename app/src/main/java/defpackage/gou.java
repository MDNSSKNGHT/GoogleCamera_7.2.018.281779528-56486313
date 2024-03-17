package defpackage;

/* compiled from: PG */
/* renamed from: gou  reason: default package */
/* loaded from: classes.dex */
final class gou implements ges {
    private final gop a;
    private final gnq b;
    private final dtq c;
    private final /* synthetic */ gov d;

    public /* synthetic */ gou(gov govVar, gop gopVar, gnq gnqVar, dtq dtqVar) {
        this.d = govVar;
        this.a = gopVar;
        this.b = gnqVar;
        this.c = dtqVar;
    }

    public final String toString() {
        return "PictureTakerCommand";
    }

    @Override // defpackage.ges
    public final void a() {
        try {
            try {
                goq c = this.d.c();
                if (((Boolean) c.a().a()).booleanValue()) {
                    mkg mkgVar = this.d.b;
                    String valueOf = String.valueOf(c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("PictureTakerCommand.run: got captureCommand=");
                    sb.append(valueOf);
                    mkgVar.d(sb.toString());
                    this.c.a();
                    c.a(this.a, this.b);
                    mkg mkgVar2 = this.d.b;
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append("PictureTakerCommand.run: success=true");
                    mkgVar2.d(sb2.toString());
                    this.a.close();
                    return;
                }
                mkg mkgVar3 = this.d.b;
                String valueOf2 = String.valueOf(c);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 74);
                sb3.append("Take picture was invoked, but the picture taker is not available! Command ");
                sb3.append(valueOf2);
                mkgVar3.c(sb3.toString());
            } catch (Exception e) {
                gov govVar = this.d;
                mkg mkgVar4 = govVar.b;
                String valueOf3 = String.valueOf(govVar.a.toString());
                mkgVar4.b(valueOf3.length() != 0 ? "PictureTaker command failed: ".concat(valueOf3) : new String("PictureTaker command failed: "), e);
                throw e;
            }
        } finally {
            mkg mkgVar5 = this.d.b;
            StringBuilder sb4 = new StringBuilder(38);
            sb4.append("PictureTakerCommand.run: success=false");
            mkgVar5.d(sb4.toString());
            this.a.close();
            this.b.d.close();
            this.b.c.e();
            this.b.a.g.close();
        }
    }
}