package com.example.DefineButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.R;

/**
 * Created by ZeroPlus on 2017/7/6.
 */

public class Menu extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);


        imageButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v) {
                Intent intent = new Intent(Menu.this, ChooseBtn.class);
                Bundle bundle = new Bundle();
                bundle.putInt("name", R.drawable.kele);
                intent.putExtras(bundle);
                Menu.this.setResult(1, intent);
                Menu.this.finish();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v) {
                Intent intent = new Intent(Menu.this, ChooseBtn.class);
                Bundle bundle = new Bundle();
                bundle.putInt("name", R.drawable.kele);
                intent.putExtras(bundle);
                Menu.this.setResult(2, intent);
                Menu.this.finish();
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v) {
                Intent intent = new Intent(Menu.this, ChooseBtn.class);
                Bundle bundle = new Bundle();
                bundle.putInt("name", R.drawable.kele);
                intent.putExtras(bundle);
                Menu.this.setResult(3, intent);
                Menu.this.finish();
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v) {
                Intent intent = new Intent(Menu.this, ChooseBtn.class);
                Bundle bundle = new Bundle();
                bundle.putInt("name", R.drawable.kele);
                intent.putExtras(bundle);
                Menu.this.setResult(4, intent);
                Menu.this.finish();
            }
        });

    }
}
