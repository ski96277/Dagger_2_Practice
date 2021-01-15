package com.example.dagger2basicpractice;

import android.util.Log;

public class Tires {
    private static final String TAG = "Tires";
    public Tires() {
    }

    public void inflate(){
        Log.d(TAG, "inflate: tires inflate call");
    }
}
