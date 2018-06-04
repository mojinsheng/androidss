package gzxant.from.com.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    private ImageView mImageView;
    private MyHorizontalView myHorizontalView;
    private List<Bitmap> bitmapList;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // init();
    }
    private void init() {
       // mImageView = (ImageView)findViewById(R.id.imageView);

        bitmapList = new ArrayList<>(Arrays.asList(
                readBitMap(this, R.drawable.bg_01),
                readBitMap(this, R.drawable.bg_02),
                readBitMap(this, R.drawable.bg_03),
                readBitMap(this, R.drawable.bg_04),
                readBitMap(this, R.drawable.bg_05),
                readBitMap(this, R.drawable.bg_06),
                readBitMap(this, R.drawable.bg_07)


        ));

       // myHorizontalView = (MyHorizontalView)findViewById(R.id.my_horizontal);
        adapter = new MyAdapter(this, bitmapList);

        //设置适配器
        myHorizontalView.initDatas(adapter);

        //添加滚动回调
        myHorizontalView
                .setCurrentImageChangeListener(new MyHorizontalView.CurrentImageChangeListener() {
                    @Override
                    public void onCurrentImgChanged(int position, View viewIndicator) {
                        Log.e("==============","===============    " + position);
                        mImageView.setImageBitmap(bitmapList.get(position));
                        viewIndicator.setBackgroundColor(Color.parseColor("#AA024DA4"));
                    }
                });

        //添加点击回调
        myHorizontalView.setOnItemClickListener(new MyHorizontalView.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                mImageView.setImageBitmap(bitmapList.get(position));
                view.setBackgroundColor(Color.parseColor("#AA024DA4"));
            }
        });
    }

    public static Bitmap readBitMap(Context mContext, int resId) {
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        opt.inPurgeable = true;
        opt.inInputShareable = true;

        InputStream is = mContext.getResources().openRawResource(resId);
        return BitmapFactory.decodeStream(is, null, opt);
    }
}
