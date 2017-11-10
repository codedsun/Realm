package com.example.suneetsri.realm;

import android.app.Application;

import io.realm.Realm;


/**
 * Created by suneetsri on 10/11/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
