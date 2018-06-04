package com.from.gzxant.goodmedicine.ui.view;

import android.content.Context;
import android.graphics.Color;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;

/**
 * Created by USER on 2018/5/28.
 */

public class PersonView extends BaseLinearLayout {
    public PersonView(Context context) {
        super(context);
        init();
    }
    public void init(){
        this.setBackgroundColor(Color.WHITE);
    }
}
