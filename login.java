package com.zjgsu.linhaoqing.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.id.button2;
import static android.R.id.button2;
import static com.zjgsu.linhaoqing.e_learning.R.id.button2;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
