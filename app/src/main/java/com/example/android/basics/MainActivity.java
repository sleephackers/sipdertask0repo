package com.example.android.basics;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random;
    int netvalue = 0;
    TextView textView;
    TextView netprice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.value);
        netprice = (TextView) findViewById(R.id.price);
        final Button pricegen = (Button) findViewById(R.id.buttonpg);
        pricegen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random = (int) (Math.random() * 100);
                textView.setText("₹" + random);
                netvalue = 0;
                netprice.setText("NET PRICE: ₹" + netvalue);
                LinearLayout root = (LinearLayout) findViewById(R.id.root);
                root.setBackgroundColor(Color.parseColor("#F44336"));

            }
        });
        final Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (netvalue == random) ;
                else {
                    netvalue += 1;
                netprice.setText("NET PRICE: ₹" + netvalue);
                    check();
                }

            }
        });
        final Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (netvalue == random) ;
                else {
                    netvalue += 2;
                    netprice.setText("NET PRICE: ₹" + netvalue);
                    check();
                }
            }
        });
        final Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (netvalue == random) ;
                else {
                    netvalue += 5;
                    netprice.setText("NET PRICE: ₹" + netvalue);
                    check();
                }
            }
        });
        final Button ten = (Button) findViewById(R.id.button10);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (netvalue == random) ;
                else {
                    netvalue += 10;
                    netprice.setText("NET PRICE: ₹" + netvalue);
                    check();
                }
            }
        });
        final Button reset = (Button) findViewById(R.id.buttonr);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                netvalue = 0;
                netprice.setText("NET PRICE: ₹" + netvalue);
                LinearLayout root = (LinearLayout) findViewById(R.id.root);
                root.setBackgroundColor(Color.parseColor("#F44336"));


            }
        });

    }

    /*
    CHECKS IF THE NET VALUE IS REACHED
     */
    public void check() {
        if (netvalue == random) {
            LinearLayout root = (LinearLayout) findViewById(R.id.root);
            root.setBackgroundColor(Color.parseColor("#76FF03"));

        } else {
            LinearLayout root = (LinearLayout) findViewById(R.id.root);
            root.setBackgroundColor(Color.parseColor("#F44336"));


        }

    }


}
