package com.lxlProject.www.app;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by dawnling on 2017/12/8.
 */

public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
