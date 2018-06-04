package com.from.gzxant.goodmedicine.ui.fragment;

import android.view.View;

import com.from.gzxant.goodmedicine.ui.base.BaseLinearLayout;
import com.from.gzxant.goodmedicine.ui.view.FindDrugVie;

/**
 * 药好找fragment
 * Created by USER on 2018/5/28.
 */

public class FindFragment extends BaseFragment {
    @Override
    protected View getContentView() {
        return new FindDrugVie(mContext);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initDatas() {

    }

    @Override
    protected void initListeners() {

    }
}
