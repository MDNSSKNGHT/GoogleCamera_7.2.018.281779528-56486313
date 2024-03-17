package defpackage;

import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: ndj  reason: default package */
/* loaded from: classes.dex */
public interface ndj extends mjq {
    String a();

    ndl a(int i) throws mmh;

    void a(List list, ndg ndgVar, Handler handler) throws mmh;

    void a(ndw ndwVar) throws mmh;

    void b(List list, ndg ndgVar, Handler handler) throws mmh;

    void c(List list, ndg ndgVar, Handler handler) throws mmh;

    @Override // defpackage.mjq, java.lang.AutoCloseable
    void close();
}