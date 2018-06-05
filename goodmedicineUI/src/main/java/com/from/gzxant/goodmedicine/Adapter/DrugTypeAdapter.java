package com.from.gzxant.goodmedicine.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.from.gzxant.goodmedicine.ui.view.AdapterView.DrugTypeView;
import com.from.gzxant.goodmedicine.ui.view.AdapterView.TitileContenView;
import com.from.gzxant.goodmedicine.ui.view.DrugDateView;

import java.util.List;

/**
 * Created by USER on 2018/6/5.
 */

public class DrugTypeAdapter extends BaseAdapter {
    public int selectIndex;
    private List<String> list;
    private Context context;
    private View convertView;
    public DrugTypeAdapter(List<String> _list,Context _context){
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
    public View getView(final int position, View _convertView, ViewGroup parent) {
       final ViewHolder holder ;
        convertView=_convertView;
       if (convertView == null) {
            holder = new ViewHolder();
            convertView =new DrugTypeView(context);
            holder.text_type = ((DrugTypeView) convertView).getTextTYpe();
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (position==0){
            convertView.setBackgroundColor(Color.WHITE);
        }
        holder.text_type.setText(list.get(position));
        if(selectIndex == position ){
            convertView.setBackgroundColor(Color.WHITE);
        }else{
            convertView.setBackgroundColor(Color.rgb(222,222,222));
        }

        return convertView;
    }
    public class ViewHolder {
        public TextView text_type;

    }
}
