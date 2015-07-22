package com.example.yoo2.sabang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    int optionToggle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this,LogoActivity.class));

        Button btn = (Button) findViewById(R.id.room_option_btn);

        final TextView textView = (TextView) findViewById(R.id.room_option);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(optionToggle == 0){
                    textView.setVisibility(View.VISIBLE);
                    textView.bringToFront();
                    textView.invalidate();
                    optionToggle = 1;
                }
                else if(optionToggle == 1){
                    textView.setVisibility(View.INVISIBLE);
                    optionToggle = 0;
                }
            }
        });

        ListView listView = (ListView) findViewById(R.id.room_list);

        ArrayList<RoomList> data = new ArrayList<>();
        RoomList room1 = new RoomList("방1");
        RoomList room2 = new RoomList("방2");
        RoomList room3 = new RoomList("방3");
        RoomList room4 = new RoomList("방4");
        RoomList room5 = new RoomList("방5");

        data.add(room1);
        data.add(room2);
        data.add(room3);
        data.add(room4);
        data.add(room5);

        RoomListAdapter adapter = new RoomListAdapter(this, R.layout.room_list, data);
        listView.setAdapter(adapter);
    }
}
