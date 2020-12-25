package com.test.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    private int a;
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }

    public ToasterMessage() {
        setA();
    }


    private void setA()
    {
        a = 5;
    }
    public int getA()
    {
        return a;
    }
}
