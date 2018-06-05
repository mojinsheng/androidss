package com.from.gzxant.goodmedicine.ui.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.from.gzxant.goodmedicine.Adapter.DrugTypeAdapter;
import com.from.gzxant.goodmedicine.Adapter.DrugTypeContentAdapter;
import com.from.gzxant.goodmedicine.entity.DrugTypeBean;
import com.from.gzxant.goodmedicine.entity.DrugTypeContentBean;
import com.from.gzxant.goodmedicine.ui.view.DrugDateView;

import java.util.ArrayList;
import java.util.List;

/**
 * 药品数据fragment
 * Created by USER on 2018/5/28.
 */

public class DrugDateFragment extends BaseFragment {
    private ListView listView,content_listView;
    private DrugDateView drugDateView;
    private  DrugTypeBean drugTypeBean;
    private  DrugTypeAdapter drugTypeAdapter;
    private DrugTypeContentAdapter drugTypeContentAdapter;
    private DrugTypeContentBean drugTypeContentBean;
    private List<DrugTypeContentBean> drugTypeContentList=new ArrayList<>();

    @Override
    protected View getContentView() {
        return drugDateView=new DrugDateView(mContext);
    }

    @Override
    protected void initViews() {
        init();
       listView=drugDateView.getListView();
       content_listView=drugDateView.getContentListView();

        drugTypeAdapter=new DrugTypeAdapter(drugTypeBean.getDrugstrList(),mContext);
        listView.setAdapter(drugTypeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //选中时改变颜色
                drugTypeAdapter.selectIndex=position;
                drugTypeAdapter.notifyDataSetChanged();
            }
        });
        drugTypeContentAdapter=new DrugTypeContentAdapter(drugTypeBean.getDrugList(),mContext);
        content_listView.setDividerHeight(0);
        content_listView.setAdapter(drugTypeContentAdapter);



    }

    @Override
    protected void initDatas() {

    }

    @Override
    protected void initListeners() {

    }
    private void init(){
        drugTypeBean=new DrugTypeBean();
        drugTypeBean.getDrugstrList().add("内科");
        drugTypeBean.getDrugstrList().add("妇科");
        drugTypeBean.getDrugstrList().add("儿科");
        drugTypeBean.getDrugstrList().add("骨科");
        drugTypeBean.getDrugstrList().add("神经外科");
        drugTypeBean.getDrugstrList().add("内科");

        for (int i=0;i<7;i++){
            drugTypeContentBean=new DrugTypeContentBean();
            drugTypeContentBean.setTwoType("辛温解表");
            drugTypeContentBean.getList().add("苏塔林");
            drugTypeContentBean.getList().add("青霉素");
            drugTypeContentBean.getList().add("太上老君仙丹");
            drugTypeContentList.add(drugTypeContentBean);
        }
        drugTypeBean.setDrugList(drugTypeContentList);
        }

}
