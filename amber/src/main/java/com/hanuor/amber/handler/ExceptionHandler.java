package com.hanuor.amber.handler;

import android.util.Log;

/**
 * Created by Shantanu Johri on 10-08-2016.
 */
public class ExceptionHandler {

    public static void writeMessage(String message) {
        Log.d("Onyx-Message", message);
    }

    public static void writeError(String error) {
        Log.e("Onyx-Error", error);
    }
}
