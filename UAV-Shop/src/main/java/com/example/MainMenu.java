package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.ShoppingChart.shoppingchart_MainActivity;
import com.example.DefineButton.ChooseBtn;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button ordering = (Button) findViewById(R.id.ordering);
        Button ordered =(Button) findViewById(R.id.ordered);
        Button MyButton = (Button) findViewById(R.id.MyButton);

        ordering.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, shoppingchart_MainActivity.class);
                startActivity(intent);
            }
        });

        ordered.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, shoppingchart_MainActivity.class);
                startActivity(intent);
            }
        });

        MyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, ChooseBtn.class);
                startActivity(intent);
            }
        });

    }
}
