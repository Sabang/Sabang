package com.example.yoo2.sabang;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class BoardActivity extends Activity {

    private String[] boardArray = { "1st", "2nd", "3rd", "4rd", "5", "6", "7" };
    private ListView boardListView;
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        boardListView = (ListView) findViewById(R.id.boardListView);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, boardArray);
        boardListView.setAdapter(arrayAdapter);
    }

}
