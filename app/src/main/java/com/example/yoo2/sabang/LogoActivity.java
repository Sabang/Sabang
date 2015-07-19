package com.example.yoo2.sabang;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;


public class LogoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        Handler mHandler = new Handler()
        {
            @Override

        public void handleMessage(Message msg){
                finish();
            }
        };

        mHandler.sendEmptyMessageDelayed(0, 2000);

    }
}
