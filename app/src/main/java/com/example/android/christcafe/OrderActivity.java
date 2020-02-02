package com.example.android.christcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        Intent intent = getIntent();
        String message = "Order:" + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv = findViewById(R.id.order_text_view);
        tv.setText(message);
    }


}
