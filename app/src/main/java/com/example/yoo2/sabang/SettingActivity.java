package com.example.yoo2.sabang;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SettingActivity extends Activity {


    //메뉴버튼들 구현
    private Button button_main;
    private Button button_board;
    private Button button_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        //메뉴버튼 구현
        button_main = (Button) findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toMain = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(toMain);
            }
        });
        button_board = (Button) findViewById(R.id.button_board);
        button_board.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toBoard = new Intent(SettingActivity.this, BoardActivity.class);
                startActivity(toBoard);
            }
        });
        button_setting = (Button) findViewById(R.id.button_setting);
        button_setting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toSetting = new Intent(SettingActivity.this, SettingActivity.class);
                startActivity(toSetting);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
