package com.from.gzxant.goodmedicine.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.ui.base.BaseBarRelativeLayout;
import com.from.gzxant.goodmedicine.ui.base.BaseRelativeLayout;
import com.from.gzxant.goodmedicine.ui.view.ChildContent;

/**
 * 主容器页面
 * Created by USER on 2018/5/25.
 */

public class ContainerView extends BaseRelativeLayout{
    private LinearLayout mContainerLayout;
    private RelativeLayout statusBarRLayout,barRLayout;
    private LinearLayout.LayoutParams params;
    private ChildContent childContent;
    private LinearLayout barLinearLayout;
    private RelativeLayout.LayoutParams layoutParams;
    private ImageView img_publish;
    private TextView text_publish;
    private LinearLayout indexDrugLayout,findDrugPersonLayout;
    private LinearLayout indexLayout,drugLayout,publishLayout,findLayout,personLayout;
    private BaseBarRelativeLayout indexBarRelativeLayout,drugBarRelativeLayout,findBarRelativeLayout,
            personBarRelativeLayout;
    //导航栏不见
    //private LinearLayout indexlayout;

    public ContainerView(Context context) {
        super(context);
        init();
    }
    public void init(){
        //this.setOrientation(LinearLayout.VERTICAL);

        //内容
        mContainerLayout=new LinearLayout(mContext);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        this.addView(mContainerLayout,params);

        //fragment替换的View
        childContent=new ChildContent(mContext,1234567);
        childContent.setOrientation(LinearLayout.VERTICAL);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.922));
        mContainerLayout.addView(childContent,params);

        //导航栏
        statusBarRLayout=new RelativeLayout(mContext);
        statusBarRLayout.setBackgroundColor(Color.rgb(234,234,234));
       // statusBarRLayout.setBackgroundColor(Color.YELLOW);
        //statusBarRLayout.setOrientation(LinearLayout.VERTICAL);
        layoutParams=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.07312));
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        this.addView(statusBarRLayout,layoutParams);



        //首页、药库数据、药好找、个人中心
        barLinearLayout=new LinearLayout(mContext);
        barLinearLayout.setOrientation(LinearLayout.VERTICAL);
        layoutParams=new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        statusBarRLayout.addView(barLinearLayout,layoutParams);



        View view=new View(mContext);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,marginSize/8);
        view.setBackgroundColor(Color.rgb(233,232,229));
        barLinearLayout.addView(view,params);

        indexDrugLayout=new LinearLayout(mContext);
        indexDrugLayout.setOrientation(LinearLayout.HORIZONTAL);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);

        //params.setMargins(marginSize,marginSize/3,marginSize/2,marginSize/3);
        barLinearLayout.addView(indexDrugLayout,params);

        //主页
        indexLayout=new LinearLayout(mContext);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        //params.setMargins(marginSize,marginSize/3,marginSize/2,marginSize/3);
        indexDrugLayout.addView(indexLayout,params);

        indexBarRelativeLayout=new BaseBarRelativeLayout(mContext,"xmy_index","xmy_index");
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);

        indexLayout.addView(indexBarRelativeLayout,params);


        //药品数据
        drugLayout=new LinearLayout(mContext);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        //params.setMargins(marginSize,marginSize/3,marginSize/2,marginSize/3);
        indexDrugLayout.addView(drugLayout,params);

        drugBarRelativeLayout=new BaseBarRelativeLayout(mContext,"xmy_drug","xmy_drug");
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        drugLayout.addView(drugBarRelativeLayout,params);



        LinearLayout linearLayout3=new LinearLayout(mContext);
        linearLayout3.setBackgroundColor(Color.TRANSPARENT);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        //params.setMargins(marginSize,marginSize/3,marginSize/2,marginSize/3);
        indexDrugLayout.addView(linearLayout3,params);

        //药好找
        findLayout=new LinearLayout(mContext);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        //params.setMargins(marginSize,marginSize/3,marginSize/2,marginSize/3);
        indexDrugLayout.addView(findLayout,params);

        findBarRelativeLayout=new BaseBarRelativeLayout(mContext,"xmy_find","xmy_find");
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        findLayout.addView(findBarRelativeLayout,params);


        //个人中心
        personLayout=new LinearLayout(mContext);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,1);
        //params.setMargins(marginSize,marginSize/3,marginSize/2,marginSize/3);
        indexDrugLayout.addView(personLayout,params);

        personBarRelativeLayout=new BaseBarRelativeLayout(mContext,"xmy_person","xmy_person");
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        personLayout.addView(personBarRelativeLayout,params);


        //添加发布按钮
        barRLayout=new RelativeLayout(mContext);
        layoutParams=new RelativeLayout.LayoutParams((int)(mWidth*0.18),(int)(mWidth*0.18));
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        this.addView(barRLayout,layoutParams);

        LinearLayout barContentLayout=new LinearLayout(mContext);
        barContentLayout.setOrientation(LinearLayout.VERTICAL);
        //barContentLayout.setBackgroundColor(Color.YELLOW);

        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        barRLayout.addView(barContentLayout,params);
        //发布
        img_publish=new ImageView(mContext);
        params=new LinearLayout.LayoutParams((int)(marginSize*2.2),(int)(marginSize*2.2));
        img_publish.setBackgroundResource(createDrawable("xmy_add"));
        params.gravity=Gravity.CENTER;
        barContentLayout.addView(img_publish,params);


        text_publish=new TextView(mContext);
        text_publish.setTextSize(16);
        text_publish.setTextColor(Color.rgb(136,132,132));
        text_publish.setText(createString("xmy_publish"));
        text_publish.getPaint().setFakeBoldText(true);
        text_publish.setGravity(Gravity.CENTER);
        params=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        params.topMargin=(int)(marginSize*0.4);
        barContentLayout.addView(text_publish,params);

    }
    public ChildContent getChildContent(){
        return childContent;
    }
    //主页indexLayout
    public LinearLayout getIndexLayout(){
        return indexLayout;
    }

    //药品数据
    public LinearLayout getDrugLayout(){
        return drugLayout;
    }

    //药好找
    public LinearLayout getFindLayout(){
        return findLayout;
    }
    //个人中心
    public LinearLayout getPersonLayout(){
        return personLayout;
    }
}
