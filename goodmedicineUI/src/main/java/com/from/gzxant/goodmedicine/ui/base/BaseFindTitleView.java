package com.from.gzxant.goodmedicine.ui.base;

import android.content.Context;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.text.InputType;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 收搜标题
 * Created by USER on 2018/5/28.
 */

public class BaseFindTitleView extends BaseLinearLayout{
    private LinearLayout areaLinearLayout,searchLinearLayout;
    private LayoutParams params;
    private TextView text_area;
    private ImageView img_down,img_search;
    private LineEditText lineEditText;
    public BaseFindTitleView(Context context) {
        super(context);
        init();
    }
    public void init(){
        this.setBackgroundColor(Color.BLACK);
        this.setOrientation(LinearLayout.HORIZONTAL);
        areaLinearLayout=new LinearLayout(mContext);
        areaLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        params=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.MATCH_PARENT);
        params.setMargins(marginSize,marginSize/2,marginSize/2,marginSize/2);
        this.addView(areaLinearLayout,params);

        //地区显示
        text_area=new TextView(mContext);
        text_area.setText("广州");
        text_area.setTextSize(16);
        text_area.setTextColor(Color.WHITE);
        text_area.setGravity(Gravity.CENTER);
        text_area.getPaint().setFakeBoldText(true);
        params=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.MATCH_PARENT);
        areaLinearLayout.addView(text_area,params);

        //下标
        img_down=new ImageView(mContext);
        img_down.setBackgroundResource(createDrawable("xmy_down"));
        params=new LayoutParams((int)(marginSize*1.5),(int)(marginSize*1.5));
        params.gravity= Gravity.CENTER;
        areaLinearLayout.addView(img_down,params);

        //收搜框
        searchLinearLayout=new LinearLayout(mContext);
        searchLinearLayout.setBackgroundColor(Color.WHITE);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        params.setMargins(marginSize/6,marginSize/2,marginSize/2,marginSize/2);
        this.addView(searchLinearLayout,params);

        img_search=new ImageView(mContext);
        img_search.setBackgroundResource(createDrawable("xmy_search"));
        params=new LayoutParams(marginSize,marginSize);
        params.setMargins(marginSize/2,marginSize/4,marginSize/3,marginSize/4);
        searchLinearLayout.addView(img_search,params);
        //输入框
        lineEditText=new LineEditText(mContext);
        lineEditText.setBackgroundResource(0);
        lineEditText.setHint(createString("xmy_search"));
        lineEditText.setSingleLine(true);
        //lineEditText.setLines(R.color.start_button_color);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
       // params.gravity = Gravity.CENTER_VERTICAL;
       // params.setMargins(marginSize/2,marginSize/4,marginSize,marginSize/4);

        //lineEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        //params.topMargin=marginSize;
        lineEditText.setTextColor(Color.BLACK);
        lineEditText.setHintTextColor(Color.GRAY);
        searchLinearLayout.addView(lineEditText,params);



    }
}
