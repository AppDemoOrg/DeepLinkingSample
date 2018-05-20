package com.abt.deeplinking;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @描述： @DeepLinkApp
 * @作者： @黄卫旗
 * @创建时间： @20/05/2018
 */
public class DeepLinkApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}
