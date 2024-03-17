package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ofd  reason: default package */
/* loaded from: classes.dex */
final class ofd implements oey {
    public final qpp a;
    public final qpp b;
    public final qpp c;
    public final qpp d;
    private final oft i;
    private final boolean j;
    private boolean k;
    public final List<ofk> h = new ArrayList<>();
    public final qqg e = qqg.f();
    public final qqg f = qqg.f();
    public final qqg g = qqg.f();

    public ofd(qpp qppVar, qpp qppVar2, qpp qppVar3, qpp qppVar4, boolean z, Executor executor) {
        this.a = qppVar;
        this.b = qppVar2;
        this.c = qppVar3;
        this.d = qppVar4;
        this.j = z;
        this.i = new oft(executor);
    }

    @Override // defpackage.oey
    public final qpp b() {
        return this.g;
    }

    @Override // defpackage.oey
    public final synchronized off a(ofe ofeVar) {
        if (!this.k) {
            ofk ofkVar = new ofk(ofeVar.a, new oft(this.i));
            this.h.add(ofkVar);
            if (this.j) {
                return new oeu(ofkVar);
            }
            return ofkVar;
        }
        throw new IllegalStateException("Muxer already started. No tracks can be added now.");
    }

    @Override // defpackage.oey
    public final synchronized void a() {
        if (!this.k) {
            this.k = true;
            rgk.a(this.a, this.b, this.c, this.d).a(new ofa(this), this.i);
            ArrayList e = qdu.e();
            e.add(this.e);
            List list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                e.add(((ofk) list.get(i)).b);
            }
            rgk.a((Iterable) e).a(new ofb(this), this.i);
            ArrayList e2 = qdu.e();
            List list2 = this.h;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                e2.add(((ofk) list2.get(i2)).e);
            }
            rgk.a((Iterable) e2).a(new ofc(this), this.i);
        } else {
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
    }
}