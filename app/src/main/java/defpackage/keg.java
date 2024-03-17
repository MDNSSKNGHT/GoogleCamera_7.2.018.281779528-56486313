package defpackage;

/* compiled from: PG */
/* renamed from: keg  reason: default package */
/* loaded from: classes.dex */
final class keg implements kej {
    private final /* synthetic */ kei a;

    public keg(kei keiVar) {
        this.a = keiVar;
    }

    @Override // defpackage.kej
    public final void onShutterButtonClick() {
        synchronized (this.a.c) {
            for (kej kejVar : this.a.d) {
                kejVar.onShutterButtonClick();
            }
        }
    }

    @Override // defpackage.kej
    public final void onShutterButtonDown() {
        synchronized (this.a.c) {
            for (kej kejVar : this.a.d) {
                kejVar.onShutterButtonDown();
            }
        }
    }

    @Override // defpackage.kej
    public final void onShutterButtonLongPressRelease() {
        synchronized (this.a.c) {
            this.a.b.setVisualFeedbackForEnableState(true);
            for (kej kejVar : this.a.d) {
                kejVar.onShutterButtonLongPressRelease();
            }
        }
    }

    @Override // defpackage.kej
    public final void onShutterButtonLongPressed() {
        synchronized (this.a.c) {
            this.a.b.setVisualFeedbackForEnableState(false);
            for (kej kejVar : this.a.d) {
                kejVar.onShutterButtonLongPressed();
            }
        }
    }

    @Override // defpackage.kej
    public final void onShutterButtonPressedStateChanged(boolean z) {
        synchronized (this.a.c) {
            for (kej kejVar : this.a.d) {
                kejVar.onShutterButtonPressedStateChanged(z);
            }
        }
    }

    @Override // defpackage.kej
    public final void onShutterTouch(kmn kmnVar) {
        synchronized (this.a.c) {
            for (kej kejVar : this.a.d) {
                kejVar.onShutterTouch(kmnVar);
            }
        }
    }
}