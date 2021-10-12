package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Mypage extends AppCompatActivity {

    EditText input_id;
    EditText input_pass;

    ImageButton button_login;
    ImageButton button_add;
    ImageButton button_company;
    ImageButton button_back;
    ImageButton button_order;
    ImageButton button_mypage_example;
    ImageButton button_mypage_order_v;
    ImageButton button_mypage_quest_v;
    ImageButton button_mypage_block_v;
    ImageButton button_mypage_n_v;

    ImageButton button_mypage_orderinfo;
    ImageButton button_mypage_product;

    ImageButton button_mypage_companyadd;
    ImageButton button_mypage_add2;


    TextView text_mypage_store;
    TextView text_mypage_menu;
    TextView text_mypage_ingre;
    TextView text_mypage_num;

    Button.OnClickListener clickListener;
    View layer_login;
    View layout_mypage_order;
    View layout_mypage_signupcompany;
    View layout_mypage_company;
    View layout_mypage_production;


    String id_log = "Hello";
    String text_server_store = "땡이네 소곱창";
    String text_server_menu = "소곱창";
    String text_server_ingre = "곱창, 고추장, 고추";
    String text_server_num = "100근, 10g, 2개";

    boolean order=false, quest=false, block=false, n=false;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        input_id = findViewById(R.id.input_id);
        input_pass = findViewById(R.id.input_pass);
        button_login = findViewById(R.id.button_login);
        button_add = findViewById(R.id.button_add);
        button_company = findViewById(R.id.button_company);
        button_back = findViewById(R.id.button_back);
        button_order = findViewById(R.id.button_order);

        button_mypage_orderinfo = findViewById(R.id.button_mypage_orderinfo);
        button_mypage_product = findViewById(R.id.button_mypage_product);

        button_mypage_example = findViewById(R.id.button_mypage_example);
        button_mypage_order_v = findViewById(R.id.button_mypage_order_v);
        button_mypage_quest_v = findViewById(R.id.button_mypage_quest_v);
        button_mypage_n_v = findViewById(R.id.button_mypage_n_v);
        button_mypage_block_v = findViewById(R.id.button_mypage_block_v);
        button_mypage_companyadd = findViewById(R.id.button_mypage_companyadd);
        button_mypage_add2 = findViewById(R.id.button_mypage_add2);


        layout_mypage_order = findViewById(R.id.layout_mypage_order);
        layout_mypage_company = findViewById(R.id.layout_mypage_company);
        text_mypage_store = findViewById(R.id.text_mypage_store);
        text_mypage_ingre = findViewById(R.id.text_mypage_ingre);
        text_mypage_menu = findViewById(R.id.text_mypage_menu);
        text_mypage_num = findViewById(R.id.text_mypage_num);

        layer_login = findViewById(R.id.layout_mypage_login);
        layout_mypage_production = findViewById(R.id.layout_mypage_production);
        layout_mypage_signupcompany = findViewById(R.id.layout_mypage_signupcompany);


        clickListener = new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button_login:
                        //if(id_log.equals(input_id.getText().toString())){
                            layer_login.setVisibility(View.GONE);
                       // }
                       // else{
                       //     Toast.makeText(getApplicationContext(), "나가주세요", Toast.LENGTH_SHORT).show();
                       // }
                        break;
                    case R.id.button_company:
                        if(layer_login.getVisibility()==View.GONE){
                            layout_mypage_company.setVisibility(View.VISIBLE);
                        }
                        break;
                    case R.id.button_back:
                        button_back.setColorFilter(Color.parseColor("#55ff0000"));
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                    case R.id.button_order:
                        button_order.setColorFilter(Color.parseColor("#55ff0000"));
                        layout_mypage_order.setVisibility(View.VISIBLE);
                        break;
                    case R.id.button_mypage_example:
                        text_mypage_store.setText("너 바보야?");
                        text_mypage_menu.setText(text_server_menu);
                        text_mypage_ingre.setText(text_server_ingre);
                        text_mypage_num.setText(text_server_num);
                        break;




                    case R.id.button_mypage_order_v:
                        if(order==false){
                            order = true;
                            button_mypage_order_v.setImageResource(R.drawable.mypage_order);
                        }
                        else{
                            order = false;
                            button_mypage_order_v.setImageResource(R.drawable.mypage_order0);
                        }
                        break;
                    case R.id.button_mypage_quest_v:_v:
                        if(quest==false){
                            quest = true;
                            button_mypage_quest_v.setImageResource(R.drawable.mypage_quest);
                        }
                        else{
                            quest = false;
                            button_mypage_quest_v.setImageResource(R.drawable.mypage_quest0);
                        }
                        break;
                    case R.id.button_mypage_n_v:
                        if(n==false){
                            n = true;
                            button_mypage_n_v.setImageResource(R.drawable.mypage_n1);
                        }
                        else{
                            n = false;
                            button_mypage_n_v.setImageResource(R.drawable.mypage_n0);
                        }
                        break;
                    case R.id.button_mypage_block_v:
                        if(block==false){
                            block = true;
                            button_mypage_block_v.setImageResource(R.drawable.mypage_block);
                        }
                        else{
                            block = false;
                            button_mypage_block_v.setImageResource(R.drawable.mypage_block0);
                        }
                        break;


                    case R.id.button_mypage_companyadd:
                        layout_mypage_signupcompany.setVisibility(View.GONE);
                        break;
                    case R.id.button_mypage_add2:
                        layout_mypage_signupcompany.setVisibility(View.VISIBLE);
                        break;

                    case R.id.button_mypage_product:
                        layout_mypage_production.setVisibility(View.VISIBLE);
                        break;
                }

            }
        };

        button_mypage_example.setOnClickListener(clickListener);
        button_order.setOnClickListener(clickListener);
        button_back.setOnClickListener(clickListener);
        button_login.setOnClickListener(clickListener);
        button_add.setOnClickListener(clickListener);
        button_company.setOnClickListener(clickListener);

        button_mypage_product.setOnClickListener(clickListener);
        button_mypage_orderinfo.setOnClickListener(clickListener);

        button_mypage_order_v.setOnClickListener(clickListener);
        button_mypage_quest_v.setOnClickListener(clickListener);
        button_mypage_n_v.setOnClickListener(clickListener);
        button_mypage_block_v.setOnClickListener(clickListener);

        button_mypage_companyadd.setOnClickListener(clickListener);
        button_mypage_add2.setOnClickListener(clickListener);



    }
}