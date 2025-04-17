package com.example.bookdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CseSubContent extends AppCompatActivity {
    Button back_btn;
    CardView cse_networking,cse_os,cse_cProgramming,cse_android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_sub_content);
        back_btn=findViewById(R.id.back_btn);
        cse_networking=findViewById(R.id.cse_computerNetworking);
        cse_cProgramming=findViewById(R.id.cse_cProgramming);
        cse_android=findViewById(R.id.cse_androidStudio);
        cse_os=findViewById(R.id.cse_os);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CseSubContent.this,SubjectList.class);
                startActivity(intent);
            }
        });

        cse_networking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(CseSubContent.this,CseComputerNetworking.class);
                startActivity(intent1);
            }
        });

        cse_cProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(CseSubContent.this,CProgramming.class);
                startActivity(intent2);
            }
        });

        cse_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(CseSubContent.this, CseAndroidStudio.class);
                startActivity(intent3);
            }
        });

        cse_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(CseSubContent.this, CseOS.class);
                startActivity(intent4);
            }
        });
    }
}