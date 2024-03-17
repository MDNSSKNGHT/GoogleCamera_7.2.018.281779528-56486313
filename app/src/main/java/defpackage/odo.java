package defpackage;

import android.media.AudioRouting;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: odo  reason: default package */
/* loaded from: classes.dex */
public interface odo extends AutoCloseable, AudioRouting {
    int a();

    odn a(ByteBuffer byteBuffer, int i);

    void b();

    void c();

    @Override // java.lang.AutoCloseable
    void close();
}