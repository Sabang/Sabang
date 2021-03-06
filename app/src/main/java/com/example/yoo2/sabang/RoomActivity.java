package com.example.yoo2.sabang;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class RoomActivity extends Activity implements View.OnTouchListener, OnClickListener {
    ViewFlipper flipper;
    float xAtDown;
    float xAtUp;
    Button listbtn;
    Button button_back;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        flipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        flipper.setOnTouchListener(this);

        listbtn = (Button)findViewById(R.id.button);
        listbtn.setOnClickListener(this);
        // ViewFlipper에 동적으로 child view 추가
        TextView tv = new TextView(this);
        tv.setText("View 4\nDynamically added");
        tv.setTextColor(Color.CYAN);
        flipper.addView(tv);

        button_back = (Button)findViewById(R.id.button);
        button_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toMain = new Intent(RoomActivity.this, MainActivity.class);
                startActivity(toMain);
                finish();
            }
        });
}
    // View.OnTouchListener의 abstract method
    // flipper 터지 이벤트 리스너
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        // 터치 이벤트가 일어난 뷰가 ViewFlipper가 아니면 return
        if(v != flipper) return false;
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            xAtDown = event.getX(); // 터치 시작지점 x좌표 저장
        }
        else if(event.getAction() == MotionEvent.ACTION_UP){
            xAtUp = event.getX();   // 터치 끝난지점 x좌표 저장
            if( xAtUp < xAtDown ) {
                // 왼쪽 방향 에니메이션 지정
                flipper.setInAnimation(AnimationUtils.loadAnimation(this,
                        R.anim.push_left_in));
                flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
                        R.anim.push_left_out));
                // 다음 view 보여줌
                flipper.showNext();
            }
            else if (xAtUp > xAtDown){
                // 오른쪽 방향 에니메이션 지정
                flipper.setInAnimation(AnimationUtils.loadAnimation(this,
                        R.anim.push_right_in));
                flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
                        R.anim.push_right_out));
                // 전 view 보여줌
                flipper.showPrevious();
            }
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
