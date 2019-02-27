package com.shushu.smartbutlerapp.utils;

import android.util.Log;

/**
 * 项目名：     SmartButler
 * 包名：       com.shushu.smartbutlerapp.utils
 * 文件名：     L
 * Created by  ${SUER} on 2019/2/28
 * 创建时间：   2019.2019/2/28.12:12 AM
 * 描述：  TODO Log 封装
 */
public class L {
    //开关
    public static final boolean DEBUG = true;
    //TAG
    public static final String TAG = "Smartbutler";
    //5个等级
    public static void i(String text){
        if (DEBUG)
            Log.i(TAG,text);
    }
    public static void d(String text){
        if (DEBUG)
            Log.d(TAG,text);
    }
    public static void w(String text){
        if (DEBUG)
            Log.w(TAG,text);
    }
    public static void e(String text){
        if (DEBUG)
            Log.e(TAG,text);
    }

}
