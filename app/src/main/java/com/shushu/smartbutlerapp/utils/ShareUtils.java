package com.shushu.smartbutlerapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名：     SmartButler
 * 包名：       com.shushu.smartbutlerapp.utils
 * 文件名：     ShareUtils
 * Created by  ${SUER} on 2019/2/28
 * 创建时间：   2019.2019/2/28.12:21 AM
 * 描述：  TODO
 */
public class ShareUtils {

    public static final String NANE = "config";

    /**
     * 封装 存储 String方法
     * @param mcontext
     * @param key
     * @param value
     */
    public static void putString(Context mcontext,String key,String value){
        SharedPreferences sp = mcontext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        sp.edit().putString(key,value).commit();
    }

    /**
     * 封装 存储 String方法
     * @param mcontext
     * @param key
     * @param defValue
     */
    public static String getString(Context mcontext,String key, String defValue){
        SharedPreferences sp = mcontext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        return sp.getString(key,defValue);
    }
    /**
     * 封装 存储 String方法
     * @param mcontext
     * @param key
     * @param value
     */
    public static void putInt(Context mcontext,String key,int value){
        SharedPreferences sp = mcontext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        sp.edit().putInt(key,value).commit();
    }
    /**
     * 封装 获取 Int方法
     * @param mcontext
     * @param key
     * @param defValue
     */
    public static int getInt(Context mcontext,String key, int defValue){
        SharedPreferences sp = mcontext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        return sp.getInt(key,defValue);
    }
    /**
     * 封装 存储 Boolean方法
     * @param mcontext
     * @param key
     * @param value
     */
    public static void putBoolean(Context mcontext,String key,boolean value){
        SharedPreferences sp = mcontext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();
    }
    /**
     * 封装 获取 boolean方法
     * @param mcontext
     * @param key
     * @param defValue
     */
    public static boolean getBoolean(Context mcontext,String key, boolean defValue){
        SharedPreferences sp = mcontext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        return sp.getBoolean(key,defValue);
    }

    /**
     * 删除单个sharePreference
     * @param mContext
     * @param key
     */
    public static void deleShare(Context mContext,String key){
        SharedPreferences sp = mContext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }

    /**
     * 删除全部 sharePreference
     * @param mContext
     */
    public static void deleAll(Context mContext){
        SharedPreferences sp = mContext.getSharedPreferences(NANE,Context.MODE_PRIVATE);
        sp.edit().clear();
    }

}
