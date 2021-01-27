package com.biocheck.library;

import android.content.Context;
import android.widget.Toast;

public class Calculations {

    public Calculations() {
        System.loadLibrary("native-lib");
    }

    public native int getHeartRate(int val1, int val2);

}
