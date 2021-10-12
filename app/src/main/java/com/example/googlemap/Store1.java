package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Store1 extends AppCompatActivity {

    //TextView image_log;

    ImageButton button_store_order;
    View scroll_store;
    View layout_store_quest;
    ImageButton button_store_quest;
    ImageButton button_store_block;
    ImageButton button_store_N;
    ImageButton button_store_back;


    Button.OnClickListener clickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store1);

        button_store_order = findViewById(R.id.button_store_order);
        scroll_store = findViewById(R.id.scroll_store);
        layout_store_quest = findViewById(R.id.layout_store_quest);
        button_store_quest = findViewById(R.id.button_store_quest);
        button_store_block = findViewById(R.id.button_store_block);
        button_store_N = findViewById(R.id.button_store_N);
        button_store_back = findViewById(R.id.button_store_back);

        clickListener = new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button_store_order:
                        if(scroll_store.getVisibility()==View.VISIBLE){
                            scroll_store.setVisibility(View.GONE);
                            button_store_order.setColorFilter(null);
                        }
                        else{
                            scroll_store.setVisibility(View.VISIBLE);
                            layout_store_quest.setVisibility(View.GONE);
                            button_store_quest.setColorFilter(null);
                            button_store_order.setColorFilter(Color.parseColor("#55ff0000"));
                        }
                        break;
                    case R.id.button_store_quest:
                        if(layout_store_quest.getVisibility()==View.VISIBLE){
                            layout_store_quest.setVisibility(View.GONE);
                            button_store_quest.setColorFilter(null);
                        }
                        else{
                            layout_store_quest.setVisibility(View.VISIBLE);
                            scroll_store.setVisibility(View.GONE);
                            button_store_order.setColorFilter(null);
                            button_store_quest.setColorFilter(Color.parseColor("#55ff0000"));
                        }
                        break;
                    case R.id.button_store_N:
                        if(button_store_N.getColorFilter() != null){
                            button_store_N.setColorFilter(null);
                        }
                        else{
                            button_store_N.setColorFilter(Color.parseColor("#55ff0000"));
                        }
                        break;
                    case R.id.button_store_block:
                        if(button_store_block.getColorFilter() != null){
                            button_store_block.setColorFilter(null);
                        }
                        else{
                            button_store_block.setColorFilter(Color.parseColor("#55ff0000"));
                        }
                        break;
                    case R.id.button_store_back:
                        button_store_back.setColorFilter(Color.parseColor("#55ff0000"));
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                }
            }
        };

        button_store_back.setOnClickListener(clickListener);
        button_store_block.setOnClickListener(clickListener);
        button_store_N.setOnClickListener(clickListener);
        button_store_quest.setOnClickListener(clickListener);
        button_store_order.setOnClickListener(clickListener);



        //image_log = findViewById(R.id.image_log);

        //Intent intent = getIntent();
        //image_log.setText(intent.getStringExtra("select"));
    }
}