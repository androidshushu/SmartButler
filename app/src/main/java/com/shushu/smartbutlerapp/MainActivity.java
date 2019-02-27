package com.shushu.smartbutlerapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.shushu.smartbutlerapp.databinding.ActivityMainBinding;
import com.shushu.smartbutlerapp.entity.UserBean;
import com.shushu.smartbutlerapp.fragment.BulterFragment;
import com.shushu.smartbutlerapp.fragment.GirlFragment;
import com.shushu.smartbutlerapp.fragment.UserFragment;
import com.shushu.smartbutlerapp.fragment.WechatFragment;
import com.shushu.smartbutlerapp.ui.SettingActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //TabLayout
    private TabLayout mTabLayout;
    //ViewPager
    private ViewPager mViewPager;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment>mFragment;
    //悬浮窗
    private FloatingActionButton fab_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding databing = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserBean userBean = new UserBean("贝贝",2);
        databing.setUser(userBean);
        getSupportActionBar().setElevation(0);
        initDate();
        initView();



        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        databing.setList(list);

        HashMap<String,Object> map = new HashMap<>();
        map.put("key0","map_value0");
        map.put("key1","map_value1");
        databing.setMap(map);

        String[]  arrays = {"zifuchuan","zifuchuan2"};
        databing.setArray(arrays);
    }

    //初始化数据
    private void initDate() {
        mTitle = new ArrayList<>();
        mTitle.add(getString(R.string.butlerFragmentName));
        mTitle.add(getString(R.string.weChatFragmentName));
        mTitle.add(getString(R.string.girlFragmentName));
        mTitle.add(getString(R.string.userFragmentName));

        mFragment = new ArrayList<>();
        mFragment.add(new BulterFragment());
        mFragment.add(new WechatFragment());
        mFragment.add(new GirlFragment());
        mFragment.add(new UserFragment());

    }
    //初始化view
    private void initView() {
        mTabLayout = findViewById(R.id.mTabLayout);
        mViewPager = findViewById(R.id.mViewPager);
        fab_setting = findViewById(R.id.fab_setting);
        fab_setting.setOnClickListener(this);
        fab_setting.setVisibility(View.GONE);

        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());

        // mViewPager 滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.i("TAG",position+"");
                if (position == 0){
                    fab_setting.setVisibility(View.GONE);
                }else {
                    fab_setting.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }
            //返回item的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }
            //设置标题

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void onClick(View view) {
        switch  (view.getId()){
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
        }
    }
}
