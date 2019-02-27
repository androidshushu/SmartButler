package com.shushu.smartbutlerapp.ui;

/**
 * 项目名：    SmartButlerApp
 * 包名：      com.shushu.smartbutlerapp.ui
 * 文件名：    BaseActivity
 * Created by shushu on 2019/1/27.
 * 创建时间：  2019.2019/1/27.14:14 .
 * 描述：  TODO
 */

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * 主要做的事情
 * 统一的属性
 * 统一的接口
 * 统一的方法
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        getSupportActionBar().setElevation(0);
        //显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
