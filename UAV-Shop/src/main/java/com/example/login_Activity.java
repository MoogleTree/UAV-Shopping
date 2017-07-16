package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.session.Session;

public class login_Activity extends AppCompatActivity {

    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    session= Session.getInstance();
                    session.login(1, new Session.LoginCallback(){
                        @Override
                        public void callback(boolean success, String reason) {
                            Intent intent = new Intent(login_Activity.this, init.class);
                            startActivity(intent);
                        }
                    });
            }
        });
    }
}
