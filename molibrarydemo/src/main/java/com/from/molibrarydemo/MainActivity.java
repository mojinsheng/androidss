package com.from.molibrarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.from.molibrary.callback.MoCallBcak;
import com.from.molibrary.logUtil.LogUtil;
import com.from.molibrary.okhttp.HttpRequest;
import com.from.molibrary.task.CommandExecute;

public class MainActivity extends AppCompatActivity {
    private Button btn_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_get=(Button)findViewById(R.id.btnget);
        LogUtil.getInstance().isFlag=true;
        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequest  httpRequest=new HttpRequest();
                httpRequest.putValues("auth","a5714aaa3e619efec643817e653dc898");
                httpRequest.putValues("time","2018-01-10 16:02:47");
                httpRequest.putValues("appid","5a1644a7d59f1");
                httpRequest.putValues("app_key","5b14804d8cc14cd52b340a77575fd80a");
                httpRequest.putValues("app_package","com.dsg.deepseagameAdSDK");
                CommandExecute.getinstance().asynExecute(MainActivity.this, httpRequest, new MoCallBcak() {
                    @Override
                    public void success() {
                        LogUtil.getInstance().logI("回调执行成功");
                    }

                    @Override
                    public void fail() {

                    }
                });
            }
        });
    }
}
