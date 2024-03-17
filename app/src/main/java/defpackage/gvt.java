package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gvt  reason: default package */
/* loaded from: classes.dex */
public final class gvt extends ConstraintLayout {
    public final ArrayList b;
    public final Map c;
    public final Map d;
    public final TextView e;
    public final TextView f;
    public final gut g;
    public guw h;
    public final Context i;
    public final gva j;

    public gvt(Context context, gut gutVar, guw guwVar, gva gvaVar) {
        super(context);
        this.g = gutVar;
        this.h = guwVar;
        this.i = context;
        this.j = gvaVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new HashMap();
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setId(View.generateViewId());
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setId(View.generateViewId());
    }

    @SuppressLint("ResourceType")
    public final void a(guw guwVar) {
        this.h = guwVar;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImageButton imageButton = (ImageButton) arrayList.get(i);
            if (this.c.get(guwVar) == imageButton) {
                imageButton.setBackground(getResources().getDrawable(2131231214, null));
            } else {
                imageButton.setBackground(getResources().getDrawable(2131231215, null));
            }
        }
        pwy d = this.g.e().d();
        while (d.hasNext()) {
            guu guuVar = (guu) d.next();
            if (guuVar.a == guwVar) {
                this.f.setText(guuVar.c);
                this.f.setContentDescription(getResources().getString(guuVar.d));
                this.f.announceForAccessibility(getResources().getString(guuVar.d));
                return;
            }
        }
    }
}