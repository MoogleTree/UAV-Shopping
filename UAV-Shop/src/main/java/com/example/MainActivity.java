package com.example;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.widget.RadioGroup;

import com.example.ShoppingChart.shoppingchart_MainActivity;
import com.example.session.Session;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;

    public class MyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle bundle=intent.getExtras();
            show(bundle.getString("data"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Session session = Session.getInstance();
        if (!session.logined()) {
            startActivity(new Intent().setClass(this, login_Activity.class));
        }

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("userId", 1);
        intent.putExtras(bundle);
        intent.setClass(this, PullService.class);
        Log.v("Service1", "1234");
        startService(intent);

        BroadcastReceiver receiver=new MyReceiver();
        IntentFilter filter=new IntentFilter();
        filter.addAction("com.example.PullService");
        this.registerReceiver(receiver,filter);

        fragmentManager = getFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.rg_tab);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragment fragment = FragmentFactory.getInstanceByIndex(checkedId);
                transaction.replace(R.id.content, fragment);
                transaction.commit();
            }
        });

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = FragmentFactory.getInstanceByIndex(1);
        transaction.replace(R.id.content, fragment);
        transaction.commit();
    }


    private int s2meteor = 0;

    private void show(String data) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(android.R.drawable.sym_def_app_icon);
        builder.setTicker("S2Meteor");
        builder.setContentTitle(data);
        builder.setContentText("点击进入app查看详细内容");
        builder.setWhen(System.currentTimeMillis());
        Notification note = builder.build();
        NotificationManager mgr = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Intent intent=new Intent(this, MainActivity.class);
        PendingIntent pendingIntent= PendingIntent.getActivity(this, 0, intent, 0);
        builder.setContentIntent(pendingIntent);//点击后的意图
        note.defaults = Notification.DEFAULT_ALL;
        mgr.notify(s2meteor++, note);
    }
}
