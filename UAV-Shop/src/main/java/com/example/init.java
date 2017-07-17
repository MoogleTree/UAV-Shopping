package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.R;
import android.content.Intent;
import com.example.ShoppingChart.shoppingchart_MainActivity;

import java.util.Timer;
import java.util.TimerTask;


public class init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish(); //执行
            }
        };
        timer.schedule(task, 1000 * 3); //10秒后
    }
}
