package com.from.dididache.activity;

import android.app.Activity;
import android.os.Bundle;

import com.from.dididache.view.BindPhoneView;

/**
 * 更换手机
 * Created by USER on 2018/5/12.
 */

public class BindPhoneActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BindPhoneView bindPhoneView=new BindPhoneView(this);
        setContentView(bindPhoneView);
    }
}
