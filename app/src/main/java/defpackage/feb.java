package defpackage;

import java.util.EnumMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: feb  reason: default package */
/* loaded from: classes.dex */
public final class feb {
    private static final String a = liu.a("MemoryManager");
    private final Executor c;
    private final long d;
    private final EnumMap<fdt, fea> e = new EnumMap<>(fdt.class);
    private final Object b = new Object();

    public feb(fdw fdwVar, Executor executor) {
        this.d = fdwVar.a;
        String str = a;
        long j = this.d;
        StringBuilder sb = new StringBuilder(72);
        sb.append("Max native memory: ");
        sb.append(j);
        sb.append(" bytes. (");
        sb.append(j / 1000000);
        sb.append("MB).");
        sb.toString();
        liu.d(str);
        this.c = executor;
    }

    private final long b() {
        long j;
        synchronized (this.b) {
            long j2 = 0;
            for (fdt fdtVar : this.e.keySet()) {
                j2 += ((Long) ((fea) this.e.get(fdtVar)).a.b().a()).longValue();
            }
            j = this.d - j2;
        }
        return j;
    }

    public final mcs a(fdt fdtVar) {
        mch mchVar;
        synchronized (this.b) {
            if (this.e.containsKey(fdtVar)) {
                mchVar = ((fea) this.e.get(fdtVar)).b;
            } else {
                String valueOf = String.valueOf(fdtVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Feature not registered: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        return mchVar;
    }

    public final void a(fdu fduVar) {
        synchronized (this.b) {
            if (!this.e.containsKey(fduVar.a())) {
                String str = a;
                String valueOf = fduVar.a().name();
                if (valueOf.length() != 0) {
                    "Registering feature: ".concat(valueOf);
                } else {
                    new String("Registering feature: ");
                }
                liu.d(str);
                this.e.put(fduVar.a(), new fea(fduVar, new mch((Object) false), prr.a(fduVar.b().a(new fdy(this), this.c), fduVar.c().a(new fdz(this), this.c))));
                a();
                return;
            }
            String str2 = a;
            String valueOf2 = String.valueOf(fduVar.a().name());
            if (valueOf2.length() != 0) {
                "Feature already registered: ".concat(valueOf2);
            } else {
                new String("Feature already registered: ");
            }
            liu.d(str2);
        }
    }

    public final void a() {
        boolean z = false;
        synchronized (this.b) {
            long b = b();
            for (fdt fdtVar : this.e.keySet()) {
                mch mchVar = ((fea) this.e.get(fdtVar)).b;
                synchronized (this.b) {
                    long b2 = b();
                    long longValue = ((Long) ((fea) this.e.get(fdtVar)).a.c().a()).longValue();
                    if (longValue < 0) {
                        String str = a;
                        String name = fdtVar.name();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 73);
                        sb.append("Feature (");
                        sb.append(name);
                        sb.append(") reports negative shot memory: ");
                        sb.append(longValue);
                        sb.append(". Disabling.");
                        liu.b(str, sb.toString());
                    } else {
                        z = longValue <= b2;
                        String str2 = a;
                        String name2 = fdtVar.name();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 68);
                        sb2.append("Feature available: ");
                        sb2.append(name2);
                        sb2.append(": ");
                        sb2.append(z);
                        sb2.append(" (Additional memory: ");
                        sb2.append(longValue);
                        sb2.append(")");
                        sb2.toString();
                        liu.b(str2);
                    }
                }
                mchVar.a(Boolean.valueOf(z));
            }
            String str3 = a;
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("State updated. Free Memory: ");
            sb3.append(b);
            sb3.toString();
            liu.d(str3);
        }
    }
}
