package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import java.io.IOException;

public final class gm {
    public static final id a = new id(16);

    static {
        new kq((byte) 0);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        int i2 = Build.VERSION.SDK_INT;
        return Typeface.create(typeface, i);
    }

    public static Typeface a(Context context, ga gaVar, Resources resources, int i, int i2, gi giVar, boolean z) {
        gc[] gcVarArr;
        Typeface typeface;
        if (gaVar instanceof gd) {
            gd gdVar = (gd) gaVar;
            typeface = hg.a(context, gdVar.a, giVar, !z ? giVar != null : gdVar.c != 0, z ? gdVar.b : -1, i2);
        } else {
            FontFamily.Builder builder = null;
            for (gc gcVar : ((gb) gaVar).a) {
                try {
                    Font build = new Font.Builder(resources, gcVar.e).setWeight(gcVar.a).setSlant(gcVar.b ? FontStyle.FONT_SLANT_ITALIC : FontStyle.FONT_SLANT_UPRIGHT).setTtcIndex(gcVar.d).setFontVariationSettings(gcVar.c).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException e) {
                }
            }
            if (builder != null) {
                typeface = new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) == 0 ? 400 : 700, (i2 & 2) != 0 ? FontStyle.FONT_SLANT_ITALIC : FontStyle.FONT_SLANT_UPRIGHT)).build();
            } else {
                typeface = null;
            }
            if (giVar != null) {
                if (typeface != null) {
                    giVar.b(typeface);
                } else {
                    giVar.a(-3);
                }
            }
        }
        if (typeface != null) {
            a.a(a(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}