package com.hanuor.amber;

import android.content.Context;

import com.hanuor.amber.hub.Connect;

/**
 * Created by Shantanu Johri on 10-08-2016.
 */
public class Amber {
    volatile static Connect mconnect =  null;
    public static Connect with(Context context){
        mconnect = new Connect(context);
        mconnect.setInstance(mconnect);
        return mconnect;
    }
}
