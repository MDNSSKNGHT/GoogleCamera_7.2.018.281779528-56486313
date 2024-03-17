package defpackage;

/* compiled from: PG */
/* renamed from: dst  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dst implements mjw {
    private final dsv a;
    private final doi b;

    public dst(dsv dsvVar, doi doiVar) {
        this.a = dsvVar;
        this.b = doiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1.LogSceneBrightness() < (-2.86f)) goto L26;
     */
    @Override // defpackage.mjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11) {
        /*
            r10 = this;
            dsv r0 = r10.a
            doi r1 = r10.b
            ghc r11 = (defpackage.ghc) r11
            qpp r2 = r11.j()
            if (r2 == 0) goto Lab
            mch r3 = r0.a     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            ndr r2 = (defpackage.ndr) r2     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            mcs r4 = r1.d     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            grj r4 = (defpackage.grj) r4     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            mba r5 = r1.b     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r5 == 0) goto L26
            goto La5
        L26:
            grj r5 = defpackage.grj.OFF     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r4 == r5) goto La5
            android.hardware.camera2.CaptureResult$Key r5 = defpackage.lap.b     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            r6 = -1070134723(0xffffffffc0370a3d, float:-2.86)
            r7 = 1124859904(0x430c0000, float:140.0)
            if (r5 == 0) goto L53
            android.hardware.camera2.CaptureResult$Key r5 = defpackage.lap.b     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            java.lang.Object r5 = r2.a(r5)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            float[] r5 = (float[]) r5     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r5 == 0) goto L53
            int r8 = r5.length     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            r9 = 13
            if (r8 >= r9) goto L43
            goto L53
        L43:
            r1 = 12
            r1 = r5[r1]     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            r2 = 6
            r2 = r5[r2]     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto La5
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 >= 0) goto La5
            goto L9b
        L53:
            mjs r5 = new mjs     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            int r8 = r11.c()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            int r9 = r11.d()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            r5.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            dqg r8 = r1.c     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            drg r2 = r8.a(r4, r11, r2, r5)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            java.lang.Object r2 = defpackage.qdu.d(r2)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            drg r2 = (defpackage.drg) r2     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            com.google.googlex.gcam.FrameMetadata r4 = r2.b()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r4 == 0) goto L9e
            com.google.googlex.gcam.RawWriteView r4 = r2.a()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r4 == 0) goto L9e
            com.google.googlex.gcam.SpatialGainMap r4 = r2.c()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r4 != 0) goto L7f
            goto L9e
        L7f:
            float r4 = r2.e()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto La5
            dqg r1 = r1.c     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            com.google.googlex.gcam.AeResults r1 = r1.a(r2)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            boolean r2 = r1.Check()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            if (r2 == 0) goto La5
            float r1 = r1.LogSceneBrightness()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto La5
        L9b:
            dsu r1 = defpackage.dsu.ON     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            goto La7
        L9e:
            mkg r1 = r1.a     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            java.lang.String r2 = "AE failed due to incomplete viewfinder frame. Out of memory?"
            r1.c(r2)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
        La5:
            dsu r1 = defpackage.dsu.OFF     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
        La7:
            r3.a(r1)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            goto Lb2
        Lab:
            mch r1 = r0.a     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            dsu r2 = defpackage.dsu.UNKNOWN     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
            r1.a(r2)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.ExecutionException -> Lb8 java.lang.InterruptedException -> Lba
        Lb2:
            r11.close()
            return
        Lb6:
            r0 = move-exception
            goto Lc3
        Lb8:
            r1 = move-exception
            goto Lbb
        Lba:
            r1 = move-exception
        Lbb:
            mch r0 = r0.a     // Catch: java.lang.Throwable -> Lb6
            dsu r1 = defpackage.dsu.UNKNOWN     // Catch: java.lang.Throwable -> Lb6
            r0.a(r1)     // Catch: java.lang.Throwable -> Lb6
            goto Lb2
        Lc3:
            r11.close()
            goto Lc8
        Lc7:
            throw r0
        Lc8:
            goto Lc7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dst.a(java.lang.Object):void");
    }
}