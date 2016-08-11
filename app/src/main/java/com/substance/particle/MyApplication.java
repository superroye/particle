package com.substance.particle;

import android.app.Application;

/**
 * Created by Roye on 2016/8/11.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化一些框架设置，以及其他
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
