package com.from.gzxant.goodmedicine.ui.view.AdapterView;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;

/**
 * Created by USER on 2018/5/28.
 */

public class TextLayoutView extends BaseLinearLayout{
    private TextView text_type;
    private LayoutParams params;
    public TextLayoutView(Context context) {
        super(context);
        init();
    }
    public void init(){
        text_type=new TextView(mContext);
        text_type.setTextColor(Color.BLACK);
        text_type.getPaint().setFakeBoldText(true);
        text_type.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        this.addView(text_type,params);
    }
    public TextView getTextType(){
        return text_type;
    }

}
