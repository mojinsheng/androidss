package com.from.gzxant.goodmedicine.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.loopswitch.AutoSwitchView;
import com.from.gzxant.goodmedicine.ui.base.BaseFindTitleView;
import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;
import com.from.gzxant.goodmedicine.ui.base.CircleRelativeLayout;
import com.from.gzxant.goodmedicine.ui.view.viewpages.BambooFlowViewPager;

/**
 * Created by USER on 2018/5/28.
 */

public class IndexView extends BaseLinearLayout {
    private ScrollView scrollView;
    private LinearLayout scrollLinearLayout;
    private BaseFindTitleView baseFindTitleView;
    private LinearLayout linearLayout;
    private LayoutParams params;
    private HorizontalScrollView myHorizontalView;
    private TextView text_index;
    private  LinearLayout titleContentLinearLayout;
    private AutoSwitchView autoSwitchView;
    private CircleRelativeLayout circleRelativeLayout,merchantsCircle,proxyCircle,payCircle;
    private LinearLayout indexTypeLinearLayout,indexTypeLinearLayout1,indexTypeLinearLayout2;

    private LinearLayout factoryLinearLayout,merchantsLinearLayout,proxyLinearLayout,payLinearLayout;
    private LinearLayout bidLinearLayout,biddingLinearLayout,recruitLinearLayout,activityLinearLayout;
    private CircleRelativeLayout bidRelativeLayout,biddingCircle,recruitCircle,activityCircle;

    private TextView text_factory,text_merchants,text_proxy,text_pay;
    private TextView text_bid,text_bidding,text_recruit,text_activity;

    private LinearLayout recommendLinearLayout,recommendImgLinearLayout;

    private LinearLayout titleLinearLayout;
    private TextView text_t_factory,text_t_hoot,text_t_proxy,text_t_first,text_t_hospital;
    private ListView listView;

    private LinearLayout serviceLinearLayout,serviceLinearLayout1,serviceLinearLayout2;
    private LinearLayout knowledgeLinearLayout,mortgageLinearLayout;
    private LinearLayout knowledgeLinearLayout1,mortgageLinearLayout1;

    private BambooFlowViewPager bambooFlowViewPager;
    public IndexView(Context context) {
        super(context);
        init();
    }
    public void init(){
        this.setBackgroundColor(Color.WHITE);
        this.setOrientation(LinearLayout.VERTICAL);
        baseFindTitleView=new BaseFindTitleView(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*2.5));
        this.addView(baseFindTitleView,params);

        myHorizontalView=new HorizontalScrollView(mContext);
        myHorizontalView.setBackgroundColor(Color.WHITE);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*2));
        this.addView(myHorizontalView,params);

        linearLayout=new LinearLayout(mContext);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        myHorizontalView.addView(linearLayout,params);
        //初始化首页分类
        initTypeText();

        scrollView=new ScrollView(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        this.addView(scrollView,params);

        scrollLinearLayout=new LinearLayout(mContext);
        scrollLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        params.bottomMargin=(int)(marginSize*9);
        scrollView.addView(scrollLinearLayout,params);

        //轮转图
        autoSwitchView=new AutoSwitchView(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.1699));
        scrollLinearLayout.addView(autoSwitchView,params);

        //首页圆图分类
        indexTypeLinearLayout=new LinearLayout(mContext);
        indexTypeLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.24));
        scrollLinearLayout.addView(indexTypeLinearLayout,params);

        //第一排
        indexTypeLinearLayout1=new LinearLayout(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.setMargins(marginSize/4,marginSize/3,marginSize/4,0);
        indexTypeLinearLayout.addView(indexTypeLinearLayout1,params);


        //厂家直招
        factoryLinearLayout=new LinearLayout(mContext);
        factoryLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout1.addView(factoryLinearLayout,params);

        circleRelativeLayout=new CircleRelativeLayout(mContext);
        circleRelativeLayout.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        factoryLinearLayout.addView(circleRelativeLayout,params);

        //厂家直招文字显示
        text_factory=new TextView(mContext);
        text_factory.setText(createString("xmy_text_factory"));
        text_factory.setTextColor(Color.rgb(153,153,153));
        text_factory.getPaint().setFakeBoldText(true);
        text_factory.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        factoryLinearLayout.addView(text_factory,params);

        //招商产品
        merchantsLinearLayout=new LinearLayout(mContext);
        merchantsLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout1.addView(merchantsLinearLayout,params);


        merchantsCircle=new CircleRelativeLayout(mContext);
        merchantsCircle.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        merchantsLinearLayout.addView(merchantsCircle,params);

        //招商产品文字显示
        text_merchants=new TextView(mContext);
        text_merchants.setText(createString("xmy_text_merchants"));
        text_merchants.setTextColor(Color.rgb(153,153,153));
        text_merchants.getPaint().setFakeBoldText(true);
        text_merchants.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        merchantsLinearLayout.addView(text_merchants,params);


        //代理商库
        proxyLinearLayout=new LinearLayout(mContext);
        proxyLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout1.addView(proxyLinearLayout,params);


        proxyCircle=new CircleRelativeLayout(mContext);
        proxyCircle.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        proxyLinearLayout.addView(proxyCircle,params);

        //代理商库文字显示
        text_proxy=new TextView(mContext);
        text_proxy.setText(createString("xmy_text_proxy"));
        text_proxy.setTextColor(Color.rgb(153,153,153));
        text_proxy.getPaint().setFakeBoldText(true);
        text_proxy.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        proxyLinearLayout.addView(text_proxy,params);


        //求购信息
        payLinearLayout=new LinearLayout(mContext);
        payLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout1.addView(payLinearLayout,params);

        payCircle=new CircleRelativeLayout(mContext);
        payCircle.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        payLinearLayout.addView(payCircle,params);

        //求购信息文字显示
        text_pay=new TextView(mContext);
        text_pay.setText(createString("xmy_text_pay"));
        text_pay.setTextColor(Color.rgb(153,153,153));
        text_pay.getPaint().setFakeBoldText(true);
        text_pay.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        payLinearLayout.addView(text_pay,params);





        //第二排
        //bidLinearLayout,biddingLinearLayout,recruitLinearLayout,activityLinearLayout;

        indexTypeLinearLayout2=new LinearLayout(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.setMargins(marginSize/4,marginSize/3,marginSize/4,0);
        indexTypeLinearLayout.addView(indexTypeLinearLayout2,params);

        //招标查询
        bidLinearLayout=new LinearLayout(mContext);
        bidLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout2.addView(bidLinearLayout,params);

        bidRelativeLayout=new CircleRelativeLayout(mContext);
        bidRelativeLayout.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        bidLinearLayout.addView(bidRelativeLayout,params);

        //招标查询文字显示
        text_bid=new TextView(mContext);
        text_bid.setText(createString("xmy_text_bid"));
        text_bid.setTextColor(Color.rgb(153,153,153));
        text_bid.getPaint().setFakeBoldText(true);
        text_bid.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        bidLinearLayout.addView(text_bid,params);

        //招标信息
        biddingLinearLayout=new LinearLayout(mContext);
        biddingLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout2.addView(biddingLinearLayout,params);


        biddingCircle=new CircleRelativeLayout(mContext);
        biddingCircle.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        biddingLinearLayout.addView(biddingCircle,params);

        //招标信息文字显示
        text_bidding=new TextView(mContext);
        text_bidding.setText(createString("xmy_text_bidding"));
        text_bidding.setTextColor(Color.rgb(153,153,153));
        text_bidding.getPaint().setFakeBoldText(true);
        text_bidding.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        biddingLinearLayout.addView(text_bidding,params);


        //招聘信息
        recruitLinearLayout=new LinearLayout(mContext);
        recruitLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout2.addView(recruitLinearLayout,params);


        recruitCircle=new CircleRelativeLayout(mContext);
        recruitCircle.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        recruitLinearLayout.addView(recruitCircle,params);

        //招聘信息文字显示
        text_recruit=new TextView(mContext);
        text_recruit.setText(createString("xmy_text_recruit"));
        text_recruit.setTextColor(Color.rgb(153,153,153));
        text_recruit.getPaint().setFakeBoldText(true);
        text_recruit.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        recruitLinearLayout.addView(text_recruit,params);


        //活动咨询
        activityLinearLayout=new LinearLayout(mContext);
        activityLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        indexTypeLinearLayout2.addView(activityLinearLayout,params);

        activityCircle=new CircleRelativeLayout(mContext);
        activityCircle.setBackgroundColor(Color.WHITE);
        params=new LayoutParams((int)(mWidth*0.1432), (int)(mWidth*0.1432));
        params.gravity=Gravity.CENTER;
        activityLinearLayout.addView(activityCircle,params);

        //活动咨询文字显示
        text_activity=new TextView(mContext);
        text_activity.setText(createString("xmy_text_activity"));
        text_activity.setTextColor(Color.rgb(153,153,153));
        text_activity.getPaint().setFakeBoldText(true);
        text_activity.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        activityLinearLayout.addView(text_activity,params);

        //精品推荐
        recommendLinearLayout=new LinearLayout(mContext);
        recommendLinearLayout.setBackgroundColor(Color.rgb(242,242,242));
        recommendLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*2));
        params.setMargins((int)(marginSize/2),0,(int)(marginSize/2),0);
        scrollLinearLayout.addView(recommendLinearLayout,params);

        View view=new View(mContext);
        view.setBackgroundColor(Color.rgb(206,206,206));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,marginSize/3);
        recommendLinearLayout.addView(view,params);

        TextView text_recommen=new TextView(mContext);
        text_recommen.setText(createString("xmy_text_recommen"));
        text_recommen.setTextColor(Color.rgb(153,153,153));
        text_recommen.getPaint().setFakeBoldText(true);
        text_recommen.setGravity(Gravity.CENTER);
        params=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.MATCH_PARENT);
        recommendLinearLayout.addView(text_recommen,params);

        //推荐商品图片
        recommendImgLinearLayout=new LinearLayout(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.125));
        params.setMargins((int)(marginSize/2),0,(int)(marginSize/2),0);
        scrollLinearLayout.addView(recommendImgLinearLayout,params);

        bambooFlowViewPager=new BambooFlowViewPager(mContext);
        bambooFlowViewPager.setClipChildren(true);
        bambooFlowViewPager.setPadding((int)(mWidth*0.18),0,(int)(mWidth*0.18),0);
        params=new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
//        params.leftMargin=(int)(mWidth*0.18);
//        params.rightMargin=(int)(mWidth*0.18);
        recommendImgLinearLayout.addView(bambooFlowViewPager,params);









        //厂家直销，热门产品，代理信息
        titleLinearLayout=new LinearLayout(mContext);
        titleLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.4));
        params.setMargins((int)(marginSize/2),0,(int)(marginSize/2),0);
        scrollLinearLayout.addView(titleLinearLayout,params);

        titleContentLinearLayout=new LinearLayout(mContext);
        titleContentLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*1.5));
        titleLinearLayout.addView(titleContentLinearLayout,params);

        //TextView text_t_factory,text_t_hoot,text_t_proxy,text_t_first,text_t_hospital;
        text_t_factory=new TextView(mContext);
        text_t_factory.getPaint().setFakeBoldText(true);
        text_t_factory.setGravity(Gravity.CENTER);
        text_t_factory.setTextColor(Color.BLACK);
        text_t_factory.setText("厂家直招");
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        titleContentLinearLayout.addView(text_t_factory,params);

        text_t_hoot=new TextView(mContext);
        text_t_hoot.getPaint().setFakeBoldText(true);
        text_t_hoot.setGravity(Gravity.CENTER);
        text_t_hoot.setTextColor(Color.BLACK);
        text_t_hoot.setText("热门产品");
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        titleContentLinearLayout.addView(text_t_hoot,params);

        text_t_proxy=new TextView(mContext);
        text_t_proxy.getPaint().setFakeBoldText(true);
        text_t_proxy.setGravity(Gravity.CENTER);
        text_t_proxy.setTextColor(Color.BLACK);
        text_t_proxy.setText("代理信息");
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        titleContentLinearLayout.addView(text_t_proxy,params);

        text_t_first=new TextView(mContext);
        text_t_first.getPaint().setFakeBoldText(true);
        text_t_first.setGravity(Gravity.CENTER);
        text_t_first.setTextColor(Color.BLACK);
        text_t_first.setText("急救求购");
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        titleContentLinearLayout.addView(text_t_first,params);

        text_t_hospital=new TextView(mContext);
        text_t_hospital.getPaint().setFakeBoldText(true);
        text_t_hospital.setGravity(Gravity.CENTER);
        text_t_hospital.setTextColor(Color.BLACK);
        text_t_hospital.setText("医药咨询");
        params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1);
        titleContentLinearLayout.addView(text_t_hospital,params);

        View view1=new View(mContext);
        view1.setBackgroundColor(Color.rgb(206,206,206));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,marginSize/5);
        titleLinearLayout.addView(view1,params);


        listView=new ListView(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        titleLinearLayout.addView(listView,params);


        LinearLayout linearLayout=new LinearLayout(mContext);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(marginSize*1.8));
        scrollLinearLayout.addView(linearLayout,params);

        View view2=new View(mContext);
        view2.setBackgroundColor(Color.rgb(206,206,206));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,marginSize/8);
        linearLayout.addView(view2,params);

        LinearLayout moreLinearLayout=new LinearLayout(mContext);
        params=new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,(int)(marginSize*1.4));
        params.topMargin=marginSize/5;
        linearLayout.addView(moreLinearLayout,params);

        TextView text_more=new TextView(mContext);
        text_more.setTextSize(16);
        text_more.getPaint().setFakeBoldText(true);
        text_more.setText("更多");
        text_more.setGravity(Gravity.CENTER);
        text_more.setTextColor(Color.rgb(155,155,155));
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        moreLinearLayout.addView(text_more,params);


        View view3=new View(mContext);
        view3.setBackgroundColor(Color.rgb(206,206,206));
        params=new LayoutParams(LayoutParams.MATCH_PARENT,marginSize/8);
        linearLayout.addView(view3,params);

        serviceLinearLayout=new LinearLayout(mContext);
        serviceLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT,(int)(mHeight*0.1925));
        params.setMargins((int)(marginSize),marginSize/2,(int)(marginSize),0);

        scrollLinearLayout.addView(serviceLinearLayout,params);

        TextView text_service=new TextView(mContext);
        text_service.setTextSize(16);
        text_service.getPaint().setFakeBoldText(true);
        text_service.setText("提供服务");
        text_service.setGravity(Gravity.CENTER);
        text_service.setTextColor(Color.rgb(155,155,155));
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        serviceLinearLayout.addView(text_service,params);

        //知识产权，抵押贷款knowledgeLinearLayout,mortgageLinearLayout,
        serviceLinearLayout1=new LinearLayout(mContext);
        serviceLinearLayout1.setOrientation(LinearLayout.HORIZONTAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.bottomMargin=marginSize/4;
        serviceLinearLayout.addView(serviceLinearLayout1,params);

        knowledgeLinearLayout=new LinearLayout(mContext);
        knowledgeLinearLayout.setBackgroundColor(Color.rgb(204,204,204));
        knowledgeLinearLayout.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.rightMargin=marginSize/4;
        serviceLinearLayout1.addView(knowledgeLinearLayout,params);

        TextView text_knowledge=new TextView(mContext);
        text_knowledge.setTextColor(Color.WHITE);
        text_knowledge.setTextSize(16);
        text_knowledge.getPaint().setFakeBoldText(true);
        text_knowledge.setText("知识产权");
        text_knowledge.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,marginSize/2,marginSize/2,marginSize/4);
        knowledgeLinearLayout.addView(text_knowledge,params);

        TextView text_content=new TextView(mContext);
        text_content.setTextColor(Color.WHITE);
        text_content.setTextSize(12);
        text_content.getPaint().setFakeBoldText(true);
        text_content.setText("知识产权内容");
        text_content.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,0,marginSize/2,0);
        knowledgeLinearLayout.addView(text_content,params);


        mortgageLinearLayout=new LinearLayout(mContext);
        mortgageLinearLayout.setOrientation(LinearLayout.VERTICAL);
        mortgageLinearLayout.setBackgroundColor(Color.rgb(204,204,204));
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.leftMargin=marginSize/4;
        serviceLinearLayout1.addView(mortgageLinearLayout,params);

        TextView text_knowledge1=new TextView(mContext);
        text_knowledge1.setTextSize(16);
        text_knowledge1.setTextColor(Color.WHITE);
        text_knowledge1.getPaint().setFakeBoldText(true);
        text_knowledge1.setText("银行抵押");
        text_knowledge1.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,marginSize/2,marginSize/2,marginSize/4);
        mortgageLinearLayout.addView(text_knowledge1,params);

        TextView text_content1=new TextView(mContext);
        text_content1.setTextColor(Color.WHITE);
        text_content1.setTextSize(12);
        text_content1.getPaint().setFakeBoldText(true);
        text_content1.setText("银行抵押");
        text_content1.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,0,marginSize/2,0);
        mortgageLinearLayout.addView(text_content1,params);

      //knowledgeLinearLayout1,mortgageLinearLayout1;


        serviceLinearLayout2=new LinearLayout(mContext);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.topMargin=marginSize/4;
        serviceLinearLayout.addView(serviceLinearLayout2,params);

        knowledgeLinearLayout1=new LinearLayout(mContext);
        knowledgeLinearLayout1.setBackgroundColor(Color.rgb(204,204,204));
        knowledgeLinearLayout1.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.rightMargin=marginSize/4;
        serviceLinearLayout2.addView(knowledgeLinearLayout1,params);

        TextView text_knowledge3=new TextView(mContext);
        text_knowledge3.setTextColor(Color.WHITE);
        text_knowledge3.setTextSize(16);
        text_knowledge3.getPaint().setFakeBoldText(true);
        text_knowledge3.setText("知识产权1");
        text_knowledge3.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,marginSize/2,marginSize/2,marginSize/4);
        knowledgeLinearLayout1.addView(text_knowledge3,params);

        TextView text_content4=new TextView(mContext);
        text_content4.setTextColor(Color.WHITE);
        text_content4.setTextSize(12);
        text_content4.getPaint().setFakeBoldText(true);
        text_content4.setText("知识产权1内容");
        text_content4.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,0,marginSize/2,0);
        knowledgeLinearLayout1.addView(text_content4,params);





        mortgageLinearLayout1=new LinearLayout(mContext);
        mortgageLinearLayout1.setBackgroundColor(Color.rgb(204,204,204));
        mortgageLinearLayout1.setOrientation(LinearLayout.VERTICAL);
        params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,1);
        params.leftMargin=marginSize/4;
        serviceLinearLayout2.addView(mortgageLinearLayout1,params);

        TextView text_knowledge5=new TextView(mContext);
        text_knowledge5.setTextColor(Color.WHITE);
        text_knowledge5.setTextSize(16);
        text_knowledge5.getPaint().setFakeBoldText(true);
        text_knowledge5.setText("知识产权2");
        text_knowledge5.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,marginSize/2,marginSize/2,marginSize/4);
        mortgageLinearLayout1.addView(text_knowledge5,params);

        TextView text_content6=new TextView(mContext);
        text_content6.setTextColor(Color.WHITE);
        text_content6.setTextSize(12);
        text_content6.getPaint().setFakeBoldText(true);
        text_content6.setText("知识产权2");
        text_content6.setGravity(Gravity.CENTER);
        params=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(marginSize/2,0,marginSize/2,0);
        mortgageLinearLayout1.addView(text_content6,params);


    }
    public void initTypeText(){
        text_index=new TextView(mContext);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("首页");
        text_index.setTextSize(16);
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*3,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);

        text_index=new TextView(mContext);
        text_index.setTextSize(16);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("中标");
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*3,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);

        text_index=new TextView(mContext);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("基药");
        text_index.setTextSize(16);
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*3,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);

        text_index=new TextView(mContext);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("医保");
        text_index.setTextSize(16);
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*3,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);

        text_index=new TextView(mContext);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("医院");
        text_index.setTextSize(16);
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*3,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);

        text_index=new TextView(mContext);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("药店");
        text_index.setTextSize(16);
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*3,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);

        text_index=new TextView(mContext);
        text_index.getPaint().setFakeBoldText(true);
        text_index.setText("第三方终端");
        text_index.setTextSize(16);
        text_index.setGravity(Gravity.CENTER);
        params=new LayoutParams(marginSize*4,LayoutParams.MATCH_PARENT,1);
        linearLayout.addView(text_index,params);
    }
    public AutoSwitchView getAutoSwitchView(){
        return autoSwitchView;
    }
    public CircleRelativeLayout getCircleRelativeLayout(){
        return circleRelativeLayout;
    }
    public CircleRelativeLayout getMerchantsCircle(){
        return merchantsCircle;
    }
    public CircleRelativeLayout getProxyCircle(){
        return proxyCircle;
    }
    public CircleRelativeLayout getPayCircle(){
        return payCircle;
    }
    public CircleRelativeLayout getBidRelativeLayout(){
        return bidRelativeLayout;
    }
    public CircleRelativeLayout getBiddingCircle(){
        return biddingCircle;
    }
    public CircleRelativeLayout getRecruitCircle(){
        return recruitCircle;
    }
    public CircleRelativeLayout getActivityCircle(){
        return activityCircle;
    }
    public ListView getListView(){
        return listView;
    }
    public ScrollView getScrollView(){
        return scrollView;
    }
    public BambooFlowViewPager getBambooFlowViewPager(){
        return bambooFlowViewPager;
    }
}
