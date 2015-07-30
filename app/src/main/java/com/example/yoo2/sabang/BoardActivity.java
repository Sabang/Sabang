package com.example.yoo2.sabang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class BoardActivity extends Activity {

    private String[] boardArray = { "1st", "2nd", "3rd", "4rd", "5", "6", "7" };
    private ListView boardListView;
    private ArrayAdapter arrayAdapter;

    private Button button_main;
    private Button button_setting;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        boardListView = (ListView) findViewById(R.id.boardListView);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, boardArray);
        boardListView.setAdapter(arrayAdapter);

        button_main = (Button) findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toMain = new Intent(BoardActivity.this, MainActivity.class);
                startActivity(toMain);
                finish();
            }
        });
        button_setting = (Button) findViewById(R.id.button_setting);
        button_setting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toSetting = new Intent(BoardActivity.this, SettingActivity.class);
                startActivity(toSetting);
                finish();
            }
        });

    }

}