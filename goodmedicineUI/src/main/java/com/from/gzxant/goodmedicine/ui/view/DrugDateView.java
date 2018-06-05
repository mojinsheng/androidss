package com.from.gzxant.goodmedicine.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;
import com.from.gzxant.goodmedicine.ui.base.LineEditText;

import java.util.List;

/**
 * 药品数据类
 * Created by USER on 2018/5/28.
 */

public class DrugDateView extends BaseLinearLayout{
    private RelativeLayout titleRelativeLayout;
    private LinearLayout titleLinearLayout,titleLeftLinearLayout,titleRightLinearLayout;
    private LayoutParams params;
    private RelativeLayout.LayoutParams layoutParams;
    private TextView text_drugdate,text_mechanic;
    private LinearLayout searchLinearLayout,searchContentLinearLayout;
    //收搜图片
    private ImageView img_search;

    //收搜文字
    private LineEditText lineEditText;

    //药品分类
    private LinearLayout linearLayout,typeLinearLayout,contentLinearLayout;

    private ListView listView,content_listView;
    public DrugDateView(Context context) {
        super(context);
        init();
    }
    public void init(){
        this.setOrientation(LinearLayout.VERTICAL);
        titleRelativeLayout=new RelativeLayout(mContext);
        titleRelativeLayout.setBackgroundColor(Color.BLACK);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*2.4));
        this.addView(titleRelativeLayout,params);

        titleLinearLayout=new LinearLayout(mContext);
        layoutParams=new RelativeLayout.LayoutParams(mWidth/3,
                ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        layoutParams.topMargin=marginSize/3;
        layoutParams.bottomMargin=marginSize/3;
        titleRelativeLayout.addView(titleLinearLayout,layoutParams);


        titleLeftLinearLayout=new LinearLayout(mContext);
        titleLeftLinearLayout.setBackground(getResources().getDrawable(createDrawable("cornerslinealayout")));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        titleLinearLayout.addView(titleLeftLinearLayout,params);

        //药品
        text_drugdate=new TextView(mContext);
        text_drugdate.setTextColor(Color.rgb(153,153,153));
        text_drugdate.setText(createString("xmy_text_drug"));
        text_drugdate.getPaint().setFakeBoldText(true);
        text_drugdate.setTextSize(16);
        text_drugdate.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        params.setMargins(marginSize/4,marginSize/4,marginSize/4,marginSize/4);
        titleLeftLinearLayout.addView(text_drugdate,params);





        titleRightLinearLayout=new LinearLayout(mContext);
        titleRightLinearLayout.setBackground(getResources().getDrawable(createDrawable("cornersrightlinealayout")));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        titleLinearLayout.addView(titleRightLinearLayout,params);

        //器械
        text_mechanic=new TextView(mContext);
        text_mechanic.setTextColor(Color.rgb(153,153,153));
        text_mechanic.setText(createString("xmy_text_mechanic"));
        text_mechanic.getPaint().setFakeBoldText(true);
        text_mechanic.setTextSize(16);
        text_mechanic.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        params.setMargins(marginSize/4,marginSize/4,marginSize/4,marginSize/4);
        titleRightLinearLayout.addView(text_mechanic,params);


        //搜索
        searchLinearLayout=new LinearLayout(mContext);
        searchLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        searchLinearLayout.setBackgroundColor(Color.rgb(201,201,201));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*2.2));
        this.addView(searchLinearLayout,params);


        searchContentLinearLayout=new LinearLayout(mContext);
        searchContentLinearLayout.setBackground(getResources().getDrawable(createDrawable("searchlinealayout")));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*1.4));
        params.setMargins(marginSize,marginSize/3,marginSize,marginSize/3);
        searchLinearLayout.addView(searchContentLinearLayout,params);

        img_search=new ImageView(mContext);
        img_search.setBackgroundResource(createDrawable("xmy_search"));
        params=new LayoutParams((int)(marginSize*1.4),LayoutParams.MATCH_PARENT);
        params.setMargins(marginSize/2,marginSize/6,marginSize/6,marginSize/6);
        searchContentLinearLayout.addView(img_search,params);

        lineEditText=new LineEditText(mContext);
        lineEditText.setBackgroundResource(0);
        lineEditText.setHint(createString("xmy_search"));
        lineEditText.setSingleLine(true);
        lineEditText.setTextSize(14);
        //lineEditText.setLines(R.color.start_button_color);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER_VERTICAL;
        // params.setMargins(marginSize/2,marginSize/4,marginSize,marginSize/4);

        //lineEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        //params.topMargin=marginSize;
        lineEditText.setTextColor(Color.BLACK);
        lineEditText.setHintTextColor(Color.GRAY);
        searchContentLinearLayout.addView(lineEditText,params);


        //药品类型
        linearLayout=new LinearLayout(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        this.addView(linearLayout,params);

        //左边先显示药品大类
        typeLinearLayout=new LinearLayout(mContext);
        typeLinearLayout.setBackgroundColor(Color.rgb(222,222,222));
        typeLinearLayout.setBackgroundColor(Color.WHITE);
        params=new LayoutParams(mWidth/4,LayoutParams.MATCH_PARENT);
        linearLayout.addView(typeLinearLayout,params);

        listView=new ListView(mContext);
        listView.setBackgroundColor(Color.rgb(222,222,222));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        typeLinearLayout.addView(listView,params);




        //右边显示详情
        contentLinearLayout=new LinearLayout(mContext);
        contentLinearLayout.setBackgroundColor(Color.WHITE);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        linearLayout.addView(contentLinearLayout,params);

        content_listView=new ListView(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        contentLinearLayout.addView(content_listView,params);
    }
    public TextView getTetxDrugdate(){
        return  text_drugdate;
    }
    public ListView getListView(){
        return listView;
    }
    public ListView getContentListView(){
        return content_listView;
    }
}
