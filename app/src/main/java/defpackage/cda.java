package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* renamed from: cda  reason: default package */
/* loaded from: classes.dex */
final class cda implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.toLowerCase().endsWith(".mp4");
    }
}