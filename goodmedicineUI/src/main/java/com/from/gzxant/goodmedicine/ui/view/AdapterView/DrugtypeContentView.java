package com.from.gzxant.goodmedicine.ui.view.AdapterView;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;

/**
 * 药库数据第一级分类
 * Created by USER on 2018/6/5.
 */

public class DrugTypeContentView extends BaseLinearLayout{
    private LinearLayout drugTypeContentLinearLayout;
    private RelativeLayout drugTypeContentRelativeLayout;
    private LayoutParams params;
    private RelativeLayout.LayoutParams layoutParams;
    private TextView text_typeName;
    private ImageView img_down;
    private ListView list_content;
    TextView text_type;
    public DrugTypeContentView(Context context) {
        super(context);
        init();
    }
    private void init(){
        this.setOrientation(LinearLayout.VERTICAL);
        drugTypeContentRelativeLayout=new RelativeLayout(mContext);
        layoutParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                (int)(marginSize*1.6));
        this.addView(drugTypeContentRelativeLayout,layoutParams);

        text_typeName=new TextView(mContext);
        text_typeName.setTextSize(14);
        text_typeName.setGravity(Gravity.CENTER);
        text_typeName.getPaint().setFakeBoldText(true);
        text_typeName.setTextColor(Color.rgb(189,189,189));
        layoutParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        drugTypeContentRelativeLayout.addView(text_typeName,layoutParams);


        img_down=new ImageView(mContext);
        img_down.setBackgroundResource(createDrawable("xmy_img_down"));
        layoutParams=new RelativeLayout.LayoutParams((int)(marginSize*0.7),(int)(marginSize*0.7));
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        layoutParams.rightMargin=marginSize;
        layoutParams.topMargin=marginSize/4;
        drugTypeContentRelativeLayout.addView(img_down,layoutParams);

        drugTypeContentLinearLayout=new LinearLayout(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        this.addView(drugTypeContentLinearLayout,params);


        list_content=new ListView(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        drugTypeContentLinearLayout.addView(list_content,params);


    }
    public TextView getTextTYpe(){
        return text_typeName;
    }
    public ImageView getImgdown(){
        return img_down;
    }
    public ListView getListContent(){
        return list_content;
    }
}

