package com.test.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    private int heartRate;


    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public ToasterMessage() {
        setHeartRate(5);
    }


    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }
}
