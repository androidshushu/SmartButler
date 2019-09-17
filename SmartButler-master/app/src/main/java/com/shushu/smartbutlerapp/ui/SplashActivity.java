package com.shushu.smartbutlerapp.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.shushu.smartbutlerapp.R;
import com.shushu.smartbutlerapp.utils.ShareUtils;
import com.shushu.smartbutlerapp.utils.StaticClass;

/**
 * 项目名：     SmartButler-master
 * 包名：       com.shushu.smartbutlerapp.ui
 * 文件名：     SplashActivity
 * Created by  ${SUER} on 2019/3/18
 * 创建时间：   2019.2019/3/18.10:34 PM
 * 描述：  TODO 闪屏页
 */
public class SplashActivity extends AppCompatActivity {

    /**
     * 1。延时2000
     * 2。判断第一次运行
     * 3。自定义字体
     * 4。Activity全屏主题
     * @param savedInstanceState
     */

    private TextView tv_splash;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case StaticClass.HANDLER_SPLASH:
                    if (isFirst())
                    break;
                default:
                    break;
            }
        }


    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    private boolean isFirst() {
        boolean isFirst = ShareUtils.getBoolean(this,StaticClass.SHARE_IS_FIRST,true);
        if (isFirst){
            //第一次运行
            ShareUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
            return true;
        }else {
            return false;
        }

    }
    private void initView() {

    }
}
