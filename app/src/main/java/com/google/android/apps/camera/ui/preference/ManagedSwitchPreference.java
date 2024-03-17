package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

public class ManagedSwitchPreference extends SwitchPreference {
    public ManagedSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ManagedSwitchPreference(Context context) {
        super(context);
    }
}
