package com.from.gzxant.goodmedicine.Adapter;


import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.from.gzxant.goodmedicine.entity.ContentInformationBean;
import com.from.gzxant.goodmedicine.ui.view.AdapterView.TitileContenView;

import java.util.List;

/**
 * Created by USER on 2018/4/3.
 */

public class ContentAdapter extends BaseAdapter {
    private List<ContentInformationBean> userIfons;
    private Context context;
    private boolean flag;
   public  int selectIndex;
    @Override
    public int getCount() {
        return userIfons.size();
    }
    public ContentAdapter(List<ContentInformationBean> _userIfons, Context _context){
        userIfons=_userIfons;
        context=_context;
    }

    @Override
    public Object getItem(int i) {
        return userIfons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ContentInformationBean contentInformationBean=userIfons.get(i);
       final ViewHolder holder ;
        if (convertView == null) {

            holder = new ViewHolder();

            convertView =new TitileContenView(context);
            holder.t_userName = ((TitileContenView) convertView).gettextName();
            holder.t_content=((TitileContenView)convertView).gettextContent();
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.t_userName.setText(contentInformationBean.getName());
        holder.t_content.setText(contentInformationBean.getContent());

//        holder.mContainerLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                holder.mContainerLayout.setBackgroundColor(Color.GRAY);
//            }
//        });
        if( selectIndex == (i+1) ){
            convertView.setBackgroundColor(Color.parseColor("#82eae8"));
        }else{
            convertView.setBackgroundColor(Color.alpha(0));
        }
        return convertView;
    }
    public class ViewHolder {
        private ImageView img_photo;
        public TextView t_userName;
        public TextView t_content;

    }
}
