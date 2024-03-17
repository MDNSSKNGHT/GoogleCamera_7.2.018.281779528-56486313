package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: nds  reason: default package */
/* loaded from: classes.dex */
public final class nds extends ndw {
    public final int a;
    public final List b;
    public final Executor c;
    public final ndg d;
    public final ndm e;

    public /* synthetic */ nds(int i, List list, Executor executor, ndg ndgVar, ndm ndmVar) {
        this.a = i;
        this.b = list;
        this.c = executor;
        this.d = ndgVar;
        this.e = ndmVar;
    }

    @Override // defpackage.ndw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ndw
    public final List b() {
        return this.b;
    }

    @Override // defpackage.ndw
    public final Executor c() {
        return this.c;
    }

    @Override // defpackage.ndw
    public final ndg d() {
        return this.d;
    }

    @Override // defpackage.ndw
    public final ndm e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ndw) {
                ndw ndwVar = (ndw) obj;
                return this.a == ndwVar.a() && this.b.equals(ndwVar.b()) && this.c.equals(ndwVar.c()) && this.d.equals(ndwVar.d()) && this.e.equals(ndwVar.e());
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 120 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SessionConfigurationProxy{sessionType=");
        sb.append(i);
        sb.append(", outputConfigurations=");
        sb.append(valueOf);
        sb.append(", executor=");
        sb.append(valueOf2);
        sb.append(", stateCallback=");
        sb.append(valueOf3);
        sb.append(", sessionParameters=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}