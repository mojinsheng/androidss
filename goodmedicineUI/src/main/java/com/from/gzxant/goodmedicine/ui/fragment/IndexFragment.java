package com.from.gzxant.goodmedicine.ui.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.from.gzxant.goodmedicine.Adapter.ContentAdapter;
import com.from.gzxant.goodmedicine.R;
import com.from.gzxant.goodmedicine.entity.ContentInformationBean;
import com.from.gzxant.goodmedicine.loopswitch.AutoSwitchAdapter;
import com.from.gzxant.goodmedicine.loopswitch.AutoSwitchView;
import com.from.gzxant.goodmedicine.loopswitch.LoopModel;
import com.from.gzxant.goodmedicine.ui.base.CircleRelativeLayout;
import com.from.gzxant.goodmedicine.ui.view.IndexView;
import com.from.gzxant.goodmedicine.ui.view.viewpages.BambooFlowViewPager;
import com.from.gzxant.goodmedicine.ui.view.viewpages.ClipView;
import com.from.gzxant.goodmedicine.ui.view.viewpages.FixedSpeedScroller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *首页fragment
 * Created by USER on 2018/5/28.
 */

public class IndexFragment extends BaseFragment {
    private List<ContentInformationBean> contentList=new ArrayList<>();
    private IndexView indexView=null;
    private AutoSwitchView autoSwitchView;
    private CircleRelativeLayout circleRelativeLayout,merchantsCircle,proxyCircle,payCircle;
    private CircleRelativeLayout bidRelativeLayout,biddingCircle,recruitCircle,activityCircle;
    private ListView listView;
    //Arrays.asList("首页","中标",
     //       "基药","医保","医院","药店")
    private List<String> textmapList=new ArrayList<String>();
    private AutoSwitchAdapter mAdapter;
    private ContentAdapter contentAdapter;
    private ScrollView scrollView;
    BambooFlowViewPager fvp_pagers;
    private Handler handler;
    int[] imgIds = {
            R.drawable.img_005,
            R.drawable.img_001,
            R.drawable.img_002,
            R.drawable.img_003,
            R.drawable.img_004,
            R.drawable.img_005,
            R.drawable.img_001
    };
    HashMap<Integer, ClipView> imageViewList = new HashMap<>();
    @Override
    protected View getContentView() {
        return indexView=new IndexView(mContext);
    }

    @Override
    protected void initViews() {

        autoSwitchView=indexView.getAutoSwitchView();
        circleRelativeLayout=indexView.getCircleRelativeLayout();
        merchantsCircle=indexView.getMerchantsCircle();
        proxyCircle=indexView.getProxyCircle();
        payCircle=indexView.getPayCircle();
        bidRelativeLayout=indexView.getBidRelativeLayout();
        biddingCircle=indexView.getBiddingCircle();
        recruitCircle=indexView.getRecruitCircle();
        activityCircle=indexView.getActivityCircle();
        scrollView=indexView.getScrollView();
        List<LoopModel> datas = new ArrayList<LoopModel>();
        LoopModel model = null;
        init();
        model = new LoopModel("第一张", R.drawable.loop_1);
        datas.add(model);
        model = new LoopModel("第二张", R.drawable.loop_2);
        datas.add(model);
        model = new LoopModel("第三张", R.drawable.loop_3);
        datas.add(model);
        model = new LoopModel("第四张", R.drawable.loop_4);
        datas.add(model);
        mAdapter = new AutoSwitchAdapter(mContext.getApplicationContext(), datas);
        autoSwitchView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        //精品推荐
        fvp_pagers=indexView.getBambooFlowViewPager();

        fvp_pagers.setAdapter(pagerAdapter);

        // 设置ViewPager的缓存页数，因为demo没有做缓存，所以为了方便就这么搞了，页数不多的时候可以把这里设置为总页数
        fvp_pagers.setOffscreenPageLimit(imgIds.length);
        fvp_pagers.setCurrentItem(3);

        //设置滚动切换的动画时间
        fvp_pagers.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            int currentPosition;

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // ViewPager.SCROLL_STATE_IDLE 标识的状态是当前页面完全展现，并且没有动画正在进行中，如果不
                // 是此状态下执行 setCurrentItem 方法回在首位替换的时候会出现跳动！
                if (state != ViewPager.SCROLL_STATE_IDLE) return;

                // 当视图在第一个时，将页面号设置为图片的最后一张。
                if (currentPosition == 0) {
                    fvp_pagers.setCurrentItem(imgIds.length - 2, false);

                } else if (currentPosition == imgIds.length - 1) {
                    // 当视图在最后一个是,将页面号设置为图片的第一张。
                    fvp_pagers.setCurrentItem(1, false);
                }
            }
        });
        try{
            FixedSpeedScroller scroller;
            Field field = ViewPager.class.getDeclaredField("mScroller");
            field.setAccessible(true);
            scroller = new FixedSpeedScroller(mContext);
            scroller.setmDuration(1000);
            field.set(fvp_pagers, scroller);
            handler = new Handler();
            handler.postDelayed(new TimerRunnable(),2500);
        }catch (Exception e){
            e.printStackTrace();
        }






        circleRelativeLayout.setColor(getResources().getColor(R.color.colorAccent));
        circleRelativeLayout.setAlhpa(160);

        merchantsCircle.setColor(getResources().getColor(R.color.colorAccent));
        merchantsCircle.setAlhpa(160);

        proxyCircle.setColor(getResources().getColor(R.color.colorAccent));
        proxyCircle.setAlhpa(160);

        payCircle.setColor(getResources().getColor(R.color.colorAccent));
        payCircle.setAlhpa(160);

        bidRelativeLayout.setColor(getResources().getColor(R.color.colorAccent));
        bidRelativeLayout.setAlhpa(160);

        biddingCircle.setColor(getResources().getColor(R.color.colorAccent));
        biddingCircle.setAlhpa(160);

        recruitCircle.setColor(getResources().getColor(R.color.colorAccent));
        recruitCircle.setAlhpa(160);

        activityCircle.setColor(getResources().getColor(R.color.colorAccent));
        activityCircle.setAlhpa(160);


        listView=indexView.getListView();

        contentAdapter=new ContentAdapter(contentList,mContext);
        listView.setAdapter(contentAdapter);
        listView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    scrollView.requestDisallowInterceptTouchEvent(false);
                } else {
                    // 请求父类不要拦截这个事件或者直接让ScrollView不拦截这个事件，下面的两行代码一样
                    // lv.getParent().getParent().requestDisallowInterceptTouchEvent(true);
                    scrollView.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });


    }

    @Override
    protected void initDatas() {

    }

    @Override
    protected void initListeners() {

    }
    public void init() {
        ContentInformationBean userIfon = new ContentInformationBean();
        userIfon.setName("产品名称");
        userIfon.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon);

        ContentInformationBean userIfon1 = new ContentInformationBean();
        userIfon1.setName("产品名称");
        userIfon1.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon1);

        ContentInformationBean userIfon2 = new ContentInformationBean();
        userIfon2.setName("产品名称");
        userIfon2.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon2);

        ContentInformationBean userIfon3 = new ContentInformationBean();
        userIfon3.setName("产品名称");
        userIfon3.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon3);

        ContentInformationBean userIfon4 = new ContentInformationBean();
        userIfon4.setName("产品名称");
        userIfon4.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon4);

        ContentInformationBean userIfon5 = new ContentInformationBean();
        userIfon5.setName("产品名称");
        userIfon5.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon5);

        ContentInformationBean userIfon6 = new ContentInformationBean();
        userIfon6.setName("产品名称");
        userIfon6.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon6);

        ContentInformationBean userIfon7 = new ContentInformationBean();
        userIfon7.setName("产品名称");
        userIfon7.setContent("产品功效,效果如何，是不是很吊");
        contentList.add(userIfon7);
    }
    private PagerAdapter pagerAdapter = new PagerAdapter() {
        @Override
        public int getCount() {
            return imgIds.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
        //        @Override
//        public float getPageWidth(int position) {
//            return 0.33333f;
//        }
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ClipView clipView;
            if (imageViewList.containsKey(position)) {
                clipView = imageViewList.get(position);
            } else {
//                ImageView imageView = new ImageView(container.getContext());
//                imageView.setBackgroundColor(imgIds[position]);
//                imageView.setAdjustViewBounds(false);
//                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//                clipView = new ClipView(container.getContext());
//                clipView.setId(position + 1);
//                clipView.addView(imageView);
//                imageViewList.put(position, clipView);

                ImageView imageView = new ImageView(container.getContext());
                imageView.setImageResource(imgIds[position]);
                imageView.setAdjustViewBounds(false);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                clipView = new ClipView(container.getContext());
                clipView.setId(position + 1);
                clipView.addView(imageView);
                imageViewList.put(position, clipView);
            }
            container.addView(clipView);
            clipView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "v.getId " + v.getId(), Toast.LENGTH_LONG).show();
                }
            });
            return clipView;
        }
    };
    class TimerRunnable implements Runnable{

        @Override
        public void run() {
            int curItem = fvp_pagers.getCurrentItem();
            fvp_pagers.setCurrentItem(curItem+1);
            if (handler!=null){
                handler.postDelayed(this,5000);
            }
        }
    }
}
