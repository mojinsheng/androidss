package com.from.gzxant.goodmedicine.ui.view.AdapterView;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;

/**
 * Created by USER on 2018/6/5.
 */

public class DrugTypeView extends BaseLinearLayout{
    private LayoutParams params;
    TextView text_type;
    public DrugTypeView(Context context) {
        super(context);
        init();
    }
    private void init(){
        this.setOrientation(LinearLayout.VERTICAL);
        text_type=new TextView(mContext);
        text_type.setGravity(Gravity.CENTER);
        text_type.getPaint().setFakeBoldText(true);
        text_type.setTextSize(16);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,marginSize*2);
        this.addView(text_type,params);

        View view=new View(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,marginSize/8);
    }
    public TextView getTextTYpe(){
        return text_type;
    }
}

