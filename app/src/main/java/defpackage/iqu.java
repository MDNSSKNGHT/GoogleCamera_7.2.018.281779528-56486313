package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: iqu  reason: default package */
/* loaded from: classes.dex */
public final class iqu {
    public final Set<iqr> a = new ArraySet<>();
    private iqt b;
    private fwo c;
    private myo d;

    public final synchronized iqt a() {
        return this.b;
    }

    public final synchronized fwo b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized mjq a(iqr iqrVar) {
        this.a.add(iqrVar);
        myo myoVar = this.d;
        if (myoVar != null) {
            iqrVar.a(myoVar);
        }
        return new iqq(this, iqrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(mnq mnqVar, mos mosVar) {
        for (iqr iqrVar : this.a) {
            iqrVar.a(mnqVar, mosVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(myo myoVar) {
        this.d = myoVar;
        for (iqr iqrVar : this.a) {
            iqrVar.a(myoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(ndr ndrVar) {
        for (iqr iqrVar : this.a) {
            iqrVar.a(ndrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(iqt iqtVar) {
        this.b = iqtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(fwo fwoVar) {
        this.c = fwoVar;
    }
}