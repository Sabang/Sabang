package com.example.yoo2.sabang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;


public class LogoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        final Intent intent = new Intent(this,MainActivity.class);

        Handler mHandler = new Handler()
        {
            @Override
        public void handleMessage(Message msg){
                startActivity(intent);
                finish();
            }
        };

        mHandler.sendEmptyMessageDelayed(0, 2000);

    }
}
