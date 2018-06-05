package com.from.gzxant.goodmedicine.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.from.gzxant.goodmedicine.entity.DrugTypeContentBean;
import com.from.gzxant.goodmedicine.ui.view.AdapterView.DrugTypeContentView;
import com.from.gzxant.goodmedicine.ui.view.AdapterView.DrugTypeView;

import java.util.List;

/**
 * Created by USER on 2018/6/5.
 */

public class DrugTypeContentAdapter extends BaseAdapter {
    public int selectIndex;
    private List<DrugTypeContentBean> list;
    private Context context;
    private View convertView;
    public DrugTypeContentAdapter(List<DrugTypeContentBean> _list, Context _context){
        list=_list;
        context=_context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
       ViewHolder holder ;
        DrugTypeContentBean drugTypeContentBean=list.get(position);
       if (convertView == null) {
            holder = new ViewHolder();
            convertView =new DrugTypeContentView(context);
            holder.typeName = ((DrugTypeContentView) convertView).getTextTYpe();
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.typeName.setText(drugTypeContentBean.getTwoType());

        return convertView;
    }
    public class ViewHolder {
        public TextView typeName;

    }
}
