package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: gtm  reason: default package */
/* loaded from: classes.dex */
public class gtm {
    public static final prx a = prx.b(guw.FPS_AUTO, 2131231240, guw.FPS_30, 2131231236, guw.FPS_60, 2131231238);
    public static final prx b = prx.b(guw.FPS_AUTO, new guu(guw.FPS_AUTO, 2131231240, 2131952002, 2131952003), guw.FPS_30, new guu(guw.FPS_30, 2131231236, 2131951998, 2131951999), guw.FPS_60, new guu(guw.FPS_60, 2131231238, 2131952000, 2131952001));
    public final gut c = a();
    public final gut d = gut.a(guv.RAW_OUTPUT, prx.b(guw.UNSELECTED, 2131231125, guw.SELECTED, 2131231126), 2131952438, 2131952439, prr.a(new guu(guw.UNSELECTED, 2131231125, 2131952440, 2131952440), new guu(guw.SELECTED, 2131231127, 2131952441, 2131952441)));
    public final gut e = b(guv.BACK_PHOTO_FLASH);
    public final gut f;
    public final gut g;
    public final gut h;
    public final gut i;
    public final gut j;
    public final gut k;
    public final gut l;
    public final gut m;
    public final gut n;
    public final gut o;
    public final gut p;
    public final gut q;
    private final cin r;

    public gtm(cin cinVar) {
        gut a2;
        gut a3;
        this.r = cinVar;
        if (this.r.b(cjc.d)) {
            a2 = b(guv.FRONT_PHOTO_FLASH);
        } else {
            a2 = gut.a(guv.FRONT_PHOTO_FLASH, prx.b(guw.PHOTO_FLASH_OFF, 2131231082, guw.PHOTO_FLASH_ON, 2131231083), 2131952081, 2131952086, prr.a(new guu(guw.PHOTO_FLASH_OFF, 2131231082, 2131952083, 2131952082), new guu(guw.PHOTO_FLASH_ON, 2131231083, 2131952085, 2131952084)));
        }
        this.f = a2;
        this.g = a(guv.NIGHT_FRONT_PHOTO_FLASH);
        this.h = c(guv.BACK_VIDEO_FLASH);
        if (!this.r.b(cjc.d)) {
            a3 = a(guv.FRONT_VIDEO_FLASH);
        } else {
            a3 = c(guv.FRONT_VIDEO_FLASH);
        }
        this.i = a3;
        this.j = gut.a(guv.MICROPHONE, prx.b(guw.EXT_MICROPHONE_ON, 2131231346, guw.EXT_MICROPHONE_OFF, 2131231345), 2131951946, 2131951953, prr.a(new guu(guw.EXT_MICROPHONE_ON, 2131231346, 2131951952, 2131951950), new guu(guw.EXT_MICROPHONE_OFF, 2131231345, 2131951949, 2131951947)));
        this.k = gut.a(guv.MICROVIDEO, prx.b(guw.MICROVIDEO_OFF, 2131231348, guw.MICROVIDEO_ON, 2131231097, guw.MICROVIDEO_AUTO, 2131231093), 2131952160, 2131952153, prr.a(new guu(guw.MICROVIDEO_OFF, 2131231348, 2131952154, 2131952155), new guu(guw.MICROVIDEO_AUTO, 2131231279, 2131952151, 2131952152), new guu(guw.MICROVIDEO_ON, 2131231349, 2131952157, 2131952158)));
        this.l = gut.a(guv.BEAUTIFICATION, prx.b(guw.BEAUTIFICATION_OFF, 2131231060, guw.BEAUTIFICATION_ON_LIGHT, 2131231061, guw.BEAUTIFICATION_ON_STRONG, 2131231062), 2131951963, 2131951964, prr.a(new guu(guw.BEAUTIFICATION_OFF, 2131231060, 2131951967, 2131951965), new guu(guw.BEAUTIFICATION_ON_LIGHT, 2131231061, 2131951969, 2131951968), new guu(guw.BEAUTIFICATION_ON_STRONG, 2131231062, 2131951972, 2131951970)));
        this.m = gut.a(guv.AF, prx.b(guw.AF_ON, 2131231248, guw.AF_ON_LOCKED, 2131231288, guw.AF_OFF_NEAR, 2131231277, guw.AF_OFF_FAR, 2131231288), 2131951728, 2131951718, prr.a(new guu(guw.AF_ON, 2131231248, 2131951727, 2131951725), new guu(guw.AF_OFF_NEAR, 2131231277, 2131951724, 2131951723), new guu(guw.AF_OFF_FAR, 2131231288, 2131951720, 2131951719)));
        prt prtVar = new prt();
        prtVar.a(guw.AF_ON, 2131231248);
        prtVar.a(guw.AF_ON_LOCKED, 2131231269);
        prtVar.a(guw.AF_OFF_NEAR, 2131231288);
        prtVar.a(guw.AF_OFF_FAR, 2131231269);
        prm prmVar = new prm();
        prmVar.c(new guu(guw.AF_ON, 2131231248, 2131951727, 2131951725));
        prmVar.c(new guu(guw.AF_OFF_NEAR, 2131231288, 2131951724, 2131951723));
        prmVar.c(new guu(guw.AF_OFF_FAR, 2131231269, 2131951720, 2131951719));
        if (this.r.c(cim.e)) {
            prtVar.a(guw.AF_OFF_INFINITY, 2131231269);
            prmVar.c(new guu(guw.AF_OFF_INFINITY, 2131231269, 2131951722, 2131951721));
        }
        this.n = gut.a(guv.AF, prtVar.a(), 2131951728, 2131951718, prmVar.a());
        this.o = gut.a(guv.IMAX_AUDIO, prx.b(guw.IMAX_AUDIO_OFF, 2131231275, guw.IMAX_AUDIO_ON, 2131231276), 2131952091, 2131952091, prr.a(new guu(guw.IMAX_AUDIO_OFF, 2131231275, 2131952092, 2131952093), new guu(guw.IMAX_AUDIO_ON, 2131231276, 2131952094, 2131952095)));
        this.p = gut.a(guv.ASPECT_RATIO, prx.b(guw.SIXTEEN_BY_NINE, 2131231123, guw.FOUR_BY_THREE, 2131231124), 2131951736, 2131951736, prr.a(new guu(guw.SIXTEEN_BY_NINE, 2131231123, 2131952503, 2131952504), new guu(guw.FOUR_BY_THREE, 2131231124, 2131951996, 2131951997)));
        this.q = gut.a(guv.PHOTO_SPHERE, prx.b(guw.PHOTO_SPHERE, 2131231353, guw.HORIZONTAL_PHOTO_SPHERE, 2131231284, guw.VERTICAL_PHOTO_SPHERE, 2131231285, guw.WIDE_ANGLE_PHOTO_SPHERE, 2131231287, guw.FISH_EYE_PHOTO_SPHERE, 2131231282), 2131952305, 2131952306, prr.a(new guu(guw.PHOTO_SPHERE, 2131231353, 2131952257, 2131952259), new guu(guw.HORIZONTAL_PHOTO_SPHERE, 2131231284, 2131952263, 2131952264), new guu(guw.VERTICAL_PHOTO_SPHERE, 2131231285, 2131952266, 2131952267), new guu(guw.WIDE_ANGLE_PHOTO_SPHERE, 2131231287, 2131952268, 2131952269), new guu(guw.FISH_EYE_PHOTO_SPHERE, 2131231282, 2131952261, 2131952262)));
    }

    private static final gut b(guv guvVar) {
        return gut.a(guvVar, prx.b(guw.PHOTO_FLASH_OFF, 2131231259, guw.PHOTO_FLASH_AUTO, 2131231258, guw.PHOTO_FLASH_ON, 2131231260), 2131951989, 2131951994, prr.a(new guu(guw.PHOTO_FLASH_OFF, 2131231259, 2131951795, 2131951991), new guu(guw.PHOTO_FLASH_AUTO, 2131231258, 2131951794, 2131951987), new guu(guw.PHOTO_FLASH_ON, 2131231260, 2131951796, 2131951993)));
    }

    public gut a() {
        return gut.a(guv.HDR, prx.b(guw.HDR_OFF, 2131231074, guw.HDR_AUTO, 2131231076, guw.HDR_ON, 2131231072), 2131952055, 2131952065, prr.a(new guu(guw.HDR_OFF, 2131231074, 2131952058, 2131952059), new guu(guw.HDR_AUTO, 2131231076, 2131952151, 2131952054), new guu(guw.HDR_ON, 2131231072, 2131952060, 2131952061)));
    }

    private final gut a(guv guvVar) {
        if (this.r.b(cjc.d)) {
            return gut.a(guvVar, prx.b(guw.VIDEO_FLASH_OFF, 2131231082, guw.VIDEO_FLASH_ON, 2131231083), 2131952081, 2131952086, prr.a(new guu(guw.VIDEO_FLASH_OFF, 2131231082, 2131952083, 2131952082), new guu(guw.VIDEO_FLASH_ON, 2131231083, 2131952085, 2131952084)));
        }
        return gut.a(guvVar, prx.b(guw.VIDEO_FLASH_OFF, 2131231082, guw.VIDEO_FLASH_ON, 2131231083), 2131952081, 2131952086, prr.a(new guu(guw.VIDEO_FLASH_OFF, 2131231082, 2131952083, 2131952082), new guu(guw.VIDEO_FLASH_ON, 2131231083, 2131952085, 2131952084)));
    }

    public final gut a(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new guu(guw.TIMER_ZERO_SECONDS, 2131231411, 2131952548, 2131952549));
        if (z) {
            arrayList.add(new guu(guw.TIMER_AUTO, 2131231410, 2131952545, 2131952546));
        }
        arrayList.add(new guu(guw.TIMER_THREE_SECONDS, 2131231409, 2131952542, 2131952544));
        arrayList.add(new guu(guw.TIMER_TEN_SECONDS, 2131231408, 2131952539, 2131952541));
        return gut.a(guv.TIMER, prx.b(guw.TIMER_ZERO_SECONDS, 2131231411, guw.TIMER_AUTO, 2131231410, guw.TIMER_THREE_SECONDS, 2131231409, guw.TIMER_TEN_SECONDS, 2131231408), 2131952547, 2131952550, prr.a((Collection) arrayList));
    }

    private static final gut c(guv guvVar) {
        return gut.a(guvVar, prx.b(guw.VIDEO_FLASH_OFF, 2131231259, guw.VIDEO_FLASH_ON, 2131231260), 2131951989, 2131951994, prr.a(new guu(guw.VIDEO_FLASH_OFF, 2131231259, 2131951795, 2131951991), new guu(guw.VIDEO_FLASH_ON, 2131231260, 2131951796, 2131951993)));
    }
}