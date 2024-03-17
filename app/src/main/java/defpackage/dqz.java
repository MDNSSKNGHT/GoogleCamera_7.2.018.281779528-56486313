package defpackage;

import com.google.googlex.gcam.ViewfinderProcessingOptions;

/* compiled from: PG */
/* renamed from: dqz */
/* loaded from: classes.dex */
public final class dqz implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private dqz(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static dqz a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new dqz(rhdVar, rhdVar2, rhdVar3);
    }

    public final ViewfinderProcessingOptions a() {
        drf drfVar = (drf) this.b.get();
        cin cinVar = (cin) this.c.get();
        ViewfinderProcessingOptions viewfinderProcessingOptions = new ViewfinderProcessingOptions();
        if (((dop) this.a.get()).a() && drfVar == drf.LONG_EXPOSURE) {
            viewfinderProcessingOptions.setProcess_motion(true);
        }
        ciq ciqVar = ciu.a;
        viewfinderProcessingOptions.setVerbose(cinVar.b());
        viewfinderProcessingOptions.setSave_motion_trace(lsh.a(cinVar));
        return (ViewfinderProcessingOptions) rgk.a(viewfinderProcessingOptions, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}