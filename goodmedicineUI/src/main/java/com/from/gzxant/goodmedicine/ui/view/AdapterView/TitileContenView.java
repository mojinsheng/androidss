package com.from.gzxant.goodmedicine.ui.view.AdapterView;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;
import com.from.gzxant.goodmedicine.ui.view.xCRoundImage.XCRoundImageView;

/**
 * Created by USER on 2018/5/30.
 */

public class TitileContenView extends BaseLinearLayout{
    private XCRoundImageView xcRoundImageView;
    private LayoutParams params;
    private LinearLayout textLinearLayout;
    private TextView text_name,text_content;

    public TitileContenView(Context context) {
        super(context);
        init();
    }
    public void init(){
        this.setOrientation(LinearLayout.HORIZONTAL);
        xcRoundImageView=new XCRoundImageView(mContext);
        xcRoundImageView.setImageDrawable(getResources().getDrawable(createDrawable("xmy_img_persion")));
        params=new LayoutParams(marginSize*2,marginSize*2);
        params.setMargins(marginSize/2,marginSize/3,marginSize,marginSize/3);
        this.addView(xcRoundImageView,params);

        textLinearLayout=new LinearLayout(mContext);
        textLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        this.addView(textLinearLayout,params);

        text_name=new TextView(mContext);
        text_name.setTextColor(Color.rgb(151,151,151));
        text_name.setGravity(Gravity.CENTER);
        text_name.setTextSize(16);
        text_name.getPaint().setFakeBoldText(true);
        params=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        textLinearLayout.addView(text_name,params);

        text_content=new TextView(mContext);
        text_content.setTextColor(Color.rgb(151,151,151));
        text_content.setGravity(Gravity.CENTER);
        text_content.setTextSize(16);
        text_content.getPaint().setFakeBoldText(true);
        params=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        textLinearLayout.addView(text_content,params);
    }
    public TextView gettextName(){
        return text_name;
    }
    public TextView gettextContent(){
        return text_content;
    }
}
