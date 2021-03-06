package com.lxlProject.www.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;

import com.blankj.utilcode.util.Utils;

public class VersionUtils {

    public static int getColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return Utils.getApp().getColor(color);
        } else {
            return  Utils.getApp().getResources().getColor(color);
        }
    }

    public static Drawable getDrawable(Context context, @DrawableRes int id ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return context.getDrawable(id);
        } else {
            return context.getResources().getDrawable(id);
        }
    }
}
