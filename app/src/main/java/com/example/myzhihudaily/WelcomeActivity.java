package com.example.myzhihudaily;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {
    ImageView welcomePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);

        welcomePicture=(ImageView)findViewById(R.id.welcome);
        Animation ami= AnimationUtils.loadAnimation(this,R.anim.enlarge);
        ami.setFillAfter(true);
        welcomePicture.startAnimation(ami);

        //3s后执行以下的线程
        //与代码顺序无关，启动该程序后的2s就会自动执行handler.postDelayed()方法
        Integer time=3000;
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomeActivity.this, NewsListActivity.class));
                WelcomeActivity.this.finish();
            }
        },time);

    }
}
