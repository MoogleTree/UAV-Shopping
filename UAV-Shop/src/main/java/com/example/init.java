package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.R;
import android.content.Intent;

import java.util.Timer;
import java.util.TimerTask;


public class init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);

        final Intent it = new Intent(this, MainMenu.class); //你要转向的Activity
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(it); //执行
            }
        };
        timer.schedule(task, 1000 * 3); //10秒后
    }
}
