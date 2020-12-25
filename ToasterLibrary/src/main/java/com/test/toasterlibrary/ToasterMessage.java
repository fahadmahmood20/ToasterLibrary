package com.test.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    private int a;

    public static void s(Context c, String message) {
        ToasterMessage1 toasterMessage1 = new ToasterMessage1();
        Toast.makeText(c, toasterMessage1.getMessage(), Toast.LENGTH_SHORT).show();
    }

    public ToasterMessage() {
        setA();
    }


    private void setA() {
        a = 5;
    }

    public int getA() {
        return a;
    }
}
