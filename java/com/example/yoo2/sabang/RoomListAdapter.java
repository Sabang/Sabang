package com.example.yoo2.sabang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yoo2 on 15. 7. 23..
 */
public class RoomListAdapter extends BaseAdapter{
    private LayoutInflater inflater;

    private ArrayList<RoomList> data;
    private int layout;

    public RoomListAdapter(Context context, int layout, ArrayList<RoomList> data){
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount(){
        return data.size();
    }

    @Override
    public String getItem(int position){
        return data.get(position).getName();
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = inflater.inflate(layout, parent, false);
        }

        RoomList roomList = data.get(position);

        TextView name = (TextView) convertView.findViewById(R.id.room_name);
        name.setText(roomList.getName());

        return convertView;
    }
}
