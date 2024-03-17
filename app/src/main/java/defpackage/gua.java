package defpackage;

/* compiled from: PG */
/* renamed from: gua */
/* loaded from: classes.dex */
final /* synthetic */ class gua implements mjw {
    private final gun a;
    private final pov b;
    private final mdl c;
    private final gut d;

    public gua(gun gunVar, pov povVar, mdl mdlVar, gut gutVar) {
        this.a = gunVar;
        this.b = povVar;
        this.c = mdlVar;
        this.d = gutVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00af A[Catch: all -> 0x00d2, TryCatch #2 {, blocks: (B:54:0x0041, B:56:0x0047, B:59:0x004e, B:69:0x00a7, B:71:0x00af, B:73:0x00b3, B:76:0x00b8, B:77:0x00bc, B:79:0x00c7, B:81:0x00cb, B:82:0x00d0, B:68:0x006a, B:60:0x004f, B:62:0x0062, B:63:0x0065), top: B:88:0x0041 }] */
    @Override // defpackage.mjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r8) {
        /*
            r7 = this;
            gun r0 = r7.a
            pov r1 = r7.b
            mdl r2 = r7.c
            gut r3 = r7.d
            guw r4 = defpackage.guw.UNKNOWN
            guw r1 = defpackage.gun.a(r1, r2, r4)
            guw r2 = defpackage.guw.UNKNOWN
            if (r1 != r2) goto L3c
            java.lang.String r0 = defpackage.gun.a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 52
            r2.<init>(r1)
            java.lang.String r1 = "Property value "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r8 = " is not associated with a MenuOption."
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            defpackage.liu.b(r0, r8)
            return
        L3c:
            if (r3 == 0) goto Ld5
            com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer r8 = r0.ax
            monitor-enter(r8)
            com.google.android.apps.camera.optionsbar.view.OptionsMenuView r0 = r8.d()     // Catch: java.lang.Throwable -> Ld2
            if (r1 == 0) goto L6a
            boolean r2 = r3.a(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r2 != 0) goto L4e
            goto L6a
        L4e:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Ld2
            java.util.Map r2 = r0.e     // Catch: java.lang.Throwable -> L67
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L67
            java.util.Map r2 = r0.f     // Catch: java.lang.Throwable -> L67
            guv r4 = r3.a()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L67
            gvt r2 = (defpackage.gvt) r2     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L65
            r2.a(r1)     // Catch: java.lang.Throwable -> L67
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto La7
        L67:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r1     // Catch: java.lang.Throwable -> Ld2
        L6a:
            java.lang.String r0 = com.google.android.apps.camera.optionsbar.view.OptionsMenuView.a     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld2
            guv r4 = r3.a()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Ld2
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Ld2
            int r5 = r5 + 69
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Ld2
            int r6 = r6.length()     // Catch: java.lang.Throwable -> Ld2
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "Attempted to set invalid value. "
            r6.append(r5)     // Catch: java.lang.Throwable -> Ld2
            r6.append(r2)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = " is not a valid option for category: "
            r6.append(r2)     // Catch: java.lang.Throwable -> Ld2
            r6.append(r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> Ld2
            defpackage.liu.a(r0, r2)     // Catch: java.lang.Throwable -> Ld2
        La7:
            guv r0 = r3.a()     // Catch: java.lang.Throwable -> Ld2
            guv r2 = defpackage.guv.MICROVIDEO     // Catch: java.lang.Throwable -> Ld2
            if (r0 != r2) goto Ld0
            guw r0 = defpackage.guw.MICROVIDEO_ON     // Catch: java.lang.Throwable -> Ld2
            if (r1 == r0) goto Lbc
            guw r0 = defpackage.guw.MICROVIDEO_AUTO     // Catch: java.lang.Throwable -> Ld2
            if (r1 != r0) goto Lb8
            goto Lbc
        Lb8:
            r8.o()     // Catch: java.lang.Throwable -> Ld2
            goto Ld0
        Lbc:
            android.widget.ImageButton r0 = r8.b()     // Catch: java.lang.Throwable -> Ld2
            r8.a(r0)     // Catch: java.lang.Throwable -> Ld2
            boolean r0 = r8.o     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Ld0
            android.graphics.drawable.VectorDrawable r0 = r8.n     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Ld0
            r1 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> Ld2
        Ld0:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld2
            return
        Ld2:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld2
            throw r0
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gua.a(java.lang.Object):void");
    }
}