package com.from.gzxant.goodmedicine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.from.gzxant.goodmedicine.loopswitch.AutoSwitchAdapter;
import com.from.gzxant.goodmedicine.loopswitch.AutoSwitchView;
import com.from.gzxant.goodmedicine.loopswitch.LoopModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnget).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ContainerActivity.class);
                startActivity(intent);
            }
        });

    }
}
