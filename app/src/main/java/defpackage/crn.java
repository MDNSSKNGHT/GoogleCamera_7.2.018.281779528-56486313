package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: crn  reason: default package */
/* loaded from: classes.dex */
public class crn extends View {
    public final mko f;

    public crn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new mko();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a() {
        return this.f.e != null;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mko mkoVar = this.f;
        mjo b = mjo.b(kfu.c(getContext()));
        mkoVar.a = new RectF(i, i2, i3, i4);
        mkoVar.c = b;
        mkoVar.a();
        mkoVar.f = null;
        mkoVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Matrix b() {
        return this.f.b();
    }
}