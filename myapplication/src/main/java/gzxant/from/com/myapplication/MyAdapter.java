package gzxant.from.com.myapplication;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by antimage on 2016/1/9.
 */
public class MyAdapter extends BaseAdapter {

    private List<Bitmap> bitmapList;
    private Context mContext;

    public MyAdapter(Context context, List<Bitmap> bitmapList) {
        mContext = context;
        if (bitmapList == null) {
            bitmapList = new ArrayList<Bitmap>();
        } else {
            this.bitmapList = bitmapList;
        }
    }

    @Override
    public int getCount() {
        Toast.makeText(mContext,"一共多少张图片:"+bitmapList.size(),Toast.LENGTH_LONG).show();
        return bitmapList.size();
    }

    @Override
    public Object getItem(int position) {
        return bitmapList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;
        View view = null;
        // 此处要用相对布局，且与 XML 中的布局相同；
        // 如果使用线性布局，则显示不完整
        RelativeLayout layout;
        if (convertView == null) {

            convertView = (RelativeLayout) View.inflate(mContext, R.layout.image_item_layout, null);

            viewHolder = new ViewHolder();

            viewHolder.image = (ImageView) convertView.findViewById(R.id.top_image);
            convertView.setTag(viewHolder);
        } else {
//            layout = (RelativeLayout) convertView;
//            view = layout;
            viewHolder = (ViewHolder) convertView.getTag();
            Log.e("MyAdapter", "正在检测数据来了没有  ");
        }
        Bitmap btm = (Bitmap) bitmapList.get(position);
        viewHolder.image.setImageBitmap(btm);

        Log.e("MyAdapter", "信息来了哦！");

        return convertView;
    }

    private static class ViewHolder {
        ImageView image;
    }

}