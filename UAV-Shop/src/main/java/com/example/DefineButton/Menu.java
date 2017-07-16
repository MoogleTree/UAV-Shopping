package com.example.DefineButton;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.InputStream;
import java.net.URL;

import com.example.R;

/**
 * Created by ZeroPlus on 2017/7/6.
 */

public class Menu extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        final ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);

//        imageButton1.setImageResource(R.drawable.kele);
//        imageButton2.setImageResource(R.drawable.xuebi);
//        imageButton3.setImageResource(R.drawable.fenda);
//        imageButton4.setImageResource(R.drawable.baishi);
        final String urlStr = new String("https://fuss10.elemecdn.com/2/b9/942e257fca7812ce9c0acf95b3e24jpeg.jpeg?imageMogr2/thumbnail/200x200/format/webp/quality/85");

        new Thread() {
            @Override
            public void run () {
                    try {
                        URL url = new URL(urlStr);
                        InputStream is= url.openStream();
                        Bitmap bitmap = BitmapFactory.decodeStream(is);
                        imageButton1.setImageBitmap(bitmap);
                        is.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }.start();


        imageButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v) {
                Intent intent = new Intent(Menu.this, ChooseBtn.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", "https://fuss10.elemecdn.com/0/67/9e1a0e0ec88e7d65811e90829af34jpeg.jpeg?imageMogr2/thumbnail/200x200/format/webp/quality/85");
                bundle.putInt("ItemId",645887762);
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
                bundle.putString("name", "https://fuss10.elemecdn.com/4/81/c83b0b530be44c7c8f671d0342613jpeg.jpeg?imageMogr2/thumbnail/200x200/format/webp/quality/85");
                bundle.putInt("ItemId",646007475);
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
                bundle.putString("name", "https://fuss10.elemecdn.com/f/5d/995fd5fa3b2db14adef2118940a4fjpeg.jpeg?imageMogr2/thumbnail/200x200/format/webp/quality/85");
                bundle.putInt("ItemId",646009104);
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
                bundle.putString("name", "https://fuss10.elemecdn.com/2/b9/942e257fca7812ce9c0acf95b3e24jpeg.jpeg?imageMogr2/thumbnail/200x200/format/webp/quality/85");
                bundle.putInt("ItemId",646046688);
                intent.putExtras(bundle);
                Menu.this.setResult(4, intent);
                Menu.this.finish();
            }
        });

    }
}
