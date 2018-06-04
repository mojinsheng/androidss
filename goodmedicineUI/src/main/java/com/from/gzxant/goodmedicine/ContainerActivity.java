package com.from.gzxant.goodmedicine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.from.gzxant.goodmedicine.constant.Constant;
import com.from.gzxant.goodmedicine.ui.fragment.DrugDateFragment;
import com.from.gzxant.goodmedicine.ui.fragment.FindFragment;
import com.from.gzxant.goodmedicine.ui.fragment.IndexFragment;
import com.from.gzxant.goodmedicine.ui.fragment.PersonFragment;
import com.from.gzxant.goodmedicine.ui.fragment.StackFragment;
import com.from.gzxant.goodmedicine.ui.view.ChildContent;
import com.from.gzxant.goodmedicine.ui.view.ContainerView;
import com.from.molibrary.res.EfunResourceUtil;

/**
 * Activity主容器
 * Created by USER on 2018/5/25.
 */

public class ContainerActivity extends FragmentActivity {
    private FragmentManager manager;
    private StackFragment stack;
    private ContainerView containerView;
    private LinearLayout indexLayout,drugLayout,publishLayout,findLayout,personLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        containerView=new ContainerView(this);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager
                        .LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ChildContent TabContent = containerView.getChildContent();
        setContentView(containerView);

        //初始化空间
        initView();

        stack = new StackFragment();
        manager = this.getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(TabContent.getLayoutId(), stack, Constant.FragmentTags.STACK);
        ft.commit();
    }
    //展示首页

    /**
     * 添加子Fragment页面
     * @param fragment
     */
    public void addFragment(Fragment fragment, String tag) {
        FragmentManager fm = ((StackFragment) manager
                .findFragmentByTag(Constant.FragmentTags.STACK)).getChildFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(
                EfunResourceUtil.findAnimIdByName(this, "fragment_enter_go"),
                EfunResourceUtil.findAnimIdByName(this, "fragment_exit_go"),
                EfunResourceUtil.findAnimIdByName(this, "fragment_enter_back"),
                EfunResourceUtil.findAnimIdByName(this, "fragment_exit_back"));
        ft.addToBackStack(null);
        ft.replace(stack.getChildFragment().getLayoutId(), fragment,tag);
        ft.commitAllowingStateLoss();
//		ft.commit();

    }
    /**
     * 添加子Fragment页面
     * @param fragment
     */
    public void addFragment(Fragment fragment,String tag,String values) {
        FragmentManager fm = ((StackFragment) manager
                .findFragmentByTag(Constant.FragmentTags.STACK)).getChildFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("data", values);
        fragment.setArguments(bundle);
        FragmentTransaction ft = fm.beginTransaction();
//		ft.setCustomAnimations(
//				EfunResourceUtil.findAnimIdByName(this, "fragment_enter_go"),
//				EfunResourceUtil.findAnimIdByName(this, "fragment_exit_go"),
//				EfunResourceUtil.findAnimIdByName(this, "fragment_enter_back"),
//				EfunResourceUtil.findAnimIdByName(this, "fragment_exit_back"));
        ft.addToBackStack(null);
        ft.replace(stack.getChildFragment().getLayoutId(), fragment,tag);
        ft.commitAllowingStateLoss();
//		ft.commit();
    }
    public void initView(){
        indexLayout=containerView.getIndexLayout();
        drugLayout=containerView.getDrugLayout();
        findLayout=containerView.getFindLayout();
        personLayout=containerView.getPersonLayout();

        indexLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new IndexFragment(), Constant.FragmentTags.INDEX);
            }
        });

        drugLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new DrugDateFragment(), Constant.FragmentTags.INDEX);
            }
        });

        findLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new FindFragment(), Constant.FragmentTags.INDEX);
            }
        });

        personLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new PersonFragment(), Constant.FragmentTags.INDEX);
            }
        });
    }
}
