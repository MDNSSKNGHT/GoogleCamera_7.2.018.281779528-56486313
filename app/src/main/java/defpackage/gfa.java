package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: gfa */
/* loaded from: classes.dex */
public final class gfa implements rgg {
    public static final gfa a = new gfa();

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public static ExecutorService a() {
        return (ExecutorService) rgk.a(eav.a("CameraEx"), "Cannot return null from a non-@Nullable @Provides method");
    }
}