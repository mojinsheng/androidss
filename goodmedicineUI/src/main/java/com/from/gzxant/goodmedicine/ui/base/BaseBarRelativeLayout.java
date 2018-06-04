package com.from.gzxant.goodmedicine.ui.base;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by USER on 2018/5/26.
 */

public class BaseBarRelativeLayout extends BaseRelativeLayout {
    private LinearLayout baseLinearLayout;
    private LinearLayout.LayoutParams params;
    private RelativeLayout.LayoutParams layout;
    private TextView text_publish;
    public BaseBarRelativeLayout(Context context,String _imgName,String _textName) {
        super(context);
        init(_imgName,_textName);
    }
    public void init(String imgName,String textName){
        baseLinearLayout=new LinearLayout(mContext);
        baseLinearLayout.setOrientation(LinearLayout.VERTICAL);

        layout=new RelativeLayout.LayoutParams((int)(marginSize*4), RelativeLayout
                .LayoutParams.MATCH_PARENT);
        layout.topMargin=(int)(marginSize*0.3);
        this.addView(baseLinearLayout,layout);

        ImageView imageView=new ImageView(mContext);
        params=new LinearLayout.LayoutParams((int)(marginSize*1.4),
                (int)(marginSize*1.12));
        params.gravity= Gravity.CENTER;
        imageView.setBackgroundResource(createDrawable(imgName));
        baseLinearLayout.addView(imageView,params);

        text_publish=new TextView(mContext);
        text_publish.setTextSize(16);
        text_publish.setTextColor(Color.rgb(136,132,132));
        text_publish.setText(createString(textName));
        text_publish.getPaint().setFakeBoldText(true);
        text_publish.setGravity(Gravity.CENTER);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        baseLinearLayout.addView(text_publish,params);
    }
}
