package com.example.DefineButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.R;
import com.example.ShoppingChart.shoppingchart_MainActivity;
import com.example.session.Session;


public class ChooseBtn extends Activity {
    public int[] itemIDs = new  int[6];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.choosebtn);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);

        ImageView img1 = (ImageView) findViewById(R.id.imageView);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        ImageView img4 = (ImageView) findViewById(R.id.imageView4);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);

        img1.setImageResource(R.drawable.baishi);
        img2.setImageResource(R.drawable.baishi);
        img3.setImageResource(R.drawable.baishi);
        img4.setImageResource(R.drawable.baishi);
        img5.setImageResource(R.drawable.baishi);
        img6.setImageResource(R.drawable.baishi);


        for (int i=0;i<6;i++){
            itemIDs[i]=1;
        }

        final Session session = Session.getInstance();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(ChooseBtn.this, Menu.class);
                startActivityForResult(intent,1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(ChooseBtn.this, Menu.class);
                startActivityForResult(intent,2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(ChooseBtn.this, Menu.class);
                startActivityForResult(intent,3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(ChooseBtn.this, Menu.class);
                startActivityForResult(intent,4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(ChooseBtn.this, Menu.class);
                startActivityForResult(intent,5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent = new Intent(ChooseBtn.this, Menu.class);
                startActivityForResult(intent,6);
            }
        });

        Button makesure = (Button) findViewById(R.id.makesure);
        makesure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    session.setButton(itemIDs, new Session.SetButtonCallback() {
                        @Override
                        public void callback(boolean success, String reason) {
                            Intent intent = new Intent(ChooseBtn.this, shoppingchart_MainActivity.class);
                            startActivity(intent);
                        }
                    });
                } catch (Session.ButtonArrayException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        Bundle bundle = data.getExtras();
        int name = bundle.getInt("name");
        int itemId = bundle.getInt("ItemId");


        ImageView img1 = (ImageView) findViewById(R.id.imageView);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        ImageView img4 = (ImageView) findViewById(R.id.imageView4);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);



        switch(requestCode){
            case 1:
                img1.setImageResource(name);
                itemIDs[0] = itemId;
                break;
            case 2:
                img2.setImageResource(name);
                itemIDs[1] = itemId;
                break;
            case 3:
                img3.setImageResource(name);
                itemIDs[2] = itemId;
                break;
            case 4:
                img4.setImageResource(name);
                itemIDs[3] = itemId;
                break;
            case 5:
                img5.setImageResource(name);
                itemIDs[4] = itemId;
                break;
            case 6:
                img6.setImageResource(name);
                itemIDs[5] = itemId;
                break;

        }

    }
}
