package com.example.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_LONG).show();
    }
}
